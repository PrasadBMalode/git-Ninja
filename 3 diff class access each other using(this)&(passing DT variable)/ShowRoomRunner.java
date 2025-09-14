class ShowRoomRunner{
	public static void main(String [] args){
		ShowRoom showRoom=new ShowRoom();
		
		BikesData firstBikesData=new BikesData("Hero Splender plus",80.000d);
		BikesData secondBikesData=new BikesData("Royal Enfield",1.50000d);
		BikesData thirdBikesData=new BikesData("TVS Rider",1.30000d);
		BikesData fourthBikesData=new BikesData("Yamaha FZ",1.45000);
		BikesData fifthBikesData=new BikesData("Honda SP 125",1.35000d);
		
		
		BikesData[] bikesData={firstBikesData,secondBikesData,thirdBikesData,
		                        fourthBikesData,fifthBikesData};
		
		showRoom.showRoomDisplay(bikesData);
	}
}