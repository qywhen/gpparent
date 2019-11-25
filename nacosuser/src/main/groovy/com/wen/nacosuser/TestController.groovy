package com.wen.nacosuser

import org.springframework.beans.factory.annotation.Autowired
import org.springframework.cloud.client.discovery.DiscoveryClient
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.RestController
import org.springframework.web.client.RestTemplate

/**
 * Created with IntelliJ IDEA.
 * @author scarlet* @time 2019/11/24 12:48
 */
@RestController
class TestController {
    @Autowired
    DiscoveryClient client
    RestTemplate template=new RestTemplate()
    @GetMapping('/nacos')
    Object test() {
        def inses = client.getInstances('nacosorder')
        def ins = inses.get(0)
        def uri = ins.uri
        def port = ins.port
        println "uri:  $uri:$port"
        template.getForObject("$uri/test",String.class)
    }

}
