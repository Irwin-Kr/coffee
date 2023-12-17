package irwin.mango.coffee.util;

import java.io.IOException;
import java.util.UUID;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;
import org.springframework.web.multipart.MultipartFile;

import irwin.mango.coffee.entity.Image;

@Component
public class FileSave {
	
	@Value("${file.dir}/")
	private String fileDir;
	
	private String ext(String orgin) {
		int idx = orgin.lastIndexOf(".");
		String ext = orgin.substring(idx);
		return ext;
	}
	
	private String createSaveFile(String orgin) {
		String uuid = UUID.randomUUID().toString();
		String ext = ext(orgin);
		String saveFile = uuid+ext;
		
		return saveFile;
		
	}

}
