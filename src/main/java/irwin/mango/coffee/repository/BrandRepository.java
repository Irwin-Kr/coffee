package irwin.mango.coffee.repository;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;

import irwin.mango.coffee.entity.Brand;

public interface BrandRepository extends JpaRepository<Brand, Long>{

	Optional<Brand> findByName(String name);
	
}
