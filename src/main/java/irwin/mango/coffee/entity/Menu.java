package irwin.mango.coffee.entity;

import java.time.LocalDateTime;

import org.springframework.data.annotation.CreatedDate;
import org.springframework.data.annotation.LastModifiedDate;

import jakarta.persistence.*;
import lombok.AccessLevel;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;

@Entity
@Getter
@NoArgsConstructor(access=AccessLevel.PROTECTED)
public class Menu {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name="id", updatable=false)
	private Long id;
	
	@Column(name="menuName", nullable=false)
	private String menuName;
	
	@Column(name="price", nullable=false)
	private int price;
	
	@Column(name="promotion", nullable=false)
	private String promotion;
	
	@Column(name="sale", nullable=false)
	private boolean sale;
	
	@CreatedDate
	@Column(name="regDt")
	private LocalDateTime regDt;
	
	@LastModifiedDate
	@Column(name="modDt")
	private LocalDateTime modDt;
	
	@Builder
	public Menu(String menuName, int price, String promo, boolean sale) {
		this.menuName = menuName;
		this.price = price;
		this.promotion = promo;
		this.sale = sale;
	}
	
	public void update(int price, String promo, boolean sale) {
		this.price = price;
		this.promotion = promo;
		this.sale = sale;
	}
}
