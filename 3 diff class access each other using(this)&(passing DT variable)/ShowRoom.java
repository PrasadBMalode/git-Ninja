class ShowRoom{
	public void showRoomDisplay(BikesData[] bikesData){
		for(int details=0; details<bikesData.length; details++){
			BikesData data=bikesData[details];
			data.bikeDisplay();
		}
	}
	
}