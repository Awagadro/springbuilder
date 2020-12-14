package configs;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import entities.Cat;
import entities.Dog;
import entities.Parrot;

public class Starter {

	public static void main(String[] args) {
		// создаем пустой спринговый контекст, который будет искать свои бины с помощью
		// java-конфигурации

		ApplicationContext context = new AnnotationConfigApplicationContext(MyConfig.class);

		Cat cat = context.getBean(Cat.class);
		Dog dog = (Dog) context.getBean("getDog"); // имя такое же как метод в конфиге
		Parrot parrot = context.getBean("parrot-kesha", Parrot.class);

		System.out.println(cat.getName());
		System.out.println(dog.getName());
		System.out.println(parrot.getName());
	}

}
