package utilities;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.StandardCopyOption;

public class FileMover {
	
	private final String basePath;
	
	public FileMover(String basPath) {
		this.basePath = basPath;
	}
	
	public FileMover() {
		basePath = System.getProperty("user.dir");
	}
	
	public boolean copy(String fromPath, String toPath) {
		Path from = Paths.get(basePath + fromPath);
		Path to = Paths.get(basePath + toPath);
		try {
			Files.copy(from, to, StandardCopyOption.REPLACE_EXISTING);
			return true;
		} catch (IOException e) {
			e.printStackTrace();
			return false;
		}
	}

}
