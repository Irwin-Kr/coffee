package irwin.mango.coffee.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class MenuViewController {
	
	@GetMapping("/newMenu")
	public String newMenu() {
		return "coffee/menu";
	}

}
