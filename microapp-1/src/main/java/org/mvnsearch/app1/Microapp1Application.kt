package org.mvnsearch.app1

import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication
import org.springframework.cloud.client.discovery.EnableDiscoveryClient

@SpringBootApplication
@EnableDiscoveryClient
class Microapp1Application

fun main(args: Array<String>) {
    runApplication<Microapp1Application>(*args)
}
