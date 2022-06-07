package com.freelance.services;

import com.freelance.beans.Annonce;
import com.freelance.beans.Mission;
import com.freelance.models.IAnnonceRepository;
import com.freelance.models.IClientRepository;
import com.freelance.models.IMissionRepository;
import com.freelance.utils.AnnonceHelper;
import com.freelance.utils.MissionHelper;
import jakarta.servlet.ServletException;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

import java.io.IOException;
import java.util.List;

public class MissionService {
    private final IMissionRepository missionRepository;
    private final MissionHelper missionHelper;

    public MissionService(IMissionRepository missionRepository,
                          MissionHelper missionHelper) {
        this.missionRepository = missionRepository;
        this.missionHelper = missionHelper;
    }

    public void getAllMissionsForHome(HttpServletRequest req, HttpServletResponse res) throws ServletException, IOException {
        List<Mission> missions = missionRepository.findAll();
        req.setAttribute("missions", missions);
        req.getRequestDispatcher("/views/pages/home.jsp").forward(req, res);
    }

    public void getAllMissionsForUser(HttpServletRequest req, HttpServletResponse res)
            throws ServletException, IOException {
        List<Mission> missions = missionRepository.findAll();
        req.setAttribute("missions", missions);
        // TODO: replace with appropriate page
        req.getRequestDispatcher("/views/pages/list-services.jsp").forward(req, res);
    }

    public void getAllMissionsForAdmin(HttpServletRequest req, HttpServletResponse res)
            throws ServletException, IOException {
        List<Mission> missions = missionRepository.findAll();
        req.setAttribute("missions", missions);
        // TODO: replace with appropriate page
        req.getRequestDispatcher("mission-details.jsp").forward(req, res);
    }

    public void getMissionForUser(HttpServletRequest req, HttpServletResponse res)
            throws ServletException, IOException {
        try {
            Integer missionId = Integer.valueOf(req.getParameter("missionId"));
            Mission mission = missionRepository.findById(missionId);
            if (mission != null) {
                req.setAttribute("mission", mission);
                req.getRequestDispatcher("main.jsp").forward(req, res);
            } else {
                req.getRequestDispatcher("404.jsp").forward(req, res);
            }
        } catch (Exception e) {
            req.getRequestDispatcher("404.jsp").forward(req, res);
        }
    }

    public void getMissionForAdmin(HttpServletRequest req, HttpServletResponse res)
            throws ServletException, IOException {
        try {
            Integer missionId = Integer.valueOf(req.getParameter("missionId"));
            Mission mission = missionRepository.findById(missionId);
            if (mission != null) {
                req.setAttribute("mission", mission);
                req.getRequestDispatcher("annonce-management.jsp").forward(req, res);
            } else {
                req.getRequestDispatcher("404.jsp").forward(req, res);
            }
        } catch (Exception e) {
            req.getRequestDispatcher("404.jsp").forward(req, res);
        }
    }

    public void saveOrUpdateMissionUser(HttpServletRequest req, HttpServletResponse res,
                                        Mission mission)
            throws ServletException, IOException {
        String message = "Could not create this mission";
        boolean missionCreated = missionRepository.saveOrUpdate(mission);
        if (missionCreated) {
            message = "Mission Created successfully!";
        }
        req.setAttribute("errorMessage", message);
        // TODO: replace with appropriate page
        req.getRequestDispatcher("main.jsp").forward(req, res);
    }

    public void saveOrUpdateMissionAdmin(HttpServletRequest req, HttpServletResponse res,
                                         Mission mission)
            throws ServletException, IOException {
        String message = "Could not create this mission";
        boolean missionCreated = missionRepository.saveOrUpdate(mission);
        if (missionCreated) {
            message = "Mission Created successfully!";
        }
        req.setAttribute("errorMessage", message);
        // TODO: replace with appropriate page
        req.getRequestDispatcher("annonce-management.jsp").forward(req, res);
    }

    public void deleteMissionUser(HttpServletRequest req, HttpServletResponse res)
            throws ServletException, IOException {
        try {
            String message = missionHelper.findByIdAndDelete(req.getParameter("missionId"));
            req.setAttribute("errorMessage", message);
            // TODO: replace with appropriate page
            req.getRequestDispatcher("main.jsp").forward(req, res);
        } catch (Exception e) {
            req.getRequestDispatcher("404.jsp").forward(req, res);
        }
    }

    public void deleteMissionAdmin(HttpServletRequest req, HttpServletResponse res)
            throws ServletException, IOException {
        try {
            String message = missionHelper.findByIdAndDelete(req.getParameter("missionId"));
            req.setAttribute("errorMessage", message);
            // TODO: replace with appropriate page
            req.getRequestDispatcher("main.jsp").forward(req, res);
        } catch (Exception e) {
            req.getRequestDispatcher("404.jsp").forward(req, res);
        }
    }

    public void updateMissionUser(HttpServletRequest req, HttpServletResponse res)
            throws ServletException, IOException {
        Mission mission = missionHelper.getMissionFromUserInput(req);
        String message = missionHelper.validateUserInput(mission);
        if (mission.getId() == null) {
            message = "Mission id cannot be null";
        }
        if (message != null) {
            req.setAttribute("errorMessage", message);
            req.getRequestDispatcher("main.jsp").forward(req, res);
        }
        message = missionHelper.findByIdAndUpdate(req.getParameter("missionId"), mission);
        req.setAttribute("errorMessage", message);
        // TODO: replace with appropriate page
        req.getRequestDispatcher("main.jsp").forward(req, res);
    }

    public void updateMissionAdmin(HttpServletRequest req, HttpServletResponse res)
            throws ServletException, IOException {
        Mission mission = missionHelper.getMissionFromUserInput(req);
        String message = missionHelper.validateUserInput(mission);
        if (mission.getId() == null) {
            message = "Mission id cannot be null";
        }
        if (message != null) {
            req.setAttribute("errorMessage", message);
            req.getRequestDispatcher("main.jsp").forward(req, res);
        }
        message = missionHelper.findByIdAndUpdate(req.getParameter("missionId"), mission);
        boolean missionUpdated = missionRepository.update(mission);
        if (missionUpdated) {
            message = "Mission updated successfully!";
        }
        req.setAttribute("errorMessage", message);
        // TODO: replace with appropriate page
        req.getRequestDispatcher("annonce-management.jsp").forward(req, res);
    }


}
