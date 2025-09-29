class OrdersRunner
{
	public static void main(String [] ref)
	{
		Lipstick lipstick = new Lipstick(270,"Maybelline");
		Foundation foundation = new Foundation(true,"MAC");
		Perfume perfume = new Perfume(true,"Engage");
		
		Customer customer = new Customer("Bhoomika",27,lipstick,foundation,perfume);
		customer.displayCustomerDetalis();
	}
}