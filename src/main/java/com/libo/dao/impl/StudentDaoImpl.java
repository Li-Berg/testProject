package com.libo.dao.impl;

import com.libo.dao.StudentDAO;
import com.libo.entity.Student;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;

/**
 * @Auther: AaronBerg
 * @Date: 2021/10/18 - 10 - 18  3:59 下午
 * @Description:
 * @Version:1.0
 */
public class StudentDaoImpl implements StudentDAO {
    private String url = "jdbc:mysql://127.0.0.1:3306/testbd";
    private String username = "root";
    private String password = "123456a!";
    private Connection connection ;
    private PreparedStatement ps;
    private ResultSet res;
    private List<Student> stus = new ArrayList<>();
    @Override
    public List<Student> findAll() {
        try {
            // 1 使用反射加载驱动
            Class.forName("com.mysql.cj.jdbc.Driver");
            // 2 创建连接
            connection = DriverManager.getConnection(url, username, password);
            // 3 创建(预编译)语句对象
            ps = connection.prepareStatement("select * from student");
            // 4 执行语句获得结果集
            res = ps.executeQuery();
            // 5 封装结果集
            while(res.next()){
                Student stu = new Student();
                stu.setAge(res.getInt("age"));
                stu.setEnterDate(res.getDate("enterdate"));
                stu.setSno(res.getString("sno"));
                stu.setName(res.getString("name"));
                stus.add(stu);
            }

        } catch (ClassNotFoundException | SQLException e) {
            e.printStackTrace();
        }finally {
            if(null != res){
                try {
                    res.close();
                } catch (SQLException throwables) {
                    throwables.printStackTrace();
                }
            }
            if(ps != null){
                try {
                    ps.close();
                } catch (SQLException throwables) {
                    throwables.printStackTrace();
                }
            }
            if(connection != null){
                try {
                    connection.close();
                } catch (SQLException throwables) {
                    throwables.printStackTrace();
                }
            }
        }
        return stus;
    }

    @Override
    public Student findBySno(String sno) {
        return null;
    }
}
