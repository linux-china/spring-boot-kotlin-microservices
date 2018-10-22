package org.mvnsearch

import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication
import org.springframework.cloud.openfeign.EnableFeignClients


@SpringBootApplication
@EnableFeignClients
class CloudOpenFeignApp

fun main(args: Array<String>) {
    runApplication<CloudOpenFeignApp>(*args)
}