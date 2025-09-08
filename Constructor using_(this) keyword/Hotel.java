class Hotel{
	public Hotel(){
		this(25000);
	}
	
	public Hotel(int rooms){
		this(25000,"Oxford University");
	}
	public Hotel(int rooms, String name){
		
		this(25000,"Oxford University",786453787l);
	}
	public Hotel(int rooms, String name, long registrationId){
		this(25000,"Oxford University",786453787l,92.3f);
		
	}
	public Hotel(int rooms, String name, long registrationId, float starRatting){
		this(25000,"Oxford University",786453787l,92.3f,750.25d);
		
	}
	public Hotel(int rooms, String name, long registrationId, float starRatting, double avgSpend){
		this(25000,"Oxford University",786453787l,92.3f,750.25d, 'A');
		
	}
	public Hotel(int rooms, String name, long registrationId, float starRatting, double avgSpend, char grade){
		this(25000,"Oxford University",786453787l,4.5f,800.45d, 'A',true);
		
	}
	
	public Hotel(int rooms, String name, long registrationId, float starRatting, double avgSpend, char grade, boolean veg){
		System.out.println(rooms);
		System.out.println(name);
		System.out.println(registrationId);
		System.out.println(starRatting);
		System.out.println(avgSpend);
		System.out.println(grade);
		System.out.println(veg);
		
	}
}