package server.key.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import server.key.entities.Product;

@Repository
public interface ProductsDB extends JpaRepository<Product, Long> {
}
