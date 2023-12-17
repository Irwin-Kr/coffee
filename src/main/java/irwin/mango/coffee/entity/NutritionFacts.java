package irwin.mango.coffee.entity;

import irwin.mango.coffee.entity.comman.Common;
import jakarta.persistence.Entity;
import jakarta.persistence.OneToOne;
import lombok.AccessLevel;
import lombok.Getter;
import lombok.NoArgsConstructor;

@Entity
@Getter
@NoArgsConstructor(access=AccessLevel.PROTECTED)
public class NutritionFacts extends Common{
	
	//칼로리
	private int calories;
	
	// 지방
	private int saturatedFat;
	private int transFat;
	
	// 콜레스테롤
	private int cholesterol;
	
	// 나트륨
	private int sodium;
	
	// 탄수화물
	private int dietaryFiber;
	private int sugars;
	
	// 단백질
	private int protein;
	
	// 카페인
	private int caffeine;
	
	// 알레르기
	private String allergens;
	
	@OneToOne(mappedBy="nutritionFacts")
	private MenuDetail menuDetail;

}
