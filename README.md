Spring Boot MicroServices with Kotlin
=====================================

Spring Boot 2.0.X MicroServices with Kotlin

### environment

please install Java 8 JCE: http://www.oracle.com/technetwork/java/javase/downloads/jce8-download-2133166.html

### Services

* Config Server
* Registry Server with Consul
* Spring Boot Admin Server
* Spring Cloud DataFlow Server
* Spring Cloud Skipper Ser
* Spring Cloud Gateway
* Spring-Fu
* SideCar proxy with Envoy

### Tech stack

* Kotlin Coroutine
* Reactive Web
* RSocket

### How to start services

* Start Consul from docker-compose.yml
* Start Config Server（integrated with eureka)
* Start Spring Boot Admin (integrated with eureka)

### Maven plugins

* maven-compiler-plugin: 1.8 compile
* spring-boot-maven-plugin: build-info
* git-commit-id-plugin: git full mode

### Spring Cloud Consul

#### Startup

* docker-compose up -d
* visit http://localhost:8500/ui/ for Consul
* visit http://localhost:9411/zipkin/ for Zipkin

#### Consul Configuration

Consul Key/Value支持的Spring config Server目录结构如下：

    config/testApp,dev/
    config/testApp/
    config/application,dev/
    config/application/

接下来就是在这些目录下创建对应的Key/Value。

* MicroServices with Consul: https://www.infoq.com/articles/Microservices-SpringBoot

# Tools

* Redis
* Consul
* NATS
* MySQL

### Reference

* What's New In Kotlin 1.3： https://todd.ginsberg.com/post/kotlin-1.3-features/
* Kotlin support in Spring 5.0: https://docs.spring.io/spring/docs/current/spring-framework-reference/languages.html#kotlin
* Spring Cloud: http://cloud.spring.io/spring-cloud-static/Finchley.RELEASE/single/spring-cloud.html
* Spring Cloud Consul: http://cloud.spring.io/spring-cloud-consul/
* Spring Cloud ZooKeeper: http://cloud.spring.io/spring-cloud-zookeeper/spring-cloud-zookeeper.html
* Spring Cloud CLI Launcher: https://spring.io/blog/2016/11/02/introducing-the-spring-cloud-cli-launcher
