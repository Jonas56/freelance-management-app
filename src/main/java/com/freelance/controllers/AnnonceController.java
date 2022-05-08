package com.freelance.controllers;

import com.freelance.beans.Annonce;
import com.freelance.models.AnnonceRepository;
import com.freelance.models.IAnnonceRepository;
import com.freelance.services.AnnonceService;
import com.freelance.utils.AnnonceHelper;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

import java.io.IOException;

@WebServlet(name = "AnnonceController",
        description = "Servlet that handles all **Annonce** requests related",
        urlPatterns = {
                "/annonces.user", "/annonces.admin", "/annonce.user", "/annonce.admin"
        })
public class AnnonceController extends HttpServlet {

    private AnnonceService annonceService;
    private AnnonceHelper annonceHelper;

    @Override
    public void init() throws ServletException {
        IAnnonceRepository annonceRepository = new AnnonceRepository();
        annonceHelper = new AnnonceHelper(annonceRepository);
        annonceService = new AnnonceService(annonceRepository, annonceHelper);
    }

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse res)
            throws ServletException, IOException {
        // TODO: Check authorization session!
        res.setContentType("text/html");
        String requestPath = req.getServletPath();

        switch (requestPath) {
            case "/annonces.user":
                annonceService.getAllAnnoncesForUser(req, res);
                break;
            case "/annonces.admin":
                annonceService.getAllAnnoncesForAdmin(req, res);
                break;
            case "/annonce.user":
                annonceService.getAnnonceForUser(req, res);
                break;
            case "/annonce.admin":
                annonceService.getAnnonceForAdmin(req, res);
                break;
            default:
                req.getRequestDispatcher("404.jsp").forward(req, res);
                break;
        }
    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse res)
            throws ServletException, IOException {
        res.setContentType("text/html");
        // TODO: Check authorization session!
        String requestPath = req.getServletPath();
        Annonce annonce = annonceHelper.getAnnonceFromUserInput(req);
        String message = annonceHelper.validateUserInput(annonce);
        if (message != null) {
            req.setAttribute("errorMessage", message);
            req.getRequestDispatcher("main.jsp").forward(req, res);
        } else {
            if (requestPath.equals("/annonces.user")) {
                annonceService.saveOrUpdateAnnonceUser(req, res, annonce);
            } else if (requestPath.equals("/annonces.admin")) {
                annonceService.saveOrUpdateAnnonceAdmin(req, res, annonce);
            }
        }

    }

    @Override
    protected void doPut(HttpServletRequest req, HttpServletResponse res)
            throws ServletException, IOException {
        res.setContentType("text/html");
        // TODO: Check authorization session!
        String requestPath = req.getServletPath();
        Annonce annonce = annonceHelper.getAnnonceFromUserInput(req);
        String message = annonceHelper.validateUserInput(annonce);
        if (annonce.getId() == null) {
            message = "Annonce id cannot be null";
        }
        if (message != null) {
            req.setAttribute("errorMessage", message);
            req.getRequestDispatcher("main.jsp").forward(req, res);
        } else {
            if (requestPath.equals("/annonces.user")) {
                annonceService.updateAnnonceUser(req, res, annonce);
            } else if (requestPath.equals("/annonces.admin")) {
                annonceService.updateAnnonceAdmin(req, res, annonce);
            }
        }

    }

    @Override
    protected void doDelete(HttpServletRequest req, HttpServletResponse res)
            throws ServletException, IOException {
        res.setContentType("text/html");
        // TODO: Check authorization session!
        String requestPath = req.getServletPath();

        // Path(/annonces.user)
        if (requestPath.equals("/annonce.user")) {
            annonceService.deleteAnnonceUser(req, res);
        }// Path(/annonces.user)
        else if (requestPath.equals("/annonce.admin")) {
            annonceService.deleteAnnonceAdmin(req, res);
        } else {
            req.getRequestDispatcher("404.jsp").forward(req, res);
        }
    }
}
