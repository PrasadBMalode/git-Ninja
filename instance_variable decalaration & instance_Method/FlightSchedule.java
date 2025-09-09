class FlightSchedule{
	
	public String airlineName="INDIGO";
	public int flightId=87654;
	public long bookingRef=9876875643l;
	public float flightDuration=2.45f;
	public double ticketFare=18500.99d;
	public char fligtType='I';
	public boolean isOnTime=true;
	
	public void flight(){
		
		System.out.println(" plain name= "+ airlineName );
		System.out.println("travaling flight id= "+ flightId );
		System.out.println(" airline booking ref="+ bookingRef );
		System.out.println(" travaling duration on plain="+ flightDuration );
		System.out.println(" total amount for ticket="+ ticketFare );
		System.out.println(" which type of travaling="+ fligtType );
		System.out.println(" is flght on time right="+ isOnTime );
	}
}