package org.mvnsearch

import org.springframework.cloud.openfeign.FeignClient
import org.springframework.web.bind.annotation.RequestMapping


data class IpResult(val origin: String)

@FeignClient(value = "httpService", url = "\${feign.httpService.url}")
interface HttpService {

    @RequestMapping("/ip")
    fun getIp(): IpResult
}