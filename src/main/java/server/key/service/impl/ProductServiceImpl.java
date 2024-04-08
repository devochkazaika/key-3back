package server.key.service.impl;

import lombok.AllArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.validation.annotation.Validated;
import server.key.entities.product.Product;
import server.key.service.ProductService;
import server.key.web.mappers.ProductMapper;

@Service
@AllArgsConstructor
@Validated
public class ProductServiceImpl implements ProductService {
    @Autowired
    private final ProductMapper mapper;
    @Override
    public Product getById(Long id) {
        return null;
    }

    @Override
    public Product getByName(String name) {
        return null;
    }

    @Override
    public Product update(Product product) {
        return null;
    }

    @Override
    public Product create(Product product) {
        return null;
    }

    @Override
    public void delete(Long id) {

    }
}
