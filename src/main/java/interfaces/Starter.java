package interfaces;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import entities.Cat;
import entities.Dog;
import entities.Parrot;

public class Starter {

	public static void main(String[] args) {
		// создаем пустой спринговый контекст, который будет искать свои бины по
		// аннотациям в указанном пакете

		ApplicationContext context = new AnnotationConfigApplicationContext(MyConfig.class);

		WeekDay weekDay = context.getBean(WeekDay.class);
		System.out.println("It's " + weekDay.getWeekDayName() + " today!");
	}

}
