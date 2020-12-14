package mod08;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import mod08.original.IText;
import mod08.original.TextImpl;

@Configuration
public class MyConfig {
	final String fileName = "src\\main\\resources\\data\\text.txt";

	@Bean
	public FileLoader getFileLoader() {
		return new FileLoader();
	}

	@Bean
	public IText getIText(FileLoader fileLoader) {
		TextImpl text = new TextImpl();
		String contents = fileLoader.readFile(fileName);
		text.setContents(contents);
		text.setAuthor("Автор");
		text.setTitle("<Заголовок>");
		return text;
	}

	@Bean
	public ToDoValidationPostProcessor getToDoValidationPostProcessor() {
		return new ToDoValidationPostProcessor();
	}

}
