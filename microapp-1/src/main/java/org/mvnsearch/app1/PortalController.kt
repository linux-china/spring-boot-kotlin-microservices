package org.mvnsearch.app1

import org.springframework.beans.factory.annotation.Value
import org.springframework.cloud.context.config.annotation.RefreshScope
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.RestController

/**
 * portal controller
 *
 * @author linux_china
 */
@RestController
@RefreshScope
class PortalController {
    @Value("\${developer:'jacky'}")
    private val nick: String? = null

    @GetMapping("/")
    fun index(): String {
        return "hello" + nick!!
    }

    @GetMapping("/welcome")
    fun welcome(): String {
        return "welcome"
    }
}
