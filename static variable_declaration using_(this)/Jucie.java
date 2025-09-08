class Jucie{
	public static int price;
	public static String name;
	public static long series;
	public static float rating;
	public static double avgPrice;
	public static char ranking;
	public static boolean nice;
	
	public Jucie(int price,String name,long series, float rating, double avgPrice, char ranking, boolean nice){
		
		System.out.println("first try="+this.price);
		System.out.println("first try="+this.name);
		System.out.println("first try="+this.series);
		System.out.println("first try="+this.rating);
		System.out.println("first try="+this.avgPrice);
		System.out.println("first try="+this.ranking);
		System.out.println("first try="+this.nice);
		
		this.price=price;
		this.name=name;
		this.series=series;
		this.rating=rating;
		this.avgPrice=avgPrice;
		this.ranking=ranking;
		this.nice=nice;
		
		System.out.println("second try="+this.price);
		System.out.println("second try="+this.name);
		System.out.println("second try="+this.series);
		System.out.println("second try="+this.rating);
		System.out.println("Second try="+this.avgPrice);
		System.out.println("Second try="+this.ranking);
		System.out.println("Second try="+this.nice);
		
		
	}
}