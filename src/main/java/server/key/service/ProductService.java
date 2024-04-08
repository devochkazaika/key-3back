package server.key.service;

import server.key.entities.product.Product;

public interface ProductService {
    Product getById(Long id);
    Product getByName(String name);

    Product update(Product product);
    Product create(Product product);
    void delete(Long id);
}
