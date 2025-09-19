class Bathing{
	public String bathingSoapName;
	public float bathDuration;
	public Water water;
	
	public Bathing(String bathingSoapName,float bathDuration,Water water){
		this.bathingSoapName=bathingSoapName;
		this.bathDuration=bathDuration;
		this.water=water;
	}
	
	public void bathingDisplay(){
		System.out.println("Soap name for bathing=="+bathingSoapName);
		System.out.println("how much time to take bath=="+bathDuration);
		System.out.println(water.leterOfWater);
		System.out.println(water.isFilteredWater);
		
	}
}