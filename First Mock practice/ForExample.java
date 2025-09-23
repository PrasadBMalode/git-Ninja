class ForExample{
	public static void main(String args []){
		
		String prasad="Haveri";
		String ravi="mangalore";
		String manu="Shivmogga";
		String pavi="Dharvad";
		
		
		String [] names={"prasad","ravi","manu","pavi"};
		System.out.println(names [2]);
		
		names[2]="priyaa";
		
		System.out.println(names [2]);
		
		for(int student=0; student<names.length; student++){
			System.out.println(names[student]);
		}
		
	}
}