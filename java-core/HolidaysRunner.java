class HolidaysRunner{
	public static void main(String args []){
		
		int count=Holidays.holidaysCount(15);
		System.out.println(count);
		
		String name=Holidays.holidayName("Diwali");
		System.out.println(name);
		
		double distance=Holidays.travel(456.789d);
		System.out.println(distance);
		
		char first=Holidays.letter('D');
		System.out.println(first);
		
		float average=Holidays.duration(4.5f);
		System.out.println(average);
		
		boolean today=Holidays.condition(false);
		System.out.println(today);
		
		long total=Holidays.tourists(23456789123l);
		System.out.println(total);
		
	}
	
	 
}