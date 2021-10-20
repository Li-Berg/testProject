package com.libo.servlet;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

import java.io.IOException;

/**
 * @Auther: AaronBerg
 * @Date: 2021/10/19 - 10 - 19  7:56 下午
 * @Description:
 * @Version:1.0
 */
@WebServlet("/myServlet1.do")
public class MyServlet1 extends HttpServlet {
    private static final long serialVersionUID = 1035311667468233741L;

    @Override
    protected void service(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        System.out.println("servlet1.do");
    }
}
