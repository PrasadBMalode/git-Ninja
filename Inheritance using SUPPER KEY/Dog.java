class Dog extends Animal{
	public String dogName;
	public int dogId;
	public long microChipNumber;
	public float dogHeight;
	public double dogRunningSpeed;
	public char dogGender;
	public boolean isDogVaccinated;
	
	public Dog(){
		
		super();
		System.out.println("its a non argument Dog Constrector");
	}
	public Dog(String dogName, int dogId, long microChipNumber, float dogHeight, 
	              double dogRunningSpeed, char dogGender, boolean isDogVaccinated){
					  
	 this();
	 
	 this.dogName=dogName;
	 this.dogId=dogId;
	 this.microChipNumber=microChipNumber;
	 this.dogHeight=dogHeight;
	 this.dogRunningSpeed=dogRunningSpeed;
	 this.dogGender=dogGender;
	 this.isDogVaccinated=isDogVaccinated;
	 
	 super.dogName=dogName;
	 super.dogId=dogId;
	 super.microChipNumber=microChipNumber;
	 super.dogHeight=dogHeight;
	 super.dogRunningSpeed=dogRunningSpeed;
	 super.dogGender=dogGender;
	 super.isDogVaccinated=isDogVaccinated;
	}
	
	public void dogDisplay(){
		System.out.println(""+this.dogName);
		System.out.println(""+this.dogId);
		System.out.println(""+this.microChipNumber);
		System.out.println(""+this.dogHeight);
		System.out.println(""+this.dogRunningSpeed);
		System.out.println(""+this.dogGender);
		System.out.println(""+this.isDogVaccinated);
		
		System.out.println(""+super.dogName);
		System.out.println(""+super.dogId);
		System.out.println(""+super.microChipNumber);
		System.out.println(""+super.dogHeight);
		System.out.println(""+super.dogRunningSpeed);
		System.out.println(""+super.dogGender);
		System.out.println(""+super.isDogVaccinated);
	}
}