package org.mvnsearch

import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication
import org.springframework.cloud.gateway.route.builder.RouteLocatorBuilder
import org.springframework.cloud.gateway.route.builder.filters
import org.springframework.cloud.gateway.route.builder.routes
import org.springframework.context.annotation.Bean


@SpringBootApplication
open class CloudGatewayApp {
    @Bean
    open fun additionalRouteLocator(builder: RouteLocatorBuilder) = builder.routes {
        route(id = "test-kotlin") {
            host("kotlin.abc.org")
            path("/httpbin/**")
            filters {
                stripPrefix(1)
            }
            uri("http://httpbin.org")
        }
    }
}

fun main(args: Array<String>) {
    runApplication<CloudGatewayApp>(*args)
}