package com.sandeep.spring;

import org.springframework.beans.factory.DisposableBean;
import org.springframework.beans.factory.InitializingBean;

public class Chocolate implements InitializingBean, DisposableBean{
	String name;
	int price;
	
	public Chocolate()
	{
		System.out.println("Chocolate In default Constructor : " + name + ":" + price);
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getPrice() {
		return price;
	}
	public void setPrice(int price) {
		this.price = price;
	}
	@Override
	public void destroy() throws Exception {
		System.out.println("Chocolate Disposable Bean: Destroy method");
		
	}
	@Override
	public void afterPropertiesSet() throws Exception {
		System.out.println("Chocolate Initializing Bean: afterProperties set");
		
	}

	public void myBeanInit()
	{
		System.out.println("Chocolate BeanSpecificInitiMethod : In MyBeanInit");
	}
	public void myBeanDestroy()
	{
		System.out.println("Chocolate BeanSpecific Destroy method : In MyBeanDestroy");
	}
	public void myBeansGlobalInit()
	{
		System.out.println("Chocolate AllBeansDefault Init Method : myBeansGlobalInit");
	}
	public void myBeansGolbalDestroy()
	{
		System.out.println("Chocolate AllBeansDestroy method : myBeansGlobalDestroy");
	}
}
