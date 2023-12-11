package irwin.mango.coffee.entity;

import java.util.ArrayList;
import java.util.List;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;

import irwin.mango.coffee.entity.comman.Common;
import jakarta.persistence.*;
import lombok.AccessLevel;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;

@Entity
@Getter
@NoArgsConstructor(access = AccessLevel.PROTECTED)
public class Brand extends Common{
	
	@JsonProperty("name")
	@Column(name="name", nullable=false)
	private String name;
	
	@OneToMany(mappedBy="brand", cascade = CascadeType.ALL)
	@JsonIgnoreProperties({"brand"})
	private List<Menu> menus = new ArrayList<>();
	
	@Builder
	public Brand(Long id, String name) {
			this.name = name;
	}
	
	public void update(String name) {
		this.name = name;
	}
	
	public void addMenu(Menu menu) {
		this.menus.add(menu);
		menu.setBrand(this);
		
	}
		
}
