class ElectriCity{
	public int totalunits;
	public boolean isUsefull;
	
	public ElectriCity(int totalunits,boolean isUsefull){
		this.totalunits=totalunits;
		this.isUsefull=isUsefull;
	}
	
	public void electriCityDisplay(){
		System.out.println("total units for House=="+totalunits);
				System.out.println("is electricity usefull=="+isUsefull);

		
	}
}