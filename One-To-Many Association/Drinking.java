class Drinking{
	public String waterTypeName;
	public int waterprice;
	public Water water;
	
	public Drinking(String waterTypeName,int waterprice,Water water){
		this.waterTypeName=waterTypeName;
		this.waterprice=waterprice;
		this.water=water;
		
	}
	
	public void DrinkingDisplay(){
		System.out.println("Which type of water=="+waterTypeName);
		System.out.println("total cost of water=="+waterprice);
		System.out.println(water.leterOfWater);
		System.out.println(water.isFilteredWater);
	}
}