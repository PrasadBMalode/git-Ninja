class CarRunner{
	public static void main(String [] args){
		CarRegistration carRegistration=new CarRegistration(9876543234l);
		Car car=new Car("XUV 3XO",16.99909d,carRegistration);
		car.displayCarDetails();
		
	}
}