package org.mvnsearch

import org.springframework.boot.test.context.SpringBootTest
import org.springframework.test.context.ActiveProfiles
import org.springframework.test.context.junit.jupiter.SpringJUnitConfig

/**
 * open feign base test
 *
 * @author linux_china
 */
@SpringJUnitConfig(CloudOpenFeignApp::class)
@SpringBootTest
@ActiveProfiles("test")
abstract class OpenFeignBaseTest {
}