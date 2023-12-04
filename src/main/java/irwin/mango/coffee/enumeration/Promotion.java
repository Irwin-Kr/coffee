package irwin.mango.coffee.enumeration;

import lombok.AllArgsConstructor;
import lombok.Getter;
import java.util.Arrays;

@Getter
@AllArgsConstructor
public enum Promotion {
	
	allTime("a"),
	seaonLimit("season"),
	reginalLimit("reginal");

	private final String promo;
	
	public static Promotion getPromo(final String promo) {
		return Arrays.stream(Promotion.values()).filter(test -> test.equals(promo)).findFirst().orElse(null);
	}	
}
