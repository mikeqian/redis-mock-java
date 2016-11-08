package org.rarefiedredis.redis;

import java.util.Map;
import java.util.HashMap;

/**
 * Cache key-value pairs as strings.
 */
public final class RedisStringCache implements IRedisCache<String, String> {

    /**
     * Holds the actual cache.
     */
    private Map<String, String> cache;

    /**
     * Constructor. Initializes an empty cache.
     */
    public RedisStringCache() {
        cache = new HashMap<String, String>();
    }

    public Boolean exists(final String key) {
        return cache.containsKey(key);
    }

    public void remove(final String key) {
        cache.remove(key);
    }

    public void set(final String key, final String value, final Object... arguments) {
        cache.put(key, value);
    }

    public String get(final String key) {
        return cache.get(key);
    }

    public Boolean removeValue(final String key, final String value) {
        if (!exists(key)) {
            return false;
        }
        if (cache.get(key).equals(value)) {
            remove(key);
            return true;
        }
        return false;
    }

    public String type() {
        return "string";
    }
}
