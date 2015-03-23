package com.sandeep.spring.mains;

import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.sandeep.spring.Chocolate;
import com.sandeep.spring.IceCream;

public class BeanLifeCycleMethodsExample {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		AbstractApplicationContext context = new ClassPathXmlApplicationContext("xml/BeanLifeCycle.xml");
		context.registerShutdownHook();
		Chocolate ch = (Chocolate)context.getBean("chocolate");		
		IceCream ic = (IceCream)context.getBean("icecream"); 
	}

}
