package com.wen.nginxsb.repository

import com.wen.nginxsb.domain.Student
import org.springframework.data.jpa.repository.JpaRepository

/**
 * Created with IntelliJ IDEA.
 * @author scarlet* @time 2019/11/18 16:28
 */
interface StudentRepository extends JpaRepository<Student, Integer> {

}
