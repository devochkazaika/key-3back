package server.key.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import server.key.entities.Product;
import server.key.service.ProductService;

@RestController()
@RequestMapping(path = "products")
public class ProductController {
    @Autowired
    ProductService service;
    @GetMapping("/get")
    private ResponseEntity<?> getProduct(@PathVariable long id){
        try {
            Product product = service.findById(id).orElseThrow();
            return new ResponseEntity<>(product, HttpStatus.OK);
        }
        catch (Exception e){
            return new ResponseEntity<>(HttpStatus.NOT_FOUND);
        }
    }

    @PostMapping("/add")
    private ResponseEntity<?> addProduct(@RequestBody Product product){
        try {
            service.add(product);
            return new ResponseEntity<>(HttpStatus.OK);
        }
        catch (Exception e){
            return new ResponseEntity<>(HttpStatus.BAD_REQUEST);
        }
    }

}
