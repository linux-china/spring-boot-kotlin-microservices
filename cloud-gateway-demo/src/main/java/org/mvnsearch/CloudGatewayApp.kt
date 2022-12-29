package org.mvnsearch

import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication
import org.springframework.cloud.gateway.route.builder.RouteLocatorBuilder
import org.springframework.context.annotation.Bean


@SpringBootApplication
open class CloudGatewayApp {
    @Bean
    open fun additionalRouteLocator(builder: RouteLocatorBuilder) = builder.routes()
        .route { p ->
            p.path("/httpbin/**")
                .filters { f ->
                    f.addRequestHeader("Hello", "World");
                    f.stripPrefix(1)
                }
                .uri("http://httpbin.org:80")
        }
        .build()
}

fun main(args: Array<String>) {
    runApplication<CloudGatewayApp>(*args)
}