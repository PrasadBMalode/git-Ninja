class BookRunner{
	public static void main(String [] args){
		
		TextBook textBook=new TextBook();

		textBook.displayBookName("Java");
		textBook.displayBookPrice(620);
		textBook.displayBookId(9876543212l);
		textBook.displayBookRating(9.2f);
		textBook.displayBookOnlinePrice(660.99d);
		textBook.displayBookGrade('A');
		textBook.displayBookGood(true);
		
		
		
	}
}