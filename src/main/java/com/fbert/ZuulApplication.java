package com.fbert;


import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.netflix.feign.EnableFeignClients;
import org.springframework.cloud.netflix.zuul.EnableZuulProxy;
import org.springframework.web.bind.annotation.RestController;
/**
 * 
 * @author 唐维
 *
 */
@SpringBootApplication
@EnableZuulProxy
@EnableDiscoveryClient
@RestController
@EnableFeignClients
public class ZuulApplication {
	 
	public static void main(String[] args) {
		SpringApplication.run(ZuulApplication.class, args);
	}
}
