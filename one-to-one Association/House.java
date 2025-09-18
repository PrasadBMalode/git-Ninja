class House{
	public String houseName;
	public int houseRent;
	public Room room;
	
	public House(String houseName,int houseRent,Room room){
		
		this.houseName=houseName;
		this.houseRent=houseRent;
		this.room=room;
	}
	
	public void houseDisplay(){
		System.out.println(houseName);
		System.out.println(houseRent);
		System.out.println(room.roomNumber);
		System.out.println(room.isACAvailable);
		
	}
}