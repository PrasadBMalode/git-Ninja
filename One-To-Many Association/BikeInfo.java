class BikeInfo{
	public String bikeName;
	public boolean isElectricBike;
	public ElectriCity electriCity;
	
	public BikeInfo(String bikeName,boolean isElectricBike,ElectriCity electriCity){
		this.bikeName=bikeName;
		this.isElectricBike=isElectricBike;
		this.electriCity=electriCity;
	}
	
	public void bikeInfoDisplay(){
		System.out.println("Bike name=="+bikeName);
		System.out.println("is this bike electric=="+isElectricBike);
		System.out.println(electriCity.totalunits);
		System.out.println(electriCity.isUsefull);
	}
	
}