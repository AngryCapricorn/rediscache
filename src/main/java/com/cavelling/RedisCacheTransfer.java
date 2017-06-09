package com.cavelling;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.redis.connection.jedis.JedisConnectionFactory;
import org.springframework.stereotype.Component;

import com.cavelling.cache.RedisCache;

@Component
public class RedisCacheTransfer {
	
	 @Autowired
	    public void setJedisConnectionFactory(JedisConnectionFactory jedisConnectionFactory) {
	        RedisCache.setJedisConnectionFactory(jedisConnectionFactory);
	    }
}
