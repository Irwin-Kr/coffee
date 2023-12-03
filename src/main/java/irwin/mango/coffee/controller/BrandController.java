package irwin.mango.coffee.controller;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import irwin.mango.coffee.Service.BrandService;
import irwin.mango.coffee.dto.BrandDto;
import irwin.mango.coffee.entity.Brand;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;

@Slf4j
@RestController
@RequiredArgsConstructor
public class BrandController {
	
	private final BrandService brandService;
	
	@PostMapping("/api/brand/crate")
	public ResponseEntity<Brand> createBrand(@RequestBody BrandDto dto){
		Brand brand = brandService.save(dto);
		
		return ResponseEntity.status(HttpStatus.CREATED).body(brand);
	}

}
