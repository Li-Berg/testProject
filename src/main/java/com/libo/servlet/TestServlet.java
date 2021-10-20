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
@WebServlet(urlPatterns = "/test1.do")
public class TestServlet extends HttpServlet {
    private static final long serialVersionUID = -7893360655786106603L;

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        String m = req.getParameter("m");
        if(!"".equals(m)){
            System.out.println("浏览器:爷们借"+m+"块钱呗!");
        }
        System.out.println("小一:没钱找小二去!");;
        resp.getWriter().write(";haha");
        req.getRequestDispatcher("test2.do").forward(req, resp);
    }
}
