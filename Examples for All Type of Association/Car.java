class Car{
	public String carName;
	public double carPrice;
	public CarRegistration carRegistration;
	
	public Car(String carName,double carPrice,CarRegistration carRegistration){
		this.carName=carName;
		this.carPrice=carPrice;
		this.carRegistration=carRegistration;
	}
	
	public void displayCarDetails(){
		System.out.println("Car name=="+carName);
		System.out.println("Car Price=="+carPrice);
		System.out.println("Car registration id=="+carRegistration.carRegistrationId);
	}
}