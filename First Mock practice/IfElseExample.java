class IfElseExample{
	public static void movieName(String name){
		String review="not watched";
		if(name=="KGF"){
		 review="good movie";
		}
		else{
			System.out.println("Still not watched");
		}
		System.out.println(review);
	}
	public static void dosa(int number){
		int price=0;
		if(number==1){
			price=120;
		}
		else{
			System.out.println("no record");
		}
		System.out.println(price);
	}
	
	public static void bike(String bikeName){
		String clint="no";
		if(bikeName=="Hero Honda"){
			clint="Iam intrested";
		}
		else{
			System.out.println("iam thinking");
		}
		System.out.println(clint);
		
	}
	
}


