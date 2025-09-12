class CarRentalRunner{
	public static void main(String [] args){
		CarRental carrental=new CarRental();
		String carModel=carrental.model();
		System.out.println(carModel);
		
		int bookingID=carrental.id();
		System.out.println(bookingID);
		
		long regNumber=carrental.reg();
		System.out.println(regNumber);
		
		float fuleEfficiency=carrental.fule();
		System.out.println(fuleEfficiency);
		
		double rentPerDay=carrental.rent();
		System.out.println(rentPerDay);
		
		char fuleType=carrental.type();
		System.out.println(fuleType);
		
		boolean isAvailable=carrental.available();
		System.out.println(isAvailable);
	}
}