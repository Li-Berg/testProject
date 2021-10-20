package com.libo.dao;

import com.libo.entity.Student;

import java.util.List;

/**
 * @Auther: AaronBerg
 * @Date: 2021/10/18 - 10 - 18  3:47 下午
 * @Description:
 * @Version:1.0
 */
public interface StudentDAO {
    public List<Student> findAll();
    public Student findBySno(String sno);

}
