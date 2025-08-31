class Bag{
	public Bag(){
		System.out.println("its a default constructor");
	}
	public Bag(int price){
		System.out.println(price);
	}
	public Bag(String name, int cost){
		System.out.println(name);
		System.out.println(cost);
		
	}
	public Bag(String name, double cost, float rating){
		System.out.println(name);
		System.out.println(cost);
		System.out.println(rating);
	}
	public Bag(char rate, boolean good, long series){
		System.out.println(rate);
		System.out.println(good);
		System.out.println(series);
	}
	
}