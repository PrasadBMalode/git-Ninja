class EBook extends Book{
	
	public static void displayFirstEBook(){
		
		bookName="The jungle book";
	//bookPrice=620;[we can't access from instance to static]
		System.out.println(bookName);
		
		//displayBook();[we can't access from instance to static]
		
	}
	
	public void displaySecondEbook(){
		bookName="java";
		bookPrice=620;
		
		System.out.println(bookName);
	  System.out.println(bookPrice);
	  
	  displayBook();
	  
	}
	
}