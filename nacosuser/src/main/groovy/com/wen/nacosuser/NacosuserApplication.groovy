package com.wen.nacosuser

import org.springframework.boot.SpringApplication
import org.springframework.boot.autoconfigure.SpringBootApplication

@SpringBootApplication
class NacosuserApplication {

    static void main(String[] args) {
        try {
            SpringApplication.run(NacosuserApplication, args)
        } catch (e) {
            e.printStackTrace()
        }
    }


}
