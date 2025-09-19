class Section
{
	public int totalBooksInSection;
	public boolean isDigital;
	public Library library;
	
	public Section(int totalBooksInSection,boolean isDigital,Library library)
	{
		this.totalBooksInSection=totalBooksInSection;
		this.isDigital=isDigital;
		this.library=library;
	}
	public void displaySectionDetalies()
	{
		
		System.out.println("Section total books :"+totalBooksInSection);
		System.out.println("Section is Digital:"+isDigital);
		System.out.println("Library name :"+library.libraryName);
		System.out.println( "library rating :"+library.libraryRating);
	}
}