class Person extends Doctor{
	public String personName;
	public int personSalary;
	public long personNumber;
	public float personHeight;
	public double personWeight;
	public char personGender;
	public boolean personisAlive;
	
	public Person(){
		System.out.println("this is non argument Persone Constructor");
	}
	
	public Person(String personName, int personSalary, long personNumber, float personHeight,
                   	double personWeight, char personGender, boolean personisAlive){
		
						super();
						
						this.personName=personName;
						this.personSalary=personSalary;
						this.personNumber=personNumber;
						this.personHeight=personHeight;
						this.personWeight=personWeight;
						this.personGender=personGender;
						this.personisAlive=personisAlive;
	}
	
	public void displayPerson(){
		System.out.println("Person name=="+this.personName);
		System.out.println("his salary=="+this.personSalary);
		System.out.println("his number=="+this.personNumber);
		System.out.println("his height=="+this.personHeight);
		System.out.println("his weight=="+this.personWeight);
		System.out.println("his gender=="+this.personGender);
		System.out.println("he still Alive=="+this.personisAlive);
		
		System.out.println(""+super.doctorName);
		System.out.println(""+super.doctorSalary);
		System.out.println(""+super.doctorNumber);
		System.out.println(""+super.doctorHeight);
		System.out.println(""+super.doctorWeight);
		System.out.println(""+super.doctorGender);
		System.out.println(""+super.isActive);
	}
}