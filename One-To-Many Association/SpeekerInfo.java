class SpeekerInfo{
	
	public String speekersName;
	public boolean goodQuality;
	public ElectriCity electriCity;
	
	public SpeekerInfo(String speekersName,boolean goodQuality,ElectriCity electriCity){
		this.speekersName=speekersName;
		this.goodQuality=goodQuality;
		this.electriCity=electriCity;
	}
	
	public void speekerInfoDisplay(){
		System.out.println("speeker brand name=="+speekersName);
		System.out.println("is it good quality=="+goodQuality);
		System.out.println(electriCity.totalunits);
		System.out.println(electriCity.isUsefull);
	}
	
}