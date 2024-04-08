package server.key.web.mappers;

import org.mapstruct.Mapper;
import server.key.entities.product.Product;
import server.key.web.dto.product.ProductDTO;

@Mapper(componentModel = "spring")
public interface ProductMapper  {
    ProductDTO toDTO(Product product);
    Product toEntity(ProductDTO productDTO);
}
