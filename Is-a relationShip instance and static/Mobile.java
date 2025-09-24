class Mobile extends Device{
	public static void displayMobile(){
		deviceName="SAMSUNG";
		System.out.println(deviceName);
	}
	
	public void displayMobileDetails(){
		deviceName="VIVO";
		devicePrice=69.999d;
		
		System.out.println(deviceName);
		System.out.println(devicePrice);
		
		displayDevice();
	}
}