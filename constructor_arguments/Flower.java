class Flower{
	public Flower(){
		System.out.println("its a default constructor");
	}
	public Flower(int cost){
		System.out.println(cost);
	}
	public Flower(int amount, long series){
		System.out.println(amount);
		System.out.println(series);
	}
	public Flower(int price, long total, float rating){
		System.out.println(price);
		System.out.println(total);
		System.out.println(rating);
	}
	public Flower(int number, long varity, float ranking, double rate){
		System.out.println(number);
		System.out.println(varity);
		System.out.println(ranking);
		System.out.println(rate);
	}
	public Flower(int year, long users, float temparature, double mass, char grade){
		System.out.println(year);
		System.out.println(users);
		System.out.println(temparature);
		System.out.println(mass);
		System.out.println(grade);
	}
	public Flower( long series,int cost, float temparature, char grade, double rate, boolean good ){
		System.out.println(series);
		System.out.println(cost);
		System.out.println(temparature);
		System.out.println(rate);
		System.out.println(grade);
		System.out.println(good);
		
	}
	public Flower(  long series,int cost, float temparature, char grade, double rate, boolean good, String name ){
		System.out.println(series);
		System.out.println(cost);
		System.out.println(temparature);
		System.out.println(rate);
		System.out.println(grade);
		System.out.println(good);
		System.out.println(name);
		
	}
}