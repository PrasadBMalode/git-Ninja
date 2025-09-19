class Staff
{
	public String nameOfStaff;
	public double salary;
	public Library library;
	
	public Staff(String nameOfStaff,double salary,Library library)
	{
		this.nameOfStaff=nameOfStaff;
		this.salary=salary;
		this.library=library;
	}
	public void displayStaffDetalies()
	
	{
		System.out.println("Staff name :"+nameOfStaff);
		System.out.println("salary :"+salary);
		System.out.println("Library name :"+library.libraryName);
		System.out.println("library rating :"+library.libraryRating);
	}
	
}