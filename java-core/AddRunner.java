class AddRunner{
	public static void main(String args []){
		
		int time=Add.duration(30);
		System.out.println(time);
		
		float rating=Add.adRating(4.5f);
		System.out.println(rating);
		
		String name=Add.adTitle("washing powder nirma");
		System.out.println(name);
		
		char category=Add.adCategory('D');
		System.out.println(category);
		
		double currency=Add.budget(125000.5d);
		System.out.println(currency);
		
		boolean currently=Add.active(true);
		System.out.println(currently);
		
		long watched=Add.views(1500000000l);
		System.out.println(watched);
		
		
		
		
	}
}