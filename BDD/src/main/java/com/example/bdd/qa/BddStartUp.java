package com.example.bdd.qa;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public final class BddStartUp {

	public static void main(String[] args) {
		@SuppressWarnings("resource")
		ApplicationContext context = new AnnotationConfigApplicationContext(SpringContext.class);
		BddFrame bddFrame = (BddFrame) context.getBean("bddFrame");
		bddFrame.init();
	}
}
