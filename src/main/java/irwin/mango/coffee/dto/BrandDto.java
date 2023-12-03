package irwin.mango.coffee.dto;

import irwin.mango.coffee.dto.common.CommonDto;
import irwin.mango.coffee.entity.Brand;
import lombok.*;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@ToString
public class BrandDto extends CommonDto{
	
	private String name;
	
	public Brand toEntity() {
		return Brand.builder().name(name).build();
	}
	
}
