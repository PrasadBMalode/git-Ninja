class TravelTicket{
	
	public String destination="Mysore";
	
	public int pnr=1234567;
	
	public long ticketNumber=78653465l;
	
	public float distance=255.5f;
	
	public double fare=999.99d;
	
	public char classType='S';
	
	public boolean isConfirmed=true;
	
	public void travel(){
		
		System.out.println("travaling place "+ destination );
		
		System.out.println(" pNR Number"+ pnr );
		
		System.out.println(" ticket Number"+ ticketNumber );
		
		System.out.println(" total distance"+ distance );
		
		System.out.println(" ticket total fare"+ fare );
		
		System.out.println(" Class type of travaling"+ classType );
		
		System.out.println(" is ticket confirmed"+ isConfirmed);
	}
}