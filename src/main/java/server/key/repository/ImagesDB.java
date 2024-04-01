package server.key.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import server.key.model.ImageEntity;
@Repository
public interface ImagesDB extends JpaRepository<ImageEntity, Long> {
}