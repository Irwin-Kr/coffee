package irwin.mango.coffee.entity;

import irwin.mango.coffee.entity.comman.Common;
import jakarta.persistence.*;
import lombok.AccessLevel;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;

@Entity
@Getter
@AllArgsConstructor
@NoArgsConstructor(access = AccessLevel.PROTECTED)
public class Brand extends Common{
	
	@Column(name="name", nullable=false, unique=true)
	private String name;
	
	@Builder
	public Brand(Long id, String name) {
		this.name = name;
	}
	
	public void update(String name) {
		this.name = name;
	}
}
