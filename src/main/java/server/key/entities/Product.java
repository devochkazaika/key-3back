package server.key.entities;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

import java.util.List;

@Entity
@Getter
@Setter
@Table(name="products")
public class Product {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long Id;

    @Column(name="name")
    String name;
    @Column(name="describe")
    String describe;
    @Column(name="status")
    String status;
    @Column(name="category")
    String category;
    @Column(name="link_for_buy")
    String link;

    @OneToMany(fetch = FetchType.LAZY)
    @JoinColumn(name = "id_image")
    private List<Image> image;

}
