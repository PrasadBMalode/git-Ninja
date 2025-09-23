class MethodChaining{
	public static void movieName(){
		System.out.println("KGF");
	}
	
	public static void actorName(){
		System.out.println("Yesh");
		movieName();
	}
	
	public static void budget(){
		System.out.println("120cr");
		actorName();
	}
}