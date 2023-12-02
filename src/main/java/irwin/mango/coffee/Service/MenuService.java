package irwin.mango.coffee.Service;

import org.springframework.stereotype.Service;

import irwin.mango.coffee.dto.MenuDto;
import irwin.mango.coffee.entity.Coffee;
import irwin.mango.coffee.repository.MenuRepository;
import lombok.RequiredArgsConstructor;

@RequiredArgsConstructor
@Service
public class MenuService {
	
	private final MenuRepository menuRepo;
	
	public Coffee save(MenuDto dto) {
		
		return menuRepo.save(dto.toEntity());
	}

}
