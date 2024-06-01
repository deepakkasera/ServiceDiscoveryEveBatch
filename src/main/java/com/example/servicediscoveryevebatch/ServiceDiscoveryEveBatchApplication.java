package com.example.servicediscoveryevebatch;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

@SpringBootApplication
@EnableEurekaServer
public class ServiceDiscoveryEveBatchApplication {

    public static void main(String[] args) {
        SpringApplication.run(ServiceDiscoveryEveBatchApplication.class, args);
    }

}
