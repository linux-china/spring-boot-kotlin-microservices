package org.mvnsearch.app2;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

@SpringBootApplication
@EnableDiscoveryClient
public class Micro2Application {

    public static void main(String[] args) {
        SpringApplication.run(Micro2Application.class, args);
    }
}
