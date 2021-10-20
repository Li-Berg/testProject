package com.example.servletDemo;


import jakarta.servlet.ServletException;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

import java.io.IOException;
import java.util.Random;

/**
 * @Auther: AaronBerg
 * @Date: 2021/10/14 - 10 - 14  11:17 下午
 * @Description:
 * @Version:1.0
 */
public class DemoServlet extends HttpServlet {
    private static final long serialVersionUID = 6735080681007171175L;

    @Override
    protected void service(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        resp.getWriter().write(new Random().nextInt()%2==0?"gaoxing":"happy new year");
    }
}
