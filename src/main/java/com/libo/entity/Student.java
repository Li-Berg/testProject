package com.libo.entity;

import java.io.Serializable;
import java.util.Date;

/**
 * @Auther: AaronBerg
 * @Date: 2021/10/18 - 10 - 18  3:47 下午
 * @Description:
 * @Version:1.0
 */
public class Student implements Serializable {
    private static final long serialVersionUID = -9163590778320890272L;
    private String name;
    private String sno;
    private Date enterDate;
    private Integer age;
    public Student() {
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSno() {
        return sno;
    }

    public void setSno(String sno) {
        this.sno = sno;
    }

    public Date getEnterDate() {
        return enterDate;
    }

    public void setEnterDate(Date enterDate) {
        this.enterDate = enterDate;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", sno='" + sno + '\'' +
                ", enterDate=" + enterDate +
                ", age=" + age +
                '}';
    }
}
