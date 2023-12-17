package irwin.mango.coffee.entity;

import irwin.mango.coffee.entity.comman.Common;
import irwin.mango.coffee.enumeration.Type;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.OneToOne;
import lombok.AccessLevel;
import lombok.Getter;
import lombok.NoArgsConstructor;

@Entity
@Getter
@NoArgsConstructor(access = AccessLevel.PROTECTED)
public class MenuDetail extends Common{
	
	@OneToOne(mappedBy="menuDetail")
	private Menu menu;
	
	@Column(name="comment")
	private String comment;
	
	@OneToOne
	@JoinColumn(name="nutritionFacts", referencedColumnName="id")
	private NutritionFacts nutritionFacts;
	
	@Column(name="size")
	private int size;
	
	@Column(name="type")
	private Type type;
	

}
