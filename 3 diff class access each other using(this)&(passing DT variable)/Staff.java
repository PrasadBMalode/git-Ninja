class Staff{
	public void staffDisplay(SchoolData[] schoolData){
		
		for(int details=0; details<schoolData.length; details++){
			SchoolData data=schoolData[details];
			data.schoolDisplay();
		}
		
	}
}