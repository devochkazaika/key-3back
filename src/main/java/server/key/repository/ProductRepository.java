package server.key.repository;

import server.key.entities.product.Product;
import server.key.security.Role;

import java.util.Optional;

public interface ProductRepository {
    Optional<Product> findById(Long id);
    Optional<Product> findByName(String name);
    void update(Product product);
    void create(Product product);
    void insertAccessRole(Long id, Role role);
    void delete(Long id);
}
