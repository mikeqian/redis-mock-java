package org.rarefiedredis.redis;

import java.util.Map;
import java.util.HashMap;
import java.util.Set;
import java.util.SortedSet;
import java.util.TreeSet;
import java.util.Comparator;

/**
 * Cache key-value-score triples as a sorted set.
 */
public final class RedisSortedSetCache implements IRedisCache<String, Set<String>> {

    /**
     * The sorted set of members.
     */
    private Map<String, SortedSet<String>> cache;
    /**
     * The map of members to their scores.
     */
    private Map<String, Map<String, Double>> scores;

    /**
     * Constructor. Initializes an empty cache.
     */
    public RedisSortedSetCache() {
        cache = new HashMap<String, SortedSet<String>>();
        scores = new HashMap<String, Map<String, Double>>();
    }

    public Boolean exists(final String key) {
        return cache.containsKey(key);
    }

    public Boolean existsValue(final String key, final String value) {
        return exists(key) && cache.get(key).contains(value);
    }

    public void remove(final String key) {
        cache.remove(key);
        scores.remove(key);
    }

    public void set(final String key, final String value, final Object... arguments) {
        if (!cache.containsKey(key)) {
            cache.put(key, new TreeSet<String>(new Comparator<String>() {
                public int compare(String a, String b) {
                    Double aScore = scores.get(key).get(a);
                    Double bScore = scores.get(key).get(b);
                    if (aScore == null && bScore == null) {
                        return 0;
                    }
                    if (aScore == null && bScore != null) {
                        return 1;
                    }
                    if (aScore != null && bScore == null) {
                        return -1;
                    }
                    if (aScore < bScore) {
                        return -1;
                    }
                    if (aScore > bScore) {
                        return 1;
                    }
                    return a.compareTo(b);
                }
            }));
            scores.put(key, new HashMap<String, Double>());
        }
        Double score = (Double) arguments[0];
        // The order of operations is important here.
        scores.get(key).put(value, score);
        cache.get(key).add(value);
    }

    public Set<String> get(final String key) {
        return cache.get(key);
    }

    public Double getScore(final String key, final String value) {
        if (!scores.containsKey(key)) {
            return null;
        }
        return scores.get(key).get(value);
    }

    public Boolean removeValue(final String key, final String value) {
        if (!cache.containsKey(key)) {
            return false;
        }
        // The order of operations is important here.
        boolean rem = cache.get(key).remove(value);
        scores.get(key).remove(value);
        return rem;
    }

    public String type() {
        return "zset";
    }

}
