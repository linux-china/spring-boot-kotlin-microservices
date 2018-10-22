package org.mvnsearch

import org.junit.jupiter.api.Test
import org.springframework.beans.factory.annotation.Autowired

/**
 * app test
 */
class AppTest : OpenFeignBaseTest() {
    @Test
    fun testOne(@Autowired httpService: HttpService) {
        println(httpService.getIp().origin)
    }
}
