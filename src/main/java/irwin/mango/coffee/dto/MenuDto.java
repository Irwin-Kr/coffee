package irwin.mango.coffee.dto;

import java.time.LocalDateTime;

import irwin.mango.coffee.entity.Brand;
import irwin.mango.coffee.entity.Menu;
import irwin.mango.coffee.enumeration.Promotion;
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
	private Brand brand;
	private Promotion promotion;
	private boolean sale;
	private LocalDateTime regDt;
	private LocalDateTime modDt;
	
	public Menu toEntity() {
		return Menu.builder().menuName(menuName).price(price).promo(promotion).sale(sale).brand(brand).build();
	}
	
	public MenuDto(Menu menu) {
		this.menuName = menu.getMenuName();
		this.price = menu.getPrice();
		this.promotion = menu.getPromotion();
		this.sale = menu.isSale();
	}
}
