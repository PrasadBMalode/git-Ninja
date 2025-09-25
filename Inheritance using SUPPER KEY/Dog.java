class Dog extends Animal{
	public String dogName;
	public int dogId;
	public long microChipNumber;
	public float dogHeight;
	public double dogRunningSpeed;
	public char dogGender;
	public boolean isDogVaccinated;
	
	public Dog(){
		System.out.println("its a non argument Dog Constrector");
	}
	public Dog(String dogName, int dogId, long microChipNumber, float dogHeight, 
	              double dogRunningSpeed, char dogGender, boolean isDogVaccinated){
					  
	 super();
	 this.dogName=dogName;
	 this.dogId=dogId;
	 this.microChipNumber=microChipNumber;
	 this.dogHeight=dogHeight;
	 this.dogRunningSpeed=dogRunningSpeed;
	 this.dogGender=dogGender;
	 this.isDogVaccinated=isDogVaccinated;
	}
	
	public void dogDisplay(){
		System.out.println(""+this.dogName);
		System.out.println(""+this.dogId);
		System.out.println(""+this.microChipNumber);
		System.out.println(""+this.dogHeight);
		System.out.println(""+this.dogRunningSpeed);
		System.out.println(""+this.dogGender);
		System.out.println(""+this.isDogVaccinated);
		
		System.out.println(""+super.animalType);
		System.out.println(""+super.speciesCount);
		System.out.println(""+super.globalCount);
		System.out.println(""+super.avgSize);
		System.out.println(""+super.avgHeight);
		System.out.println(""+super.cataogory);
		System.out.println(""+super.endAngered);
	}
}