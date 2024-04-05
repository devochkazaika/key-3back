package server.key.service;

import lombok.AllArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import server.key.entities.Product;
import server.key.repository.ProductsDB;

import java.util.Optional;

@Service
@AllArgsConstructor
public class ProductService implements FindById<Optional<Product>> {
    @Autowired
    ProductsDB productRepo;
    public Optional<Product> findById(long id){
        return productRepo.findById(id);
    }
    public void add(Product product){
        productRepo.save(product);
    }
}
