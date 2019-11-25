package com.wen.dockerweb

import bean.Teacher
import org.springframework.boot.SpringApplication
import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RestController

@SpringBootApplication
@RestController
class DockerwebApplication {

    static void main(String[] args) {
        SpringApplication.run(DockerwebApplication, args)
    }

    @RequestMapping('/docker')
    String docker() {
        def teacher = new Teacher()
        teacher.age = 12
        teacher.name = 'zhangsan'
        "hello docker! $teacher.name:$teacher.age"
    }


}
