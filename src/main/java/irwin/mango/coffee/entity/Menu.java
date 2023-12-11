package irwin.mango.coffee.entity;

import irwin.mango.coffee.cover.PromotionConverter;
import irwin.mango.coffee.entity.comman.Common;
import irwin.mango.coffee.enumeration.Promotion;
import jakarta.persistence.*;
import lombok.AccessLevel;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;

@Entity
@Getter
@NoArgsConstructor(access=AccessLevel.PROTECTED)
public class Menu extends Common{

	@Column(name="menuName", nullable=false)
	private String menuName;
	
	@Column(name="price", nullable=false)
	private int price;
	
	@Column(name="promotion", nullable=false)
	@Convert(converter = PromotionConverter.class)
	private Promotion promotion;
	
	@Column(name="sale", nullable=false)
	private boolean sale;
	
	@ManyToOne(fetch = FetchType.EAGER)
	@JoinColumn(name="brand_id", referencedColumnName="id")
	private Brand brand;

	@Builder
	public Menu(String menuName, int price, Promotion promo, boolean sale, Brand brand) {
		this.menuName = menuName;
		this.price = price;
		this.promotion = promo;
		this.sale = sale;
		this.brand = this.setBrand(brand);
 	}
	
	public void update(int price, Promotion promo, boolean sale) {
		this.price = price;
		this.promotion = promo;
		this.sale = sale;
	}
	public Brand setBrand(Brand brand) {
		this.brand=brand;
		brand.getMenus().add(this);
		
		return brand;
	}
}
