package irwin.mango.coffee.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import irwin.mango.coffee.entity.Image;

public interface ImageRepository extends JpaRepository<Image, Long>{

}
