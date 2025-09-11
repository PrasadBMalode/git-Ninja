class ConferenceEventRunner{
	public static void main(String [] args){
		ConferenceEvent conferenceevent=new ConferenceEvent();
		String eventName=conferenceevent.name();
		System.out.println(eventName);
		
		int eventId=conferenceevent.id();
		System.out.println(eventId);
		
		long regNumber=conferenceevent.reg();
		System.out.println(regNumber);
		
		float duration=conferenceevent.timeing();
		System.out.println(duration);
		
		double ticketPrice=conferenceevent.price();
		System.out.println(ticketPrice);
		
		char passType=conferenceevent.type();
		System.out.println(passType);
		
		boolean isOnGoing=conferenceevent.onGoing();
		System.out.println(isOnGoing);
	}
}