package irwin.mango.coffee.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import irwin.mango.coffee.entity.Category;

public interface CategoryRepository extends JpaRepository<Category, Long>{

}
