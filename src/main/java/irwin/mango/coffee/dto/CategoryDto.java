package irwin.mango.coffee.dto;

import irwin.mango.coffee.entity.Category;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Setter
@Getter
@NoArgsConstructor
@AllArgsConstructor
public class CategoryDto {
	
	private Long id;
	private String categoryName;
	
	public Category toEntity() {
		return Category.builder().categoryName(categoryName).build();
	}
	
	public CategoryDto(Category category) {
		this.id = category.getId();
		this.categoryName = category.getCategoryName();
	}

}
