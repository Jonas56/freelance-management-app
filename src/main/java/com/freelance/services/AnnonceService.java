package com.freelance.services;

import com.freelance.beans.Annonce;
import com.freelance.models.IAnnonceRepository;
import com.freelance.utils.AnnonceHelper;
import jakarta.servlet.ServletException;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

import java.io.IOException;
import java.util.List;

public class AnnonceService {

    private final IAnnonceRepository annonceRepository;
    private final AnnonceHelper annonceHelper;

    public AnnonceService(IAnnonceRepository annonceRepository,
                          AnnonceHelper annonceHelper) {
        this.annonceRepository = annonceRepository;
        this.annonceHelper = annonceHelper;
    }

    public void getAllAnnoncesForUser(HttpServletRequest req, HttpServletResponse res)
            throws ServletException, IOException {
        List<Annonce> annonces = annonceRepository.findAll();
        req.setAttribute("annonces", annonces);
        // TODO: replace with appropriate page
        req.getRequestDispatcher("/main.jsp").forward(req, res);
    }

    public void getAllAnnoncesForAdmin(HttpServletRequest req, HttpServletResponse res)
            throws ServletException, IOException {
        List<Annonce> annonces = annonceRepository.findAll();
        req.setAttribute("annonces", annonces);
        // TODO: replace with appropriate page
        req.getRequestDispatcher("annonce-details.jsp").forward(req, res);
    }

    public void getAnnonceForUser(HttpServletRequest req, HttpServletResponse res)
            throws ServletException, IOException {
        try {
            Integer annonceId = Integer.valueOf(req.getParameter("annonceId"));
            Annonce annonce = annonceRepository.findById(annonceId);
            if (annonce != null) {
                req.setAttribute("annonce", annonce);
                req.getRequestDispatcher("main.jsp").forward(req, res);
            } else {
                req.getRequestDispatcher("404.jsp").forward(req, res);
            }
        } catch (Exception e) {
            req.getRequestDispatcher("404.jsp").forward(req, res);
        }
    }

    public void getAnnonceForAdmin(HttpServletRequest req, HttpServletResponse res)
            throws ServletException, IOException {
        try {
            Integer annonceId = Integer.valueOf(req.getParameter("annonceId"));
            Annonce annonce = annonceRepository.findById(annonceId);
            if (annonce != null) {
                req.setAttribute("annonce", annonce);
                req.getRequestDispatcher("admin.jsp").forward(req, res);
            } else {
                req.getRequestDispatcher("404.jsp").forward(req, res);
            }
        } catch (Exception e) {
            req.getRequestDispatcher("404.jsp").forward(req, res);
        }
    }

    public void saveOrUpdateAnnonceUser(HttpServletRequest req, HttpServletResponse res,
                                        Annonce annonce)
            throws ServletException, IOException {
        String message = "Could not create this annonce";
        boolean annonceCreated = annonceRepository.saveOrUpdate(annonce);
        if (annonceCreated) {
            message = "Annonce Created successfully!";
        }
        req.setAttribute("errorMessage", message);
        // TODO: replace with appropriate page
        req.getRequestDispatcher("main.jsp").forward(req, res);
    }

    public void saveOrUpdateAnnonceAdmin(HttpServletRequest req, HttpServletResponse res,
                                         Annonce annonce)
            throws ServletException, IOException {
        String message = "Could not create this annonce";
        boolean annonceCreated = annonceRepository.saveOrUpdate(annonce);
        if (annonceCreated) {
            message = "Annonce Created successfully!";
        }
        req.setAttribute("errorMessage", message);
        // TODO: replace with appropriate page
        req.getRequestDispatcher("admin.jsp").forward(req, res);
    }

    public void deleteAnnonceUser(HttpServletRequest req, HttpServletResponse res)
            throws ServletException, IOException {
        try {
            String message = annonceHelper.findByIdAndDelete(req.getParameter("annonceId"));
            req.setAttribute("errorMessage", message);
            // TODO: replace with appropriate page
            req.getRequestDispatcher("main.jsp").forward(req, res);
        } catch (Exception e) {
            req.getRequestDispatcher("404.jsp").forward(req, res);
        }
    }

    public void deleteAnnonceAdmin(HttpServletRequest req, HttpServletResponse res)
            throws ServletException, IOException {
        try {
            String message =  annonceHelper.findByIdAndDelete(req.getParameter("annonceId"));
            req.setAttribute("errorMessage", message);
            // TODO: replace with appropriate page
            req.getRequestDispatcher("main.jsp").forward(req, res);
        } catch (Exception e) {
            req.getRequestDispatcher("404.jsp").forward(req, res);
        }
    }
}



