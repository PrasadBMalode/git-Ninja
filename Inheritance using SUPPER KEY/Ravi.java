class Ravi extends Hero{
	
	public String filmIndustry;
	public int raviAge;
	public long raviNumber;
	public float raviHeight;
	public double movieTicket;
	public char raviGender;
	public boolean raviISGoodActor;
	
	public Ravi(){
		super();
		System.out.println("this is non argument Ravi Constructor");
	}
	
	public Ravi(String filmIndustry,int raviAge,long raviNumber,float raviHeight,
	              double movieTicket,char raviGender,boolean raviISGoodActor){
					  
					  this();
					  
					  this.filmIndustry=filmIndustry;
					  this.raviAge=raviAge;
					  this.raviNumber=raviNumber;
					  this.raviHeight=raviHeight;
					  this.movieTicket=movieTicket;
					  this.raviGender=raviGender;
					  this.raviISGoodActor=raviISGoodActor;
					  
					  super.filmIndustry=filmIndustry;
					  super.raviAge=raviAge;
					  super.raviNumber=raviNumber;
					  super.raviHeight=raviHeight;
					  super.movieTicket=movieTicket;
					  super.raviGender=raviGender;
					  super.raviISGoodActor=raviISGoodActor;
		
	}
	
	public void displayRavi(){
		System.out.println("Ravi belongs which Film industry=="+this.filmIndustry);
		System.out.println("ravi age=="+this.raviAge);
		System.out.println("mobile number=="+this.raviNumber);
		System.out.println("his height=="+this.raviHeight);
		System.out.println("his avg movie ticket price=="+this.movieTicket);
		System.out.println("ravi gender is=="+this.raviGender);
		System.out.println("He is a good actore=="+this.raviISGoodActor);
		
		System.out.println("Ravi belongs which Film industry=="+super.filmIndustry);
		System.out.println("ravi age=="+super.raviAge);
		System.out.println("mobile number=="+super.raviNumber);
		System.out.println("his height=="+super.raviHeight);
		System.out.println("his avg movie ticket price=="+super.movieTicket);
		System.out.println("ravi gender is=="+super.raviGender);
		System.out.println("He is a good actore=="+super.raviISGoodActor);
	}
	
}