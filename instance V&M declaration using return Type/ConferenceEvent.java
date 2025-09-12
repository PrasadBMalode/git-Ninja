class ConferenceEvent{
	public String eventName="Tech Summit";
	public int eventId=567645;
	public long regNumber=8787656545l;
	public float duration=3.5f;
	public double ticketPrice=2499.99d;
	public char passType='G';
	public boolean isOnGoing=false;
	
	public String name(){
		return eventName;
	}
	public int id(){
		return eventId;
	}
	public long reg(){
		return regNumber;
	}
	public float timeing(){
		return duration;
	}
	public double price(){
		return ticketPrice;
	}
	public char type(){
		return passType;
	}
	public boolean onGoing(){
		return isOnGoing;
	}
	
	
}