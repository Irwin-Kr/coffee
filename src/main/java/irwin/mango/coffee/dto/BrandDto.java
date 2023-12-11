package irwin.mango.coffee.dto;

import java.util.ArrayList;
import java.util.List;

import irwin.mango.coffee.dto.common.CommonDto;
import irwin.mango.coffee.entity.Brand;
import irwin.mango.coffee.entity.Menu;
import lombok.*;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@ToString
public class BrandDto extends CommonDto{
	
	private String name;
	
	private List<Menu> menus = new ArrayList<>();
	
	public Brand toEntity() {
		return Brand.builder().name(name).build();
	}
	
	public BrandDto(Brand brand) {
		this.id = brand.getId();
		this.name = brand.getName();
	}

}
