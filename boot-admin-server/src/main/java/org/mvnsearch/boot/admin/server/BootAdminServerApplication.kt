package org.mvnsearch.boot.admin.server

import de.codecentric.boot.admin.server.config.EnableAdminServer
import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication
import org.springframework.cloud.client.discovery.EnableDiscoveryClient

@SpringBootApplication
@EnableAdminServer
@EnableDiscoveryClient
class BootAdminServerApplication

fun main(args: Array<String>) {
    runApplication<BootAdminServerApplication>(*args)
}

