class MobileChargingInfo{
	public String mobileName;
	public int chargerWatts;
	public ElectriCity electriCity;
	
	public MobileChargingInfo(String mobileName,int chargerWatts,ElectriCity electriCity){
		this.mobileName=mobileName;
		this.chargerWatts=chargerWatts;
		this.electriCity=electriCity;
	}
	
	
	public void MobileChargingInfo_Display(){
		System.out.println("mobile brand name=="+mobileName);
		System.out.println("how much charger watts=="+chargerWatts);
		System.out.println(electriCity.totalunits);
		System.out.println(electriCity.isUsefull);
	}
}