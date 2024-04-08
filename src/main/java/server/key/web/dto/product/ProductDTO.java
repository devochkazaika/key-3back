package server.key.web.dto.product;

import jakarta.validation.constraints.NotNull;
import lombok.AccessLevel;
import lombok.Data;
import lombok.experimental.FieldDefaults;
import org.hibernate.validator.constraints.Length;
import server.key.web.validation.OnCreate;
import server.key.web.validation.OnUpdate;

@Data
@FieldDefaults(level = AccessLevel.PRIVATE)
public class ProductDTO {
    @NotNull(message = "id must be not null", groups = OnUpdate.class)
    Long id;

    @NotNull(message = "name must be not null", groups = {OnCreate.class, OnUpdate.class})
    @Length(max = 255, message = "Name length must me less than 255 symbols", groups = {OnCreate.class, OnUpdate.class})
    String name;
    String describe;
    String status;
    String category;
    String link;
}
