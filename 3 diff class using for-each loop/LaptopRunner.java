class LaptopRunner{
	public static void main(String [] args){
		Laptop laptop=new Laptop();
		
		LaptopInfo firstlaptopInfo=new LaptopInfo("Apple MacBook air",83.990d);
		LaptopInfo secondlaptopInfo=new LaptopInfo("lenovo LOQ",60990d);
		LaptopInfo thirdlaptopInfo=new LaptopInfo("Acer Aspire",14990);
		LaptopInfo fourtlaptopInfo=new LaptopInfo("Lenovo V15 G4",23.740);
		LaptopInfo fifthlaptopInfo=new LaptopInfo("Asus Chromebook",14990d);
		
		LaptopInfo[] laptopInfo={firstlaptopInfo,secondlaptopInfo,thirdlaptopInfo,
		                          fourtlaptopInfo,fifthlaptopInfo};
		
		laptop.laptopDisplay(laptopInfo);
		
	}
}