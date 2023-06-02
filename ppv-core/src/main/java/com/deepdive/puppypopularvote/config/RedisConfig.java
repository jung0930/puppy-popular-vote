package com.deepdive.puppypopularvote.config;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.data.redis.connection.RedisConnectionFactory;
import org.springframework.data.redis.connection.lettuce.LettuceConnectionFactory;

@Configuration
// @EnableRedisRepositories(basePackages = {"com.wjthinkbig.integ.*.repository.redis"})
public class RedisConfig {

    @Value("${spring.datasource.redis.host}")
    private String host;

    @Value("${spring.datasource.redis.port}")
    private int port;

    @Bean
    public RedisConnectionFactory redisConnectionFactory() {
        return new LettuceConnectionFactory(host, port);
    }

}
