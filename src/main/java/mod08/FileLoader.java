package mod08;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;

public class FileLoader {

	public String readFile(String fileName) {
		try {
			return Files.readAllLines(Paths.get(fileName)).toString();

		} catch (IOException e) {
			e.printStackTrace(System.out);
		}
		return null;

	}
}
