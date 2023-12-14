package irwin.mango.coffee.dto;

import irwin.mango.coffee.dto.common.CommonDto;
import irwin.mango.coffee.entity.Category;
import irwin.mango.coffee.enumeration.MajorCategory;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Setter
@Getter
@NoArgsConstructor
@AllArgsConstructor
public class CategoryDto extends CommonDto{
	
	private MajorCategory major;
	private String categoryName;
	
	
	public Category toEntity() {
		return Category.builder().major(major).categoryName(categoryName).build();
	}
	
	public CategoryDto(Category category) {
		this.id = category.getId();
		this.major = category.getMajor();
		this.categoryName = category.getName();
	}

}
