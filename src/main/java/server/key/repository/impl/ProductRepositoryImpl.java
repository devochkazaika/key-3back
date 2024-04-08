package server.key.repository.impl;

import org.springframework.stereotype.Repository;
import server.key.entities.product.Product;
import server.key.repository.ProductRepository;
import server.key.security.Role;

import java.util.Optional;

@Repository
public class ProductRepositoryImpl implements ProductRepository {
    @Override
    public Optional<Product> findById(Long id) {
        return Optional.empty();
    }

    @Override
    public Optional<Product> findByName(String name) {
        return Optional.empty();
    }

    @Override
    public void update(Product product) {

    }

    @Override
    public void create(Product product) {

    }

    @Override
    public void insertAccessRole(Long id, Role role) {

    }

    @Override
    public void delete(Long id) {

    }
}
