package com.sandeep.spring.mains;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.sandeep.spring.Triangle;

public class AliasExample {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		ApplicationContext context = new ClassPathXmlApplicationContext("xml/SpringBeans.xml");
		//Get the actual object using Alias
		Triangle t1Alias = (Triangle)context.getBean("triangleAlias");
		t1Alias.draw();

		//Get the actual object using bean's Name as an alias 
		Triangle t1Name = (Triangle)context.getBean("triangle-name");
		t1Name.draw();
	}

}
