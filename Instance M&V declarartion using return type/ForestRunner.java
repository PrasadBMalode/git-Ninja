class ForestRunner{
	
	public static void main(String [] args){
		Forest forest=new Forest();
		String name=forest.forestName();
		System.out.println(name);
		
		int number=forest.animals();
		System.out.println(number);
		
		long count=forest.Leaves();
		System.out.println(count);
		
		float avg=forest.rainFall();
		System.out.println(avg);
		
		double production=forest.oxygen();
		System.out.println(production);
		
		char forestGrade=forest.grade();
		System.out.println(forestGrade);
		
		boolean protect=forest.forestProtected();
		System.out.println(protect);
		
		
	}
}