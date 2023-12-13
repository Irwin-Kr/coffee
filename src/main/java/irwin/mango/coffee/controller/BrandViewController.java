package irwin.mango.coffee.controller;

import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import irwin.mango.coffee.Service.BrandService;
import irwin.mango.coffee.entity.Brand;
import lombok.RequiredArgsConstructor;

@Controller
public class BrandViewController {
	
	@GetMapping("/newBrand")
	public String newMenu(Model model) {
		
		return "coffee/brand";
	}

}
