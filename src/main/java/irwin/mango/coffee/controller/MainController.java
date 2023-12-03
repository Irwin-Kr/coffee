package irwin.mango.coffee.controller;

import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import irwin.mango.coffee.Service.BrandService;
import irwin.mango.coffee.entity.Brand;
import lombok.RequiredArgsConstructor;

@RequiredArgsConstructor
@Controller
public class MainController {

	private final BrandService brandService;
	
	@GetMapping("/")
	public String main(Model model) {

		List<Brand> brandList = brandService.findAll();
		model.addAttribute("brandList", brandList);
		
		return "main";
	}
	
}
