class Restaurent
{
	public String name;
	public boolean isOpen;
	public Employees employee;
	public Owners owner;
	public Investments invest;
	public Restaurent(String name,boolean isOpen,Employees employee,Owners owner,Investments invest)
	{
		this.employee=employee;
		this.owner=owner;
		this.isOpen=isOpen;
		this.name=name;
		this.invest=invest;
	}
	public void displayRestaurentDetails()
	{
		System.out.println("Restaurent name :"+name+ ","+ "Restaurent is open :"+isOpen);
		System.out.println("Employees name :"+employee.employeeName+ ","+ "Employees is Permanent:"+employee.isPermanent);
		System.out.println("Owner name :"+owner.ownerName+ ", "+ "owner age :"+owner.age);
		System.out.println("investor Name :"+invest.investorName+ ","+ "Investment amount :"+invest.amount);
	}
}