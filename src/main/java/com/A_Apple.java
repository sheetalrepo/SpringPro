package com;

/**
 * 
 * To use market object, it need to be passed from spring.xml
 * 
 * @author Sheetal_Singh
 *
 */
public class A_Apple {

	private int price;
	private int weight;
	A_Market market;
	
	//Constructor
	public A_Apple(){
		System.out.println("Apple Contructor");
	}
	
	public A_Apple(int weight){
		this.setWeight(weight);
		System.out.println("Apple Weight Contructor: " + weight);
	}
	
	
	//Methods	
	public void testApple() {
		System.out.println("Test Apple Method...");
	}
	
	public void testAppleMarket() {
		market.isOpen();
	}

	
	
	//Getters and Setters
	public void setPrice(int price) {
		System.out.println("Apple Setters");
		this.price = price;
	}
	
	public int getPrice() {
		return price;
	}

	public A_Market getMarket() {
		return market;
	}

	public void setMarket(A_Market market) {
		this.market = market;
	}

	public int getWeight() {
		return weight;
	}

	public void setWeight(int weight) {
		this.weight = weight;
	}

}
