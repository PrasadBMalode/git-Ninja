class CarInfo{
	public String carName;
	public double carPrice;
	public boolean isEVCar;
	public ElectriCity electriCity;
	
	public CarInfo(String carName,double carPrice,boolean isEVCar,ElectriCity electriCity){
		this.carName=carName;
		this.carPrice=carPrice;
		this.isEVCar=isEVCar;
		this.electriCity=electriCity;
	}
	
	public void carInfoDisplay(){
		System.out.println("car name=="+carName);
		System.out.println("car price in lakh=="+carPrice);
		System.out.println("is that electric car"+isEVCar);
		System.out.println(electriCity.totalunits);
		System.out.println(electriCity.isUsefull);
		
	}
	
}