package com.wen.nginxsb

import com.wen.nginxsb.domain.Student
import com.wen.nginxsb.repository.StudentRepository
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.boot.SpringApplication
import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.RestController

@SpringBootApplication
@RestController
class NginxsbApplication {
    @Autowired
    StudentRepository studentRepository

    static void main(String[] args) {
        SpringApplication.run(NginxsbApplication, args)
    }


    @GetMapping('/students')
    List<Student> studentList() {
        studentRepository.findAll()
    }

}
