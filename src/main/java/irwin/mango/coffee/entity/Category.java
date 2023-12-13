package irwin.mango.coffee.entity;

import irwin.mango.coffee.entity.comman.Common;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import lombok.AccessLevel;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;

@Entity
@Getter
@NoArgsConstructor(access=AccessLevel.PROTECTED)
public class Category extends Common{
	
	@Column(name="categoryName", nullable=false)
	private String categoryName;
	
	@Builder
	public Category(Long id, String categoryName) {
		this.categoryName = categoryName;
	}

}
