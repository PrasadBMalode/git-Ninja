class HouseRunner{
	public static void main(String [] args){
		Room room=new Room(108,true);
		House house=new House("Brundavana",25000,room);
		house.houseDisplay();
	}
}