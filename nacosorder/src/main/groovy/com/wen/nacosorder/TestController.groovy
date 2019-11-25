package com.wen.nacosorder

import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.RestController

/**
 * Created with IntelliJ IDEA.
 * @author scarlet* @time 2019/11/24 13:24
 */
@RestController
class TestController {
    @GetMapping('/test')
    String test() {
        'i am order ,hahaha!'
    }

}
