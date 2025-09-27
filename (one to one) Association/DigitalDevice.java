class DigitalDevice{
	public String deviceName;
	public double devicePrice;
	public SmartTv smartTv;
	
	public DigitalDevice(String deviceName, double devicePrice, SmartTv smartTv){
		this.deviceName=deviceName;
		this.devicePrice=devicePrice;
		this.smartTv=smartTv;
	}
	public void displayDevice(){
		System.out.println(deviceName);
		System.out.println(devicePrice);
		System.out.println(smartTv.tvName);
		System.out.println(smartTv.tvPrice);
	}
}


