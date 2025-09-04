class CarDeatailsRunner{
	public static void main(String [] args){
		CarDeatails.name="Hyundai";
		System.out.println(CarDeatails.name);
		CarDeatails.name="BMW";
		//System.out.println(CarDeatails.name);
		
		CarDeatails.numberOfSeats=5;
		CarDeatails.regModels=987654321l;
		CarDeatails.milage=18.5f;
		CarDeatails.topSpeed=180.75d;
		
		CarDeatails.fuleType='P';
		System.out.println(CarDeatails.fuleType);
		CarDeatails.fuleType='D';
		
		CarDeatails.isAutometic=true;
		
		CarDeatails.car();
	}
}