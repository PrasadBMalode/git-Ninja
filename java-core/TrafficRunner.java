class TrafficRunner{
	public static void main(String args []){
		
		int count=Traffic.vehicleCount(120);
		System.out.println(count);
		
		float avg=Traffic.averageSpeed(45.6f);
		System.out.println(avg);
		
		String name=Traffic.signalName("Hebbal bridg");
		System.out.println(name);
		
		char colour=Traffic.charecter('R');
		System.out.println(colour);
		
		double km=Traffic.roadLength(12.458d);
		System.out.println(km);
		
		boolean jam=Traffic.condition(true);
		System.out.println(jam);
		
		long number=Traffic.totalVehicles(987654321l);
		System.out.println(number);
		
		
	}
}