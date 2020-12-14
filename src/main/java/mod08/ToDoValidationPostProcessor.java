package mod08;

import java.lang.reflect.Field;

import org.springframework.beans.factory.config.BeanPostProcessor;

import mod08.original.ToDoValidation;

public class ToDoValidationPostProcessor implements BeanPostProcessor {

	@Override
	public Object postProcessBeforeInitialization(Object bean, String BeanName) {
		return bean;
	}

	@Override
	public Object postProcessAfterInitialization(Object bean, String BeanName) {
		Field[] fields = bean.getClass().getDeclaredFields();
		for (Field field : fields) {
			ToDoValidation annotation = field.getAnnotation(ToDoValidation.class);
			if (annotation != null) {
				try {
					field.setAccessible(true);
					String input = (String) field.get(bean);
					BracketChecker checker = new BracketChecker();
					checker.getResult(input);
				} catch (Exception e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}

			}
		}
		return bean;
	}
}
