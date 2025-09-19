class Water{
	public int leterOfWater;
	public boolean isFilteredWater;
	
	public Water(int leterOfWater,boolean isFilteredWater){
		this.leterOfWater=leterOfWater;
		this.isFilteredWater=isFilteredWater;
	}
	
	public void waterDisplay(){
		System.out.println("total requird water in ltr=="+leterOfWater);
		System.out.println("is that water filtered=="+isFilteredWater);
		
	}
}