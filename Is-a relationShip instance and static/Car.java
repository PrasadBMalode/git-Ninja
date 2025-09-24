class Car extends Vehicle{
	public static void displayFirstCar(){
		showroomName="HONDA";
		System.out.println(showroomName);
		
	}
	
	public void displaySecondCar(){
		showroomName="KIA";
		location="Bangalore";
		
		System.out.println(showroomName);
		System.out.println(location);
		
		displayVehicle();
	}
}