class PgRoom{
	public String roomMatesNames;
	public int roomNumbers;
	
	public PgRoom(String roomMatesNames,int roomNumbers){
		this.roomMatesNames=roomMatesNames;
		this.roomNumbers=roomNumbers;
	}
	
	public void pgRoomDisplay(){
		System.out.println(roomMatesNames);
		System.out.println(roomNumbers);
	}
}