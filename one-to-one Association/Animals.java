class Animals{
	public int animalsCount;
	public boolean allAreWildeAnimals;
	
	public Animals(int animalsCount,boolean allAreWildeAnimals){
		
		this.animalsCount=animalsCount;
		this.allAreWildeAnimals=allAreWildeAnimals;
		
	}
	public void animalsDisplay(){
		System.out.println(animalsCount);
		System.out.println(allAreWildeAnimals);
		
		
	}
}