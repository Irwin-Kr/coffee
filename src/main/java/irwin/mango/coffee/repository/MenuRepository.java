package irwin.mango.coffee.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import irwin.mango.coffee.entity.Menu;

public interface MenuRepository extends JpaRepository <Menu, Long>{

}
