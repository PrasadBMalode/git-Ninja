class CinimaTicket{
	
	public String movieName="MARK";
	public int bookingId=78965;
	public long ticketNumber=678954673l;
	public float duration=2.45f;
	public double ticketPrice=350.50d;
	public char seatType='P';
	public boolean isWorth=true;
	
	public void cinima(){
		
		System.out.println( movieName );
		System.out.println( bookingId );
		System.out.println( ticketNumber );
		System.out.println( duration );
		System.out.println( ticketPrice );
		System.out.println( seatType );
		System.out.println( isWorth );
	}
}