class Customer
{
	public String name;
	public int age;
	public Lipstick lipstick;
	public Foundation foundation;
	public Perfume perfume;
	
	public Customer(String name,int age ,Lipstick lipstick,Foundation foundation,Perfume perfume)
	{
		this.perfume=perfume;
		this.foundation=foundation;
		this.age=age;
		this.name=name;
		this.lipstick=lipstick;
	}
	public void displayCustomerDetalis()
	{
		System.out.println("Customer name :"+name+ ","+ "Customer age :"+age);
		System.out.println("Lipstick price :"+lipstick.price+ ","+ "Lipstick brand :"+lipstick.brand);
		System.out.println("Foundation brand :"+foundation.brand+ ","+ "Foundation is Liquid :"+foundation.isLiquid);
		System.out.println("Perfume brand :"+perfume.brand+ ","+ "Perfume is Premium :"+perfume.isPremium);
	}
}