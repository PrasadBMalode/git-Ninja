class StallRunner
{
	public static void main(String [] ref)
	{
		Sugar sugar = new Sugar(false,3);
		Sugar brownSugar = new Sugar(true,5);
		Sugar blackSugar= new Sugar(true,1);
		Tea tea = new Tea(24,"Tea stall",sugar);
		Coffee coffe = new Coffee(30,"Coffee Stall",blackSugar);
		Boost boost=new Boost(45,3.7f,brownSugar);
		
		
		boost.displayBoostDetalies();
		
		tea.displayTeaDetalies();
		
		coffe.displayCoffeeDetalies();
	}
}