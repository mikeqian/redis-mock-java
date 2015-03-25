package org.rarefiedredis.redis;

public final class DiscardWithoutMultiException extends Exception {
    
    public DiscardWithoutMultiException() {
        super("ERR DISCARD without MULTI");
    }
}
