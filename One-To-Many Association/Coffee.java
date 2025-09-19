class Coffee
{
	public int coffeePrice;
	public String coffeeShopName;
	public Sugar sugar;
	
	public Coffee(int coffeePrice,String coffeeShopName,Sugar sugar)
	{
		this.coffeePrice=coffeePrice;
		this.coffeeShopName=coffeeShopName;
		this.sugar=sugar;
	}
	public void displayCoffeeDetalies()
	{
		
	     System.out.println("Coffee price :"+coffeePrice);
         System.out.println("Coffee shop name :"+coffeeShopName);
		System.out.println("Number of spoons :"+sugar.noOfSpoons);
		System.out.println("Tea is sugar less  :"+sugar.isSugarLess);
	}
}