package org.mvnsearch.app2;

import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * portal controller
 *
 * @author linux_china
 */
@RestController
@RefreshScope
public class PortalController {
    @GetMapping("/")
    public String welcome() {
        return "hello";
    }
}
