package org.yeahicode.springcloud;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

@EnableDiscoveryClient
@SpringBootApplication
public class SentinelProviderPaymentMain9003 {
    public static void main(String[] args) {
        SpringApplication.run(SentinelProviderPaymentMain9003.class, args);
    }
}