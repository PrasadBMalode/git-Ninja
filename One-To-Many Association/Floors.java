class Floors
{
	
	public String floorName;
	public Library library ;
	
	public Floors(String floorName,Library library)
	{
		
		this.floorName=floorName;
		this.library=library;
	}
	public void displayFloorsDetalies()
	{
		System.out.println("Floor name :"+floorName);
		System.out.println("Library name :"+library.libraryName);
		System.out.println("library rating :"+library.libraryRating);
	}
}