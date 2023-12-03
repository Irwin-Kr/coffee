package irwin.mango.coffee.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import irwin.mango.coffee.entity.Brand;

public interface BrandRepository extends JpaRepository<Brand, Long>{
	
	Brand findByName(String name);

}