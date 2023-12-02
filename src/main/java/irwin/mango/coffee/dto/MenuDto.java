package irwin.mango.coffee.dto;

import java.time.LocalDateTime;

import irwin.mango.coffee.entity.Coffee;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.ToString;

@NoArgsConstructor
@AllArgsConstructor
@Getter
@ToString
public class MenuDto {
	private String menuName;
	private int price;
	private String promotion;
	private boolean sale;
	private LocalDateTime regDt;
	private LocalDateTime modDt;
	
	public Coffee toEntity() {
		return Coffee.builder().menuName(menuName).price(price).promo(promotion).sale(sale).build();
	}
}
