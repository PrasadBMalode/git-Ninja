class Garden{
	public String gardenName;
	public Water water;
	
	public Garden(String gardenName,Water water){
		this.gardenName=gardenName;
		this.water=water;
	}
	public gardenDisplay(){
		System.out.println("Garden name=="+gardenName);
		System.out.println(water.leterOfWater);
		System.out.println(water.isFilteredWater);
		
	}
}