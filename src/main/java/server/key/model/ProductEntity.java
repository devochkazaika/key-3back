package server.key.model;

import jakarta.persistence.*;
import lombok.Data;

@Entity
@Table(name="products")
@Data
public class ProductEntity {
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
    @Column(name="linkForBuy")
    String link;
//    @Column(name="data")
//    private byte[] data;

    @OneToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "id_image")
    private ImageEntity image;

}
