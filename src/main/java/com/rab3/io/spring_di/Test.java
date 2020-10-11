package com.rab3.io.spring_di;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Test {
	public static void main(String[] args) {
		AnnotationConfigApplicationContext annotationConfigApplicationContext = new AnnotationConfigApplicationContext(
				BeanConfiguration.class);
		annotationConfigApplicationContext.getBean("student", Student.class);
		//school.studentPrint("print student name");
	}

}
