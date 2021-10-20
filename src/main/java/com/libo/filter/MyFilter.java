package com.libo.filter;

import jakarta.servlet.*;

import java.io.IOException;

/**
 * @Auther: AaronBerg
 * @Date: 2021/10/19 - 10 - 19  7:43 下午
 * @Description:
 * @Version:1.0
 */
public class MyFilter implements Filter {
    @Override
    public void init(FilterConfig filterConfig) throws ServletException {
        Filter.super.init(filterConfig);
    }

    @Override
    public void doFilter(ServletRequest servletRequest, ServletResponse servletResponse, FilterChain filterChain) throws IOException, ServletException {
        System.out.println("filter servlet1.do");
        // 通过代码对请求放行(不执行下面的代码就等于不符合要求请求被过滤调 可以直接跳转或者向resp中添加具体信息返回响应)
        filterChain.doFilter(servletRequest, servletResponse);
    }

    @Override
    public void destroy() {
        Filter.super.destroy();
    }
}
