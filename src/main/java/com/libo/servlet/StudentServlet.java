package com.libo.servlet;

import com.libo.dao.StudentDAO;
import com.libo.dao.impl.StudentDaoImpl;
import com.libo.entity.Student;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

import java.io.IOException;
import java.util.List;

/**
 * @Auther: AaronBerg
 * @Date: 2021/10/18 - 10 - 18  4:23 下午
 * @Description:
 * @Version:1.0
 */
@WebServlet("/student")
public class StudentServlet extends HttpServlet {
    private static final long serialVersionUID = -3312704993246132449L;
    private StudentDAO dao;
    private StudentDAO getDao(){
        if(dao == null){
            dao = new StudentDaoImpl();
        }
        return dao;
    }
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        List<Student> all = getDao().findAll();
        req.setAttribute("stus", all);
        all.forEach(System.out::println);
        req.getRequestDispatcher("/WEB-INF/jsp/show.jsp").forward(req, resp);
    }
}
