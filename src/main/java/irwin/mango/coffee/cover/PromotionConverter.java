package irwin.mango.coffee.cover;

import irwin.mango.coffee.enumeration.Promotion;
import jakarta.persistence.AttributeConverter;

public class PromotionConverter implements AttributeConverter<Promotion, String>{

	// 데이터베이스에 요청을 보낼때 암호화
	@Override
	public String convertToDatabaseColumn(Promotion attribute) {
		
		if(attribute == null) {
			return null;
		}
		
		return attribute.getPromo();
	}

	// 데이터베이스에서 값을 받을때 복호화
	@Override
	public Promotion convertToEntityAttribute(String dbData) {
		
		if(dbData == null) {
			return null;
		}
		
		return Promotion.getPromo(dbData);
	}

}
