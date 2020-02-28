package com.engine.foodfunengine.Dao;


import com.engine.foodfunengine.Server.TestService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.redis.core.RedisTemplate;
import org.springframework.stereotype.Service;
@Service
public class TestDao implements TestService {
	@Autowired
	private RedisTemplate redisTemplate;

	@Override
	public String test() {
		Boolean existKey=redisTemplate.hasKey("foodfunEngine");
		System.out.println(existKey);
		return null;
	}
}
