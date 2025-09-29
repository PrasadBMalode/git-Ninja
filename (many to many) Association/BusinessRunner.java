class BusinessRunner
{
	public static void main(String [] ref)
	{
		Employees employee = new Employees("Karna M",false);
		Employees employees= new Employees("sushma V ",true);
		Employees employe = new Employees("KavyaShree ",false);
		
		Owners owner = new Owners("Sharma",35);
		Owners owners =new Owners("Rakesh",40);
		
		Investments invest=new Investments(23452145l,"naveen");
		Investments investment =new Investments(89075444l,"Vishwa");
		Investments investments = new Investments(67899765l,"Sunitha sharma");
		
		
		Restaurent restaurent = new Restaurent("New look",true,employee,owners,investment);
		Hotel hotel = new Hotel(50,4.9f,employees,owner,investments);
		
		
		restaurent.displayRestaurentDetails();
		System.out.println("-------------------------------------------------------");
		hotel.displayHotelDetails();
	}
}