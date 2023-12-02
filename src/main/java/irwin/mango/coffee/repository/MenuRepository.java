package irwin.mango.coffee.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import irwin.mango.coffee.entity.Coffee;

public interface MenuRepository extends JpaRepository <Coffee, Long>{

}
