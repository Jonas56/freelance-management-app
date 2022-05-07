package com.freelance.utils;

import com.freelance.beans.Annonce;
import com.freelance.beans.AnnonceImage;
import com.freelance.models.IAnnonceRepository;
import jakarta.servlet.http.HttpServletRequest;

import java.util.LinkedList;
import java.util.List;

public class AnnonceHelper {

    private final IAnnonceRepository annonceRepository;

    public AnnonceHelper(IAnnonceRepository annonceRepository) {
        this.annonceRepository = annonceRepository;
    }

    public String findByIdAndDelete(String id){
        String errorMessage = "Unable to delete annonce!";
        Integer annonceId = Integer.valueOf(id);
        Annonce annonce = annonceRepository.findById(annonceId);
        if (annonce != null) {
            boolean annonceDeleted = annonceRepository.delete(annonce);
            if (annonceDeleted) {
                errorMessage = "Annonce Deleted Successfully!";
            }
        }
        return  errorMessage;
    }

    public Annonce getAnnonceFromUserInput(HttpServletRequest req){
        Annonce annonce = new Annonce();
        Integer annonceId = null;
        try{
                annonceId = Integer.parseInt(req.getParameter("annonceId"));
        }catch (Exception ignored){
        }
        String titre = req.getParameter("titre");
        String description = req.getParameter("description");
        List<AnnonceImage> imageList = new LinkedList<>();
        // FIXME: Get Annonce images as List
        //   List<String> requestImageList =
        //   Collections.singletonList(req.getParameter("images"));
        //   for (String image : requestImageList) {
        //      imageList.add(new AnnonceImage(image));
        //   }
        imageList.add(new AnnonceImage(req.getParameter("image")));
        if(annonceId != null){
            annonce.setId(annonceId);
        }
        annonce.setAnnonceImages(imageList);
        annonce.setDescription(description);
        annonce.setTitre(titre);

        return annonce;
    }
}
