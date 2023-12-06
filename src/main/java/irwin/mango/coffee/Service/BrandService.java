package irwin.mango.coffee.Service;

import java.util.List;

import org.springframework.stereotype.Service;

import irwin.mango.coffee.dto.BrandDto;
import irwin.mango.coffee.entity.Brand;
import irwin.mango.coffee.repository.BrandRepository;
import lombok.RequiredArgsConstructor;

@RequiredArgsConstructor
@Service
public class BrandService {
	
	private final BrandRepository brandRepo;
	
	// 삽입
	public Brand save(BrandDto dto) {
		return brandRepo.save(dto.toEntity());
	}
	
	// 브랜드 전체 조회
	public List<Brand> findAll(){
		return brandRepo.findAll();
	}
	
	// 브랜드 단일 조회
	public Brand find(Long id) {
		
		return brandRepo.findById(id).orElse(null);
	}
	
	// 브랜드 수정
	public Brand update(Long id, BrandDto dto) {
		
		Brand brand = brandRepo.findById(id).orElse(null);
		brand.update(dto.getName());
		
		return brand;
	}

}
