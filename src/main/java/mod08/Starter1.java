package mod08;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import mod08.original.IText;

public class Starter1 {
	public static void main(String[] args) throws Exception {
		// Добавить метод, в который передается объект класса и если в классе есть
		// String поля, то делать для них проверку на правильность раставления скобок
//		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("context.xml");	
		
		ApplicationContext context = new AnnotationConfigApplicationContext(MyConfig.class);


		IText text = context.getBean(IText.class);
		System.out.println(text.toString());

	}

}
