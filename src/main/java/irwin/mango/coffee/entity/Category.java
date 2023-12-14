package irwin.mango.coffee.entity;

import irwin.mango.coffee.entity.comman.Common;
import irwin.mango.coffee.enumeration.MajorCategory;
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
	
	@Column(name="major")
	private MajorCategory major;
	
	@Column(name="categoryName", nullable=false)
	private String name;
	
	@Builder
	public Category(Long id, MajorCategory major, String categoryName) {
		this.major = major;
		this.name = categoryName;
	}

}
