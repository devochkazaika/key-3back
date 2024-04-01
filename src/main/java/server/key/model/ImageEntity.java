package server.key.model;

import jakarta.persistence.*;
import lombok.Data;

@Entity
@Table(name="images")
@Data
public class ImageEntity {
    @jakarta.persistence.Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long Id;

    @Column(name="name")
    String name;
    @Column(name="data")
    private byte[] data;

    private String contentType;
}
