class Room{
	public int roomNumber;
	public boolean isACAvailable;
	
	public Room(int roomNumber,boolean isACAvailable){
		this.roomNumber=roomNumber;
		this.isACAvailable=isACAvailable;
	}
	
	public void roomDisplay(){
		System.out.println(roomNumber);
		System.out.println(isACAvailable);
	}
}