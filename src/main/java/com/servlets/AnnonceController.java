package com.servlets;

import java.io.IOException;
import java.util.List;

import com.beans.Annonce;
import com.models.AnnonceRepository;

import jakarta.servlet.ServletException;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class AnnonceController
 */
public class AnnonceController extends HttpServlet {
	private static final long serialVersionUID = 1L;
	
	AnnonceRepository announceRepository;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public AnnonceController() {
        super();
    }
    
    @Override
    public void init() throws ServletException {
    	super.init();
    	announceRepository = new AnnonceRepository();
    }
    
	protected void doGet(HttpServletRequest request, HttpServletResponse response) 
			throws ServletException, IOException {
		// Check authentication
		
		String path = request.getServletPath();
		
		// Get All annonces route
		if(path.equalsIgnoreCase("/annonce/index")) {
			
			List<Annonce> annonces = announceRepository.getAllAnnonces();
			request.setAttribute("annonces", annonces);
			request.getRequestDispatcher("annonces.jsp").forward(request, response);
		
		// Get Annonce by Id
		}else if(path.equalsIgnoreCase("/annonce/show")){
			
			int annonceId = (int) request.getAttribute("annonce");
			Annonce annonce = announceRepository.getAnnonce(annonceId);
			request.setAttribute("annonce", annonce);
			request.getRequestDispatcher("annonce.jsp").forward(request, response);
		
		// Cannot serve this 
		}else {
			request.getRequestDispatcher("404.jsp").forward(request, response);
		}
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) 
			throws ServletException, IOException {
		
		// Check authentication

		String path = request.getServletPath();
		
		// Store or update annonce
		if(path.equalsIgnoreCase("/annonce/update")) {
//			Annonce annonce = new Annonce();
//			annonce.setDescription("");
//			annonce.setId(1);
// 			annonce.setimageList(imageList);
			try {
//				announceRepository.saveOrUpdateAnnonce(annonce);
				request.getRequestDispatcher("annonces.jsp").forward(request, response); // send response with popup message
			} catch (Exception e) {
				// Exception
			}

		}else {
			request.getRequestDispatcher("404.jsp").forward(request, response);
		}
	}

}
