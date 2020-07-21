package com.hyorin.learningMVC.servlet;

import com.hyorin.learningMVC.Bean.School;
import com.hyorin.learningMVC.Bean.User;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

/**
 * 简单的MVC模型
 * 相应的servlet处理请求生成model
 * 转到对应的jsp渲染
 * servlet负责业务逻辑
 * jsp负责展示逻辑
 */
@WebServlet(urlPatterns = "/user")
public class UserServlet extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        School school = new School("YouXianNo.1 Middle School", 1011);
        User user = new User("hyorin", 7777, school);
        //放入request中
        req.setAttribute("user", user);
        //重定向到user.jsp 交给user.jsp处理
        req.getRequestDispatcher("/WEB-INF/JSP/user.jsp").forward(req, resp);
    }
}
