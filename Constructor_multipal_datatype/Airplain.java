class Airplain{
	public Airplain(){
		System.out.println("it default constructor");
		
	}
	public Airplain(String plainName, int capacity, long reg_number, float speed, double max_fly_altitude, char code, boolean internation_flight ){
		System.out.println(plainName);
		System.out.println(capacity);
		System.out.println(reg_number);
		System.out.println(speed);
		System.out.println(max_fly_altitude);
		System.out.println(code);
		System.out.println(internation_flight);
	}
}