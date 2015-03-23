package com.sandeep.spring;

public class IceCream {

	String name;
	int price;
	
	public IceCream()
	{
		System.out.println("IceCream In default Constructor : " + name + ":" + price);
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
	
	public void myBeansGlobalInit()
	{
		System.out.println("IceCream AllBeansDefault Init Method : myBeansGlobalInit");
	}
	public void myBeansGolbalDestroy()
	{
		System.out.println("IceCream AllBeansDestroy method : myBeansGlobalDestroy");
	}
}
