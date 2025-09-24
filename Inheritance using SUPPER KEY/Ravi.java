class Ravi extends Hero{
	
	public String filmIndustry;
	public int raviAge;
	public long raviNumber;
	public float raviHeight;
	public double movieTicket;
	public char raviGender;
	public boolean raviISGoodActor;
	
	public Ravi(String filmIndustry,int raviAge,long raviNumber,float raviHeight,
	              double movieTicket,char raviGender,boolean raviISGoodActor){
					  
					  super();   //it will access the all property of parent class.
					  
					  this.filmIndustry=filmIndustry;
					  this.raviAge=raviAge;
					  this.raviNumber=raviNumber;
					  this.raviHeight=raviHeight;
					  this.movieTicket=movieTicket;
					  this.raviGender=raviGender;
					  this.raviISGoodActor=raviISGoodActor;
		
	}
	
	public void displayRavi(){
		System.out.println("Ravi belongs which Film industry=="+this.filmIndustry);
		System.out.println("ravi age=="+this.raviAge);
		System.out.println("mobile number=="+this.raviNumber);
		System.out.println("his height=="+this.raviHeight);
		System.out.println("his avg movie ticket price=="+this.movieTicket);
		System.out.println("ravi gender is=="+this.raviGender);
		System.out.println("He is a good actore=="+this.raviISGoodActor);
	}
	
}