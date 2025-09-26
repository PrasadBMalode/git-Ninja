class TextBook extends Book{
	
	public void displayBookName(String bookName){
		
		System.out.println("its a TextBook (Derived class) method");
		System.out.println(bookName);
	}
	public void displayBookPrice(int bookPrice){
		System.out.println(bookPrice);
	}
	public void displayBookId(long bookId){
		System.out.println(bookId);
	}
	public void displayBookRating(float bookRating){
		System.out.println(bookRating);
	}
	public void displayBookOnlinePrice(double bookOnlinePrice){
		System.out.println(bookOnlinePrice);
	}
	public void displayBookGrade(char bookGrade){
		System.out.println(bookGrade);
	}
	public void displayBookGood(boolean bookIsGood){
		System.out.println(bookIsGood);
	}
	
}