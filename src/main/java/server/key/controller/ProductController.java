package server.key.controller;

import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.*;
import server.key.service.impl.ProductServiceImpl;
import server.key.web.dto.product.ProductDTO;
import server.key.web.mappers.ProductMapper;
import server.key.web.validation.OnUpdate;

@RestController
@RequestMapping(path = "products")
@RequiredArgsConstructor
//@FieldDefaults(level = AccessLevel.PRIVATE)
public class ProductController {
    @Autowired
    private final ProductServiceImpl service;
    @Autowired
    private final ProductMapper mapper;

    @PostMapping
    private ResponseEntity<?> update(@Validated(OnUpdate.class) @RequestBody ProductDTO dto){
        return new ResponseEntity<>(service.update(mapper.toEntity(dto)), HttpStatus.OK);
    }
    @GetMapping("/{id}")
    private ResponseEntity<?> getById(Long id){

        return new ResponseEntity<>(mapper.toDTO(service.getById(id)), HttpStatus.OK);
    }


}
