package com.wen.nacosorder

import org.springframework.boot.SpringApplication
import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.cloud.client.discovery.EnableDiscoveryClient

@SpringBootApplication
@EnableDiscoveryClient
class NacosorderApplication {

    static void main(String[] args) {
        SpringApplication.run(NacosorderApplication, args)
    }

}
