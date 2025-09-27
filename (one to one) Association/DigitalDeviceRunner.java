class DigitalDeviceRunner{
	public static void main(String [] args){
		SmartTv smartTv=new SmartTv("SAMSUNG LED",65.999d);
		DigitalDevice digitalDevice=new DigitalDevice("LG Tv",35.999d,smartTv);
		digitalDevice.displayDevice();
	}
}