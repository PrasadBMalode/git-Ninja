class Tea
{
	public int teaPrice;
	public String teaShopName;
	public Sugar sugar;
	
	public Tea(int teaPrice,String teaShopName,Sugar sugar)
	{
		this.teaPrice=teaPrice;
		this.teaShopName=teaShopName;
		this.sugar=sugar;
	}
	public void displayTeaDetalies()
	{
		System.out.println("Tea price :"+teaPrice);
		System.out.println("Tea shop name :"+teaShopName);
		System.out.println("Number of spoons :"+sugar.noOfSpoons);
		System.out.println("Tea is sugar less :"+sugar.isSugarLess);
	}
}