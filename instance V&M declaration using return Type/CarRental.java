class CarRental{
	public String carModel="Honda City";
	public int bookingID=112234;
	public long regNumber=987654321234l;
	public float fuleEfficiency=18.5f;
	public double rentPerDay=2999.50d;
	public char fuleType='D';
	public boolean isAvailable=true;
	
	public String model(){
		return carModel;
	}
		public int id(){
		return bookingID;
	}
		public long reg(){
		return regNumber;
	}
		public float fule(){
		return fuleEfficiency;
	}
		public double rent(){
		return rentPerDay;
	}
		public char type(){
		return fuleType;
	}
		public boolean available(){
		return isAvailable;
	}
}