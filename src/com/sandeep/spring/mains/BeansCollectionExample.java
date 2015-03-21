package com.sandeep.spring.mains;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.sandeep.spring.PostBox;

public class BeansCollectionExample {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		ApplicationContext context = new ClassPathXmlApplicationContext("xml/SpringBeansCollection.xml");
		
		//It iterates through collection of posts when postbox bean is instantiated.
		PostBox pb = (PostBox)context.getBean("postBox");
		pb.showPosts();

		//Bean autoWiring Example
	}

}
