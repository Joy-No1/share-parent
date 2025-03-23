package com.share.sharedevice;

import com.share.common.security.annotation.EnableCustomConfig;
import com.share.common.security.annotation.EnableRyFeignClients;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.data.redis.core.RedisTemplate;

@EnableCustomConfig
@EnableRyFeignClients
@SpringBootApplication
public class ShareDeviceApplication {

	public static void main(String[] args) {
		SpringApplication.run(ShareDeviceApplication.class, args);
	}


	@Bean
	public RedisTemplate redisTemplate() {
		return new RedisTemplate<>();
	}
}
