package com.freelance.controllers;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

import java.io.IOException;

@WebServlet(name = "traitementd'inscri", value = "/TraitementInscri")
public class TraitementInscri extends HttpServlet {

    public void doPost(HttpServletRequest request, HttpServletResponse response) throws IOException, ServletException {
    }
//        String nom = request.getParameter("nom");
//        String prenom = request.getParameter("prenom");
//        String email = request.getParameter("email");
//        String pwd = BCrypt.hashpw( request.getParameter("password"), BCrypt.gensalt()); ;
//        String adresse = request.getParameter("adresse");
//        Client c = new Client(nom,prenom,adresse,email,pwd);
//        ClientDao cdi = new ClientDaoImpl();
//        if(cdi.addClient(c))
//        {
//            request.setAttribute("inscrit","true");
//            RequestDispatcher view
//                    = request.getRequestDispatcher("authentification.jsp");
//            view.forward(request, response);
//        }
//        else
//        {
//            request.setAttribute("inscrit","false");
//            RequestDispatcher view
//                    = request.getRequestDispatcher("authentification.jsp");
//            view.forward(request, response);
//
//        }
//
//    }

}
