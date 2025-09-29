class Priya
{
	public int age;
	public char gender;
	public Laptop laptop;
	public Mouse mouse;
	public Keyboard key;
	
	public Priya(int age,char gender,Laptop laptop,Mouse mouse,Keyboard key)
	{
		this.age=age;
		this.gender=gender;
		this.laptop=laptop;
		this.mouse=mouse;
		this.key=key;
		
	}
	public void displayPriya()
	{
		System.out.println("Priya age :"+age+ ","+ "Priya gender :"+gender);
		System.out.println("Laptop brand :"+laptop.brand+ ","+ "Laptop price :"+laptop.price);
		System.out.println("Mouse brand :"+mouse.brand+ ","+ "Mouse price :"+mouse.price);
		System.out.println("Keyboard brand :"+key.brand+ ","+ "Keyboard price :"+key.price);
	}
}