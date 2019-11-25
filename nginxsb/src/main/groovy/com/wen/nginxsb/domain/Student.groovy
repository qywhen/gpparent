package com.wen.nginxsb.domain

import javax.persistence.Entity
import javax.persistence.Id
import javax.persistence.Table

/**
 * Created with IntelliJ IDEA.
 * @author scarlet* @time 2019/11/18 16:26
 */
@Entity
@Table(name = 'student')
class Student {
    @Id
    int id
    String name
}
