class Coocking{
	public String chefName;
	public int chefSalary;
	public Water water;
	
	public Coocking(String chefName,int chefSalary,Water water){
		this.chefName=chefName;
		this.chefSalary=chefSalary;
		this.water=water;
	}
	
	public void coockingDisplay(){
		System.out.println("Chef name=="+chefName);
		System.out.println("his total salary for coock"+chefSalary);
		System.out.println(water.leterOfWater);
		System.out.println(water.isFilteredWater);
		
	}
}