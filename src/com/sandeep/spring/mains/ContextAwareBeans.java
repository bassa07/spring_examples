package com.sandeep.spring.mains;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.sandeep.spring.ContextAwarePostBox;

public class ContextAwareBeans {
	
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		ApplicationContext context = new ClassPathXmlApplicationContext("xml/SpringBeansCollection.xml");
		
		//It iterates through collection of posts when postbox bean is instantiated.
		ContextAwarePostBox pb = (ContextAwarePostBox)context.getBean("contextAwarePostBox");
		pb.createPosts();
		pb.showPosts();
	}
}
