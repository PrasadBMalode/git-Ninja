class Rakshith extends Hero{
	public String filmIndustry;
	public int rakshithAge;
	public long rakshithNumber;
	public float rakshithHeight;
	public double movieTicket;
	public char rakshithGender;
	public boolean rakshithISGoodActor;
	
	public Rakshith(String filmIndustry,int rakshithAge,long rakshithNumber,float rakshithHeight,
	              double movieTicket,char rakshithGender,boolean rakshithISGoodActor){
					  
					  super.filmIndustry=filmIndustry;
					  super.rakshithAge=rakshithAge;
					  super.rakshithNumber=rakshithNumber;
					  super.rakshithHeight=rakshithHeight;
					  super.movieTicket=movieTicket;
					  super.rakshithGender=rakshithGender;
					  super.rakshithISGoodActor=rakshithISGoodActor;
				  }
				  public void displayRakshith(){
		
		System.out.println("rakshith belongs which Film industry=="+super.filmIndustry);
		System.out.println("rakshith age=="+super.rakshithAge);
		System.out.println("mobile number=="+super.rakshithNumber);
		System.out.println("his height=="+super.rakshithHeight);
		System.out.println("his avg movie ticket price=="+super.movieTicket);
		System.out.println("rakshith gender is=="+super.rakshithGender);
		System.out.println("He is a good actore=="+super.rakshithISGoodActor);
	}
	
}	