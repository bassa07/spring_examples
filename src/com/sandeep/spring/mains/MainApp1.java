package com.sandeep.spring.mains;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.core.io.FileSystemResource;

import com.sandeep.spring.Triangle;

/**
 * @author bassa07
 *
 */
public class MainApp1 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {		
			BeanFactory factory = new XmlBeanFactory(new FileSystemResource("src/xml/SpringBeans.xml"));			 
			Triangle t = (Triangle)factory.getBean("triangle");			
			t.draw();
			
			ApplicationContext context = new ClassPathXmlApplicationContext("xml/SpringBeans.xml");
			Triangle t1 = (Triangle)context.getBean("triangle");
			t1.draw();
	}
}
