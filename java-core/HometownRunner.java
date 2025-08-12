class HometownRunner{
	public static void main(String [] args){
		
		int people=Hometown.population(5000);
		System.out.println(people);
		
		float rain=Hometown.rainFall(45.6f);
		System.out.println(rain);
		
		String name=Hometown.townName("Shivpur");
		System.out.println(name);
		
		char grade=Hometown.townGrade('A');
		System.out.println(grade);
		
		double squar_km=Hometown.area(1234.567d);
		System.out.println(squar_km);
		
		boolean place=Hometown.touristSpot(true);
		System.out.println(place);
		
		long anunual=Hometown.budget(9876543210l);
		System.out.println(anunual);
	}
}