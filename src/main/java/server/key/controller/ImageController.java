package server.key.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.multipart.MultipartFile;
import server.key.controller.DTO.ImageDTO;
import server.key.entities.Image;
import server.key.service.ImageService;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.nio.file.StandardCopyOption;

@Controller
@RequestMapping("/img")
public class ImageController {
    @Autowired
    ImageService imagesService;

    @GetMapping("/addfile")
    public ResponseEntity<?> store(@RequestParam("file") MultipartFile file) throws IOException {
//        try {
        Files.copy(file.getInputStream(), Paths.get("pages.jpg"), StandardCopyOption.REPLACE_EXISTING);
        return new ResponseEntity<>(HttpStatus.OK);
//        }
//        catch (IOException e) {
//            throw new StorageException("Failed to store file.", e);
//        }
    }

    @GetMapping("/get/{id}")
    private ResponseEntity<?> getLink(@PathVariable long id){
        try {
            Image img = imagesService.findById(id);
            return new ResponseEntity<>(img.getLink(), HttpStatus.OK);
        }
        catch (Exception e) {
            return new ResponseEntity<>(HttpStatus.BAD_REQUEST);
        }
    }
    @PostMapping("/add")
    private ResponseEntity<?> addImage(@RequestBody ImageDTO img){
        try {
            imagesService.save(img);
            return new ResponseEntity<>(HttpStatus.OK);
        }
        catch (Exception e) {
            return new ResponseEntity<>(HttpStatus.BAD_REQUEST);
        }
    }

}
