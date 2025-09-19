class ElectriCity_UsageRunner{
	public static void main(String [] args){
		
		ElectriCity electriCity=new ElectriCity(260,true);
		
		SpeekerInfo speekerInfo=new SpeekerInfo("Mivi",true,electriCity);
		MoterInfo moterInfo=new MoterInfo("Havells 5W moter",10499,electriCity);
		MobileChargingInfo mobileChargingInfo=new MobileChargingInfo("VIVO",44,electriCity);
		FridgInfo FridgInfo=new FridgInfo("Whirlpool",21999,electriCity);
		BikeInfo bikeInfo=new BikeInfo("X-Pulse",false,electriCity);
		CarInfo carInfo=new CarInfo("Mahendra EV car",15.49d,true,electriCity);
		
		carInfo.carInfoDisplay();
		FridgInfo.fridgInfoDisplay();
		electriCity.electriCityDisplay();
		speekerInfo.speekerInfoDisplay();
		mobileChargingInfo.MobileChargingInfo_Display();
		moterInfo.moterInfoDisplay();
		bikeInfo.bikeInfoDisplay();
		
		
	}
}