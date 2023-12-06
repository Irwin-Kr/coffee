package irwin.mango.coffee.Service;

import java.util.List;

import org.springframework.stereotype.Service;

import irwin.mango.coffee.dto.MenuDto;
import irwin.mango.coffee.entity.Menu;
import irwin.mango.coffee.repository.MenuRepository;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;

@Slf4j
@RequiredArgsConstructor
@Service
public class MenuService {
	
	private final MenuRepository menuRepo;
	
	// 메뉴 삽입
	public Menu save(MenuDto dto) {
		log.info("INSERT <<"+"menuName : {}, price : {}, prmo : {}, sale : {}, brand : {}", dto.getMenuName(), dto.getPrice(), dto.getPromotion(), dto.isSale(), dto.getBrand());
		return menuRepo.save(dto.toEntity());
	}
	
	// 메뉴 전체 조회
	public List<Menu> findAll(){
		return menuRepo.findAll();
	}
	
	// 메뉴 단일 조회
	public Menu find(Long id) {
		return menuRepo.findById(id).orElse(null);
	}
	
	// 메뉴 삭제
	public void delete(Long id) {
		
		Menu menu = menuRepo.findById(id).orElse(null);
		
		menuRepo.delete(menu);
	}
	
	// 메뉴 수정
	public Menu update(Long id, MenuDto dto) {
		Menu menu = menuRepo.findById(id).orElse(null);
		
		menu.update(dto.getPrice(), dto.getPromotion(), dto.isSale());
		
		return menu;
		
	}

}
