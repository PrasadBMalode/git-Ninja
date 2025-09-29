class ProductRunner
{
	public static void main(String [] ref)
	{
		Laptop laptop = new Laptop("Hp",45000);
		Laptop laptops = new Laptop("Dell",59000);
		Laptop tab = new Laptop("Lenova",40000);
		Mouse mouse = new Mouse(300,"Croma 2.4 GHz wireless");
		Mouse wire = new Mouse(190,"Zebronics Alex wired");
		Keyboard key =  new Keyboard(1999,"Hp K100 wired ");
		Keyboard keyboard = new Keyboard(799,"Zebronics ZEB-KM2100");
		
		Priya priya = new Priya(23,'F',laptop,mouse,key);
		Suresh suresh = new Suresh(35,'M',laptops,wire,keyboard);
		Anita anita = new Anita(29,'F',tab,mouse,keyboard);
		
		priya.displayPriya();
		System.out.println("----------------------------------------");
		suresh.displaySuresh();
		System.out.println("----------------------------------------");
		anita.displayAnita();
		
	}
}