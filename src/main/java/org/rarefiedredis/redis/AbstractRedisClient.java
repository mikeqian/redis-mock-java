package org.rarefiedredis.redis;

import java.util.Map;
import java.util.HashMap;
import java.util.List;
import java.util.ArrayList;
import java.util.Set;
import java.util.SortedSet;
import java.util.Date;

import org.rarefiedredis.redis.IRedisSortedSet.ZsetPair;

public abstract class AbstractRedisClient implements IRedisClient {

    public AbstractRedisClient() {
    }

     public void close() {
    }

    /* IRedisKeys commands */

     public Long del(String ... keys) throws NotImplementedException {
        throw new NotImplementedException();
    }

     public String dump(String key) throws NotImplementedException {
        throw new NotImplementedException();
    }

     public Boolean exists(String key) throws NotImplementedException {
        throw new NotImplementedException();
    }

     public Boolean expire(String key, int seconds) throws NotImplementedException {
        throw new NotImplementedException();
    }

     public Boolean expireat(String key, long timestamp) throws NotImplementedException {
        throw new NotImplementedException();
    }

     public String[] keys(String pattern) throws NotImplementedException {
        throw new NotImplementedException();
    }

     public String migrate(String host, int port, String key, String destination_db, int timeout, String ... options) throws NotImplementedException {
        throw new NotImplementedException();
    }

     public Long move(String key, int db) throws NotImplementedException {
        throw new NotImplementedException();
    }

     public Object object(String subcommand, String ... arguments) throws NotImplementedException {
        throw new NotImplementedException();
    }

     public Boolean persist(String key) throws NotImplementedException {
        throw new NotImplementedException();
    }

     public Boolean pexpire(String key, long milliseconds) throws NotImplementedException {
        throw new NotImplementedException();
    }

     public Boolean pexpireat(String key, long timestamp) throws NotImplementedException {
        throw new NotImplementedException();
    }

     public Long pttl(String key) throws NotImplementedException {
        throw new NotImplementedException();
    }

     public String randomkey() throws NotImplementedException {
        throw new NotImplementedException();
    }

     public String rename(String key, String newkey) throws NotImplementedException {
        throw new NotImplementedException();
    }

     public Boolean renamenx(String key, String newkey) throws NotImplementedException {
        throw new NotImplementedException();
    }

     public String restore(String key, int ttl, String serialized_valued) throws NotImplementedException {
        throw new NotImplementedException();
    }

     public String[] sort(String key, String ... options) throws NotImplementedException {
        throw new NotImplementedException();
    }

     public Long ttl(String key) throws NotImplementedException {
        throw new NotImplementedException();
    }

     public String type(String key) throws NotImplementedException {
        throw new NotImplementedException();
    }

     public String[] scan(int cursor) throws NotImplementedException {
        throw new NotImplementedException();
    }

    /* IRedisString commands */

     public Long append(String key, String value) throws WrongTypeException, NotImplementedException {
        throw new NotImplementedException();
    }

     public Long bitcount(String key, long ... options) throws WrongTypeException, NotImplementedException {
        throw new NotImplementedException();
    }

     public Long bitop(String operation, String destkey, String ... keys) throws WrongTypeException, NotImplementedException {
        throw new NotImplementedException();
    }

     public Long bitpos(String key, long bit, long ... options) throws WrongTypeException, BitArgException, NotImplementedException {
        throw new NotImplementedException();
    }

     public Long decr(String key) throws WrongTypeException, NotIntegerException, NotImplementedException {
        throw new NotImplementedException();
    }

     public Long decrby(String key, long decrement) throws WrongTypeException, NotIntegerException, NotImplementedException {
        throw new NotImplementedException();
    }

     public String get(String key) throws WrongTypeException, NotImplementedException {
        throw new NotImplementedException();
    }

     public Boolean getbit(String key, long offset) throws WrongTypeException, NotImplementedException {
        throw new NotImplementedException();
    }

     public String getrange(String key, long start, long end) throws WrongTypeException, NotImplementedException {
        throw new NotImplementedException();
    }

     public String getset(String key, String value) throws WrongTypeException, NotImplementedException {
        throw new NotImplementedException();
    }

     public Long incr(String key) throws WrongTypeException, NotIntegerException, NotImplementedException {
        throw new NotImplementedException();
    }

     public Long incrby(String key, long increment) throws WrongTypeException, NotIntegerException, NotImplementedException {
        throw new NotImplementedException();
    }

     public String incrbyfloat(String key, double increment) throws WrongTypeException, NotFloatException, NotImplementedException {
        throw new NotImplementedException();
    }

     public String[] mget(String ... keys) throws NotImplementedException {
        throw new NotImplementedException();
    }

     public String mset(String ... keyvalues) throws ArgException, NotImplementedException {
        throw new NotImplementedException();
    }

     public Boolean msetnx(String ... keyvalues) throws ArgException, NotImplementedException {
        throw new NotImplementedException();
    }

     public String psetex(String key, long milliseconds, String value) throws NotImplementedException {
        throw new NotImplementedException();
    }

     public String set(String key, String value, String ... options) throws NotImplementedException, SyntaxErrorException {
        throw new NotImplementedException();
    }

     public Long setbit(String key, long offset, boolean value) throws WrongTypeException, NotImplementedException {
        throw new NotImplementedException();
    }

     public String setex(String key, int seconds, String value) throws NotImplementedException {
        throw new NotImplementedException();
    }

     public Long setnx(String key, String value) throws NotImplementedException {
        throw new NotImplementedException();
    }

     public Long setrange(String key, long offset, String value) throws WrongTypeException, NotImplementedException {
        throw new NotImplementedException();
    }

     public Long strlen(String key) throws WrongTypeException, NotImplementedException {
        throw new NotImplementedException();
    }

    /* IRedisList commands */

     public String lindex(String key, long index) throws WrongTypeException, NotImplementedException {
        throw new NotImplementedException();
    }

     public Long linsert(String key, String before_after, String pivot, String value) throws WrongTypeException, NotImplementedException {
        throw new NotImplementedException();
    }

     public Long llen(String key) throws WrongTypeException, NotImplementedException {
        throw new NotImplementedException();
    }

     public String lpop(String key) throws WrongTypeException, NotImplementedException {
        throw new NotImplementedException();
    }

     public Long lpush(String key, String element, String ... elements) throws WrongTypeException, NotImplementedException {
        throw new NotImplementedException();
    }

     public Long lpushx(String key, String element) throws WrongTypeException, NotImplementedException {
        throw new NotImplementedException();
    }

     public List<String> lrange(String key, long start, long end) throws WrongTypeException, NotImplementedException {
        throw new NotImplementedException();
    }

     public Long lrem(String key, long count, String element) throws WrongTypeException, NotImplementedException {
        throw new NotImplementedException();
    }

     public String lset(String key, long index, String element) throws WrongTypeException, NoKeyException, IndexOutOfRangeException, NotImplementedException {
        throw new NotImplementedException();
    }

     public String ltrim(String key, long start, long end) throws WrongTypeException, NotImplementedException {
        throw new NotImplementedException();
    }

     public String rpop(String key) throws WrongTypeException, NotImplementedException {
        throw new NotImplementedException();
    }

     public String rpoplpush(String source, String dest) throws WrongTypeException, NotImplementedException {
        throw new NotImplementedException();
    }

     public Long rpush(String key, String element, String ... elements) throws WrongTypeException, NotImplementedException {
        throw new NotImplementedException();
    }

     public Long rpushx(String key, String element) throws WrongTypeException, NotImplementedException {
        throw new NotImplementedException();
    }

    /* IRedisSetCommands */

     public Long sadd(String key, String member, String ... members) throws WrongTypeException, NotImplementedException {
        throw new NotImplementedException();
    }

     public Long scard(String key) throws WrongTypeException, NotImplementedException {
        throw new NotImplementedException();
    }

     public Set<String> sdiff(String key, String ... keys) throws WrongTypeException, NotImplementedException {
        throw new NotImplementedException();
    }

     public Long sdiffstore(String destination, String key, String ... keys) throws WrongTypeException, NotImplementedException {
        throw new NotImplementedException();
    }

     public Set<String> sinter(String key, String ... keys)  throws WrongTypeException, NotImplementedException {
        throw new NotImplementedException();
    }

     public Long sinterstore(String destination, String key, String ... keys) throws WrongTypeException, NotImplementedException {
        throw new NotImplementedException();
    }

     public Boolean sismember(String key, String member) throws WrongTypeException, NotImplementedException {
        throw new NotImplementedException();
    }

     public Set<String> smembers(String key) throws WrongTypeException, NotImplementedException {
        throw new NotImplementedException();
    }

     public Boolean smove(String source, String dest, String member) throws WrongTypeException, NotImplementedException {
        throw new NotImplementedException();
    }

     public String spop(String key) throws WrongTypeException, NotImplementedException {
        throw new NotImplementedException();
    }

     public String srandmember(String key) throws WrongTypeException, NotImplementedException {
        throw new NotImplementedException();
    }

     public List<String> srandmember(String key, long count) throws WrongTypeException, NotImplementedException {
        throw new NotImplementedException();
    }

     public Long srem(String key, String member, String ... members) throws WrongTypeException, NotImplementedException {
        throw new NotImplementedException();
    }

     public Set<String> sunion(String key, String ... keys) throws WrongTypeException, NotImplementedException {
        throw new NotImplementedException();
    }

     public Long sunionstore(String destination, String key, String ... keys) throws WrongTypeException, NotImplementedException {
        throw new NotImplementedException();
    }

     public ScanResult<Set<String>> sscan(String key, long cursor, String ... options) throws WrongTypeException, NotImplementedException {
        throw new NotImplementedException();
    }

    /* IRedisHash commands */

     public Long hdel(String key, String field, String ... fields) throws WrongTypeException, NotImplementedException {
        throw new NotImplementedException();
    }

     public Boolean hexists(String key, String field) throws WrongTypeException, NotImplementedException {
        throw new NotImplementedException();
    }

     public String hget(String key, String field) throws WrongTypeException, NotImplementedException {
        throw new NotImplementedException();
    }

     public Map<String, String> hgetall(String key) throws WrongTypeException, NotImplementedException {
        throw new NotImplementedException();
    }

     public Long hincrby(String key, String field, long increment) throws WrongTypeException, NotIntegerHashException, NotImplementedException {
        throw new NotImplementedException();
    }

     public String hincrbyfloat(String key, String field, double increment) throws WrongTypeException, NotFloatHashException, NotImplementedException {
        throw new NotImplementedException();
    }

     public Set<String> hkeys(String key) throws WrongTypeException, NotImplementedException {
        throw new NotImplementedException();
    }

     public Long hlen(String key) throws WrongTypeException, NotImplementedException {
        throw new NotImplementedException();
    }

     public List<String> hmget(String key, String field, String ... fields) throws WrongTypeException, NotImplementedException {
        throw new NotImplementedException();
    }

     public String hmset(String key, String field, String value, String ... fieldsvalues) throws WrongTypeException, ArgException, NotImplementedException {
        throw new NotImplementedException();
    }

     public Boolean hset(String key, String field, String value) throws WrongTypeException, NotImplementedException {
        throw new NotImplementedException();
    }

     public Boolean hsetnx(String key, String field, String value) throws WrongTypeException, NotImplementedException {
        throw new NotImplementedException();
    }

     public Long hstrlen(String key, String field) throws WrongTypeException, NotImplementedException {
        throw new NotImplementedException();
    }

     public List<String> hvals(String key) throws WrongTypeException, NotImplementedException {
        throw new NotImplementedException();
    }

     public ScanResult<Map<String, String>> hscan(String key, long cursor, String ... options) throws WrongTypeException, NotImplementedException {
        throw new NotImplementedException();
    }

    /* IRedisTransaction commands */

     public String discard() throws DiscardWithoutMultiException, NotImplementedException {
        throw new NotImplementedException();
    }

     public List<Object> exec() throws ExecWithoutMultiException, NotImplementedException {
        throw new NotImplementedException();
    }

     public IRedisClient multi() throws NotImplementedException {
        throw new NotImplementedException();
    }

     public String unwatch() throws NotImplementedException {
        throw new NotImplementedException();
    }

     public String watch(String key) throws NotImplementedException {
        throw new NotImplementedException();
    }

    /* IRedisSortedSet commands */

     public Long zadd(String key, ZsetPair scoremember, ZsetPair ... scoresmembers) throws WrongTypeException, NotImplementedException{
        throw new NotImplementedException();
    }

     public Long zadd(String key, double score, String member, Object ... scoresmembers) throws WrongTypeException, NotImplementedException, SyntaxErrorException, NotFloatException {
        throw new NotImplementedException();
    }

     public Long zcard(String key) throws WrongTypeException, NotImplementedException{
        throw new NotImplementedException();
    }

     public Long zcount(String key, double min, double max) throws WrongTypeException, NotImplementedException{
        throw new NotImplementedException();
    }

     public String zincrby(String key, double increment, String member) throws WrongTypeException, NotImplementedException {
        throw new NotImplementedException();
    }

     public Long zinterstore(String destination, int numkeys, String ... options) throws WrongTypeException, SyntaxErrorException, NotImplementedException {
        throw new NotImplementedException();
    }

     public Long zlexcount(String key, String min, String max) throws WrongTypeException, NotValidStringRangeItemException, NotImplementedException {
        throw new NotImplementedException();
    }

     public Set<ZsetPair> zrange(String key, long start, long stop, String ... options) throws WrongTypeException, NotImplementedException {
        throw new NotImplementedException();
    }

     public Set<ZsetPair> zrangebylex(String key, String min, String max, String ... options) throws WrongTypeException, NotValidStringRangeItemException, NotImplementedException {
        throw new NotImplementedException();
    }

     public Set<ZsetPair> zrevrangebylex(String key, String max, String min, String ... options) throws WrongTypeException, NotValidStringRangeItemException, NotImplementedException {
        throw new NotImplementedException();
    }

     public Set<ZsetPair> zrangebyscore(String key, String min, String max, String ... options) throws WrongTypeException, NotFloatMinMaxException, NotIntegerException, SyntaxErrorException, NotImplementedException {
        throw new NotImplementedException();
    }

     public Long zrank(String key, String member) throws WrongTypeException, NotImplementedException {
        throw new NotImplementedException();
    }

     public Long zrem(String key, String member, String ... members) throws WrongTypeException, NotImplementedException {
        throw new NotImplementedException();
    }

     public Long zremrangebylex(String key, String min, String max) throws WrongTypeException, NotValidStringRangeItemException, NotImplementedException {
        throw new NotImplementedException();
    }

     public Long zremrangebyrank(String key, long start, long stop) throws WrongTypeException, NotImplementedException {
        throw new NotImplementedException();
    }

     public Long zremrangebyscore(String key, String min, String max) throws WrongTypeException, NotFloatMinMaxException, NotImplementedException {
        throw new NotImplementedException();
    }

     public Set<ZsetPair> zrevrange(String key, long start, long stop, String ... options) throws WrongTypeException, NotImplementedException{
        throw new NotImplementedException();
    }

     public Set<ZsetPair> zrevrangebyscore(String key, String max, String min, String ... options) throws WrongTypeException, NotFloatMinMaxException, NotIntegerException, SyntaxErrorException, NotImplementedException {
        throw new NotImplementedException();
    }

     public Long zrevrank(String key, String member) throws WrongTypeException, NotImplementedException{
        throw new NotImplementedException();
    }

     public Double zscore(String key, String member) throws WrongTypeException, NotImplementedException{
        throw new NotImplementedException();
    }

     public Long zunionstore(String destination, int numkeys, String ... options) throws WrongTypeException, SyntaxErrorException, NotImplementedException {
        throw new NotImplementedException();
    }

     public ScanResult<Set<ZsetPair>> zscan(String key, long cursor, String ... options) throws WrongTypeException, NotImplementedException{
        throw new NotImplementedException();
    }

}
