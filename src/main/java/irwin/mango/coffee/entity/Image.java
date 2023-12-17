package irwin.mango.coffee.entity;

import irwin.mango.coffee.entity.comman.Common;
import jakarta.persistence.Entity;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import lombok.AccessLevel;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;

@Getter
@Entity
@NoArgsConstructor(access=AccessLevel.PROTECTED)
public class Image extends Common{
	
	private String orginFileName;
	
	private String storeFileName;
	
	private String type;
	
	@ManyToOne
	@JoinColumn(name="menu", referencedColumnName="id")
	private Menu menu;
	
	@Builder
	public Image(String orgin, String store, String type) {
		this.orginFileName = orgin;
		this.storeFileName = store;
		this.type=type;
	}

}
