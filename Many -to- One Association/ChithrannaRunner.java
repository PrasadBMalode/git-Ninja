class ChithrannaRunner{
	public static void main(String [] args){
		
		Turmaric turmaric=new Turmaric(10);
		Pienuts pienuts=new Pienuts(50);
		Oil oil=new Oil(20);
		Chithranna chithranna=new Chithranna("Mango Chithranna", 45, oil, pienuts, turmaric);
		chithranna.displayChithrannaDetails();
		
		
	}
}