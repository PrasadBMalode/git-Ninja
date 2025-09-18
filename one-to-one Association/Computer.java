class Computer{
	public String brandName;
	public double price;
	public KeyBored keyBored;
	
	
	public Computer(String brandName,double price,KeyBored keyBored){
		this.brandName=brandName;
		this.price=price;
		this.keyBored=keyBored;
	}
	
	public void computerDisplay(){
		System.out.println(brandName);
		System.out.println(price);
		
		System.out.println(keyBored.keyBoredName);
		System.out.println(keyBored.keyBoredSize);
	}
	
}