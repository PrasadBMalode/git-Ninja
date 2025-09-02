class Hostel{
	public Hostel(){
		System.out.println("its a default constructor")
	}
	public Hostel(String name){
		System.out.println(name);
	}
	public Hostel(String name, int count){
		System.out.println(name);
		System.out.println(count);
		
	}
	public Hostel(String name, int count, long code){
		System.out.println(name);
		System.out.println(count);
		System.out.println(code);
	}
	public Hostel(String name, int count, long code,float rating){
		System.out.println(name);
		System.out.println(count);
		System.out.println(code);
		System.out.println(rating);
	}
    public Hostel(String name, int count, long code,float rating, double cost){
		System.out.println(name);
		System.out.println(count);
		System.out.println(code);
		System.out.println(rating);
		System.out.println(cost);
	}
	public Hostel(String name, int count, long code,float rating, double cost, char rank){
		System.out.println(name);
		System.out.println(count);
		System.out.println(code);
		System.out.println(rating);
		System.out.println(cost);
		System.out.println(rank);
	}	
	public Hostel(String name, int count, long code,float rating, double cost, char rank, boolean fine){
		System.out.println(name);
		System.out.println(count);
		System.out.println(code);
		System.out.println(rating);
		System.out.println(cost);
		System.out.println(rank);
		System.out.println(fine);
	}	
	
	
}