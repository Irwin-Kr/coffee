package irwin.mango.coffee.dto.common;

import java.time.LocalDateTime;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class CommonDto {

	protected String id;
	protected LocalDateTime regDt;
	protected LocalDateTime modDt;
	
}
