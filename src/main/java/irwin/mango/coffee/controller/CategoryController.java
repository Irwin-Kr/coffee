package irwin.mango.coffee.controller;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

import irwin.mango.coffee.entity.Category;

@RestController
public class CategoryController {
	
	@PostMapping("/api/category")
	public ResponseEntity<Category> createCategory(){
		
		return null;
	}

}
