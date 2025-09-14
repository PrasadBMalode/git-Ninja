class Stores{
	public void storesDisplay(MallInfo[] mallInfo){
		
		for(int details=0; details<mallInfo.length; details++){
			MallInfo data=mallInfo[details];
			data.mallDisplay();
		}
		
	}
}