package server.key.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import server.key.entities.Image;
@Repository
public interface ImagesDB extends JpaRepository<Image, Long> {
}