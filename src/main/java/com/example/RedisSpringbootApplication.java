package com.example;

import com.example.entity.User;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;
import org.springframework.context.annotation.Bean;
import org.springframework.data.redis.connection.jedis.JedisConnectionFactory;
import org.springframework.data.redis.core.RedisTemplate;

@SpringBootApplication(exclude = {DataSourceAutoConfiguration.class })
public class RedisSpringbootApplication {

	public static void main(String[] args) {
		SpringApplication.run(RedisSpringbootApplication.class, args);
	}

//	@Bean
//	JedisConnectionFactory jedisConnectionFactory() {
//		return new JedisConnectionFactory();
//	}
//
//	@Bean
//	RedisTemplate<String, User> redisTemplate() {
//		RedisTemplate<String,User> redisTemplate = new RedisTemplate<>();
//			redisTemplate.setConnectionFactory(jedisConnectionFactory());
//			return redisTemplate;
//		}
	}


