package com.freelance.controllers;

import dao.ClientDao;
import dao.impl.ClientDaoImpl;
import jakarta.servlet.*;
import jakarta.servlet.http.*;
import jakarta.servlet.annotation.*;
import models.Client;
import org.springframework.security.crypto.bcrypt.BCrypt;

import java.io.IOException;
import java.util.Objects;

@WebServlet(name = "Login", value = "/login-traitement")
public class LoginTraitement extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String email = request.getParameter("email");
        String pwd = request.getParameter("password");
        RequestDispatcher view ;
        ClientDao cdi = new ClientDaoImpl();
        Client currentUser = cdi.getClient(email);
        System.out.println(email);
        System.out.println(currentUser);
        System.out.println(pwd);

        if (BCrypt.checkpw(pwd, currentUser.getPassword())) {
            HttpSession session = request.getSession();
            session.setAttribute("email",email);
            session.setAttribute("currentUser", currentUser);
            request.setAttribute("connecte","true");
            view = request.getRequestDispatcher("add-listing.jsp");
            view.forward(request, response);
        } else {
            request.setAttribute("connecte","false");
            view = request.getRequestDispatcher("authentification.jsp");
            view.forward(request, response);
        }
    }
}
