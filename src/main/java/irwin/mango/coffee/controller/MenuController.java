package irwin.mango.coffee.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import irwin.mango.coffee.Service.MenuService;
import irwin.mango.coffee.dto.MenuDto;
import irwin.mango.coffee.entity.Menu;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;

@Slf4j
@RequiredArgsConstructor
@RestController
public class MenuController {

	private final MenuService menuService;
	
	// INSERT
	@PostMapping("/api/menu/create")
	public ResponseEntity<Menu> createMenu(@RequestBody MenuDto dto) {
		
		Menu coffee = menuService.save(dto);
		
		log.info("INSERT <<"+"menuName : {}, price : {}, prmo : {}, sale : {}", dto.getMenuName(), dto.getPrice(), dto.getPromotion(), dto.isSale());
		
		return ResponseEntity.status(HttpStatus.CREATED).body(coffee);
	}
	
	// GET
	@GetMapping("/api/menus")
	public ResponseEntity<List<MenuDto>> showMenus() { 
		List<MenuDto> menus = menuService.findAll().stream().map(MenuDto::new).toList();
		
		return ResponseEntity.ok().body(menus);
	}
	
	@GetMapping("/api/menus/{id}")
	public ResponseEntity<MenuDto> showMenu(@PathVariable Long id) {
		Menu coffee = menuService.find(id);
		
		return ResponseEntity.ok().body(new MenuDto(coffee));
		
	}
	
	// UPDATE
	@PutMapping("/api/menu/{id}")
	public ResponseEntity<Menu> updateMenu(@PathVariable Long id, @RequestBody MenuDto dto){
		Menu updateMenu = menuService.update(id, dto);
		
		return ResponseEntity.ok().body(updateMenu);
	}
	
	// DELTE
	@DeleteMapping("/api/menu/del")
	public ResponseEntity<Void> deleteMenu(@PathVariable Long id){
		menuService.delete(id);
		
		return ResponseEntity.ok().build();
		
	}
	
}
