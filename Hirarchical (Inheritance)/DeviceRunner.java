class DeviceRunner{
	public static void main(String [] args){
		Laptop laptop=new Laptop();
		laptop.displayDevice();
		System.out.println("   ");
		laptop.displayLaptop();
		System.out.println("   ");
		
		Tablet tablet=new Tablet();
		tablet.displayDevice();
		System.out.println("   ");
		tablet.displayTablet();
		System.out.println("   ");
		
		SmartPhone smartPhone=new SmartPhone();
		smartPhone.displayDevice();
		System.out.println("   ");
		smartPhone.displaySmartPhone();
		
	}
}