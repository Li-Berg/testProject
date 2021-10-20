package com.libo.servlet;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

import java.io.IOException;

/**
 * @Auther: AaronBerg
 * @Date: 2021/10/16 - 10 - 16  12:23 上午
 * @Description:
 * @Version:1.0
 */
@WebServlet(urlPatterns = "/test2.do")
public class TestServlet2 extends HttpServlet {
    private static final long serialVersionUID = 5970880341419954803L;

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        System.out.println("小二:行吧,我借你"+req.getParameter("m"));
    }
}
