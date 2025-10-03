class Hotel
{
	public int rooms;
	public float rating ;
	public Employees employee;
	public Owners owner;
	public Investments invest;
	public Hotel(int rooms,float rating,Employees employee,Owners owner,Investments invest)
	{
		this.rating=rating;
		this.rooms=rooms;
		this.employee=employee;
		this.owner=owner;
		this.invest=invest;
	}
	public void displayHotelDetails()
	{
		System.out.println("hotel rooms :"+rooms+ ","+ "Hotel rating :"+rating);
		System.out.println("Employees name :"+employee.employeeName+ ","+ "Employees is Permanent:"+employee.isPermanent);
		System.out.println("Owner name :"+owner.ownerName+ ", "+ "owner age :"+owner.age);
		System.out.println("investor Name :"+invest.investorName+ ","+ "Investment amount :"+invest.amount);
	}
}