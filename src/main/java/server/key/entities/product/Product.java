package server.key.entities;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

@Entity
@Getter
@Setter
@Table(name="products")
public class Product {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long Id;

    String name;
    String describe;
    Status status;
    String category;
    @Column(name="link_for_buy")
    String link;

}
