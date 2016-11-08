package org.rarefiedredis.redis;

import java.util.Map;
import java.util.HashMap;

public final class RedisHashCache implements IRedisCache<String, Map<String, String>> {

    private Map<String, Map<String, String>> cache;

    public RedisHashCache() {
        cache = new HashMap<String, Map<String, String>>();
    }

    public Boolean exists(String key) {
        return cache.containsKey(key);
    }

    public void remove(String key) {
        cache.remove(key);
    }

    public void set(String key, String field, Object... arguments) {
        String value = (String) arguments[0];
        if (!cache.containsKey(key)) {
            cache.put(key, new HashMap<String, String>());
        }
        cache.get(key).put(field, value);
    }

    public Map<String, String> get(String key) {
        return cache.get(key);
    }

    public Boolean removeValue(String key, String field) {
        if (!exists(key)) {
            return false;
        }
        if (cache.get(key).containsKey(field)) {
            cache.get(key).remove(field);
            return true;
        }
        return false;
    }

    public String type() {
        return "hash";
    }

}
