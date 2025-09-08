class Flight{
	public static int passengerCapacity;
	public static String flightName;
	public static long idNumber;
	public static float speed;
	public static double ticketFare;
	public static char seatClass;
	public static boolean isInternational;
	
	public Flight(int passengerCapacity,String flightName,long idNumber, float speed, double ticketFare, char seatClass, boolean isInternational){
		
		System.out.println("first try="+this.passengerCapacity);
		System.out.println("first try="+this.flightName);
		System.out.println("first try="+this.idNumber);
		System.out.println("first try="+this.speed);
		System.out.println("first try="+this.ticketFare);
		System.out.println("first try="+this.seatClass);
		System.out.println("first try="+this.isInternational);
		
		this.passengerCapacity=passengerCapacity;
		this.flightName=flightName;
		this.idNumber=idNumber;
		this.speed=speed;
		this.ticketFare=ticketFare;
		this.seatClass=seatClass;
		this.isInternational=isInternational;
		
		System.out.println("second try="+this.passengerCapacity);
		System.out.println("second try="+this.flightName);
		System.out.println("second try="+this.idNumber);
		System.out.println("second try="+this.speed);
		System.out.println("Second try="+this.ticketFare);
		System.out.println("Second try="+this.seatClass);
		System.out.println("Second try="+this.isInternational);
		
		
	}
}