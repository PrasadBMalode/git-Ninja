class Person extends Doctor{
	public String personName;
	public int personSalary;
	public long personNumber;
	public float personHeight;
	public double personWeight;
	public char personGender;
	public boolean personisAlive;
	
	public Person(){
		super();
		System.out.println("this is non argument Persone Constructor");
	}
	
	public Person(String personName, int personSalary, long personNumber, float personHeight,
                   	double personWeight, char personGender, boolean personisAlive){
		
						this();
						
						this.personName=personName;
						this.personSalary=personSalary;
						this.personNumber=personNumber;
						this.personHeight=personHeight;
						this.personWeight=personWeight;
						this.personGender=personGender;
						this.personisAlive=personisAlive;
						
						super.personName=personName;
						super.personSalary=personSalary;
						super.personNumber=personNumber;
						super.personHeight=personHeight;
						super.personWeight=personWeight;
						super.personGender=personGender;
						super.personisAlive=personisAlive;
						
						
	}
	
	public void displayPerson(){
		System.out.println("Person name=="+this.personName);
		System.out.println("his salary=="+this.personSalary);
		System.out.println("his number=="+this.personNumber);
		System.out.println("his height=="+this.personHeight);
		System.out.println("his weight=="+this.personWeight);
		System.out.println("his gender=="+this.personGender);
		System.out.println("he still Alive=="+this.personisAlive);
		
		System.out.println("Person name=="+super.personName);
		System.out.println("his salary=="+super.personSalary);
		System.out.println("his number=="+super.personNumber);
		System.out.println("his height=="+super.personHeight);
		System.out.println("his weight=="+super.personWeight);
		System.out.println("his gender=="+super.personGender);
		System.out.println("he still Alive=="+super.personisAlive);
	}
}