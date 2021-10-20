package com.libo.servlet;

import jakarta.servlet.ServletException;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

import java.io.IOException;

/**
 * @Auther: AaronBerg
 * @Date: 2021/10/14 - 10 - 14  11:55 下午
 * @Description:
 * @Version:1.0
 */
public class LoginServlet extends HttpServlet {
    private static final long serialVersionUID = 4231721182047454905L;

    @Override
    protected void service(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        String usr = req.getParameter("usr");
        String pwd = req.getParameter("pwd");

        System.out.println(usr);

        if("libo".equals(usr) && "666".equals(pwd)){
            resp.getWriter().write("success");
        }else{
            resp.getWriter().write("failed");
        }
    }

}
