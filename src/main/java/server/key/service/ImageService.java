package server.key.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import server.key.controller.DTO.ImageDTO;
import server.key.entities.Image;
import server.key.repository.ImagesDB;

@Service
public class ImageService {
    @Autowired
    ImagesDB imageRepo;
    public void save(ImageDTO imageDTO){
        Image img = Image.builder().
                name(imageDTO.getName()).link(imageDTO.getLink()).
                build();
        imageRepo.save(img);
    }
    public Image findById(long id){
        return imageRepo.findById(id).orElseThrow();
    }
}
