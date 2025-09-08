class IceCream{
	public IceCream(){
		//System.out.println("its  a default constructor");
		this(200);
	}
	
	public IceCream(int price){
		this(200,"venila");
		//System.out.println(price);
		
	}
	public IceCream(int price, String name){
		//System.out.println(price);
		//System.out.println(name);
		this(200,"venila",786453787l);
		
		
	}
	public IceCream(int price, String name, long series){
		this(200,"venila",786453787l,1.4f);
		
	}
	
	public IceCream(int price, String name, long series, float temprature){
		this(200,"venila",786453787l,1.4f,1.657d);
		
	}
	public IceCream(int price, String name, long series, float temprature, double verity){
		this(200,"venila",786453787l,1.4f,1.657d, 'A');
		
	}
	public IceCream(int price, String name, long series, float temprature, double verity, char grade){
		this(200,"venila",786453787l,1.4f,1.657d, 'A',true);
		
	}
	
	public IceCream(int price, String name, long series, float temprature, double verity, char grade, boolean testy){
		System.out.println(price);
		System.out.println(name);
		System.out.println(series);
		System.out.println(temprature);
		System.out.println(verity);
		System.out.println(grade);
		System.out.println(testy);
		
	}
}