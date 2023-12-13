package irwin.mango.coffee.controller;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import irwin.mango.coffee.Service.BrandService;
import irwin.mango.coffee.dto.BrandDto;
import irwin.mango.coffee.entity.Brand;
import lombok.RequiredArgsConstructor;

@RestController
@RequiredArgsConstructor
public class BrandController {
	
	private final BrandService brandService;
	
	@PostMapping("/api/brand/create")
	public ResponseEntity<Brand> createBrand(@RequestBody BrandDto dto){
		Brand brand = brandService.save(dto);
		
		return ResponseEntity.status(HttpStatus.CREATED).body(brand);
	}

	@GetMapping("/api/brand/{name}")
	public ResponseEntity<BrandDto> showBrand(@PathVariable String name){
		Brand brand = brandService.findName(name);
		
		return ResponseEntity.ok().body(new BrandDto(brand));
	}

}
