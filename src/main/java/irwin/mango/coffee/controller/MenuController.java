package irwin.mango.coffee.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import irwin.mango.coffee.Service.MenuService;
import irwin.mango.coffee.dto.MenuDto;
import irwin.mango.coffee.entity.Coffee;
import lombok.RequiredArgsConstructor;

@RequiredArgsConstructor
@RestController
public class MenuController {

	private final MenuService menuService;
	
	@PostMapping("/api/menu/create")
	public String createMenu(@RequestBody MenuDto dto) {
		System.out.println(dto.toString());
		
		Coffee coffee = menuService.save(dto);
		
		return "";
	}
	
}
