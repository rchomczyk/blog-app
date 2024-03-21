package moe.rafal.blog.posts;

import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.openfeign.EnableFeignClients;
import org.springframework.context.annotation.Configuration;

@EnableDiscoveryClient
@EnableFeignClients
@Configuration
class PostsConfiguration {}
