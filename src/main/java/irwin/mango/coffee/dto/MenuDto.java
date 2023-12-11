package irwin.mango.coffee.dto;

import java.time.LocalDateTime;

import irwin.mango.coffee.entity.Brand;
import irwin.mango.coffee.entity.Menu;
import irwin.mango.coffee.enumeration.Promotion;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
public class MenuDto {
	private Long id;
	private String menuName;
	private int price;
	private Promotion promotion;
	private Brand brand;
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
