package com.loofer.config;


import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.data.redis.connection.jedis.JedisConnectionFactory;
import org.springframework.session.data.redis.config.annotation.web.http.EnableRedisHttpSession;

@Configuration
/**
 * 通过加上@EnableRedisHttpSession注解，开启redis集中式session管理，所有的session都存放到了redis中
 * maxInactiveIntervalInSeconds 配置session 失效时间
 */
@EnableRedisHttpSession(maxInactiveIntervalInSeconds = 60)
public class RedisSessionConfig {

    /**
     * 配置实用Jedis 连接池的方式 连接Redis服务（默认就是使用的這种方式，所以可以不配）
     * @return
     */
    @Bean
    public JedisConnectionFactory connectionFactory() {
        return new JedisConnectionFactory();
    }

}
