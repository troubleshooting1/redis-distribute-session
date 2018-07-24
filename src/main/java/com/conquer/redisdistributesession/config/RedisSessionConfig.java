package com.conquer.redisdistributesession.config;

import org.springframework.context.annotation.Configuration;
import org.springframework.session.data.redis.config.annotation.web.http.EnableRedisHttpSession;

/**
 * Description:
 * author: chenqiang
 * date: 2018/7/12 10:19
 */
@Configuration
@EnableRedisHttpSession
public class RedisSessionConfig {
}
