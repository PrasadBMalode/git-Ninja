class Person extends Doctor{
	public String doctorName;
	public int doctorSalary;
	public long doctorNumber;
	public float doctorHeight;
	public double doctorWeight;
	public char doctorGender;
	public boolean isActive;
	
	public Person(){
		System.out.println("this is non argument Persone Constructor");
	}
	
	public Person(String doctorName, int doctorSalary, long doctorNumber, float doctorHeight,
                   	double doctorWeight, char doctorGender, boolean isActive){
		
						super();
						
						this.doctorName=doctorName;
						this.doctorSalary=doctorSalary;
						this.doctorNumber=doctorNumber;
						this.doctorHeight=doctorHeight;
						this.doctorWeight=doctorWeight;
						this.doctorGender=doctorGender;
						this.isActive=isActive;
	}
	
	public void displayPerson(){
		System.out.println("Doctor name=="+this.doctorName);
		System.out.println("his salary=="+this.doctorSalary);
		System.out.println("his number=="+this.doctorNumber);
		System.out.println("his height=="+this.doctorHeight);
		System.out.println("his weight=="+this.doctorWeight);
		System.out.println("his gender=="+this.doctorGender);
		System.out.println("he still working=="+this.isActive);
	}
}