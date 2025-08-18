class Information {
	public static void main(String args []){
		
		long vaishu=8976564532l;
		
		long taslim=9898767545l;
		
		long raksha=5676879889l;
		
		long chaitra=9889098778l;
		
		long kumud=564534768987l;
		
		long [] phNumber={vaishu,taslim,raksha,chaitra,kumud};
		System.out.println(phNumber[3]);
		
		long rukmini=9876543223l;
		phNumber [3]=rukmini;
		System.out.println(phNumber[3]);
		
		for(int mobile=0; mobile<phNumber.length; mobile++){
			System.out.println(" One of my friend phNumber");
			System.out.println(phNumber[mobile]);
			}
		
	
	int ravi=23;
	
	int pavi=24;
	
	int savi=23;
	
	int kavi=24;
	
	int lavi=27;
	
	int [] age={ravi,pavi,savi,kavi,lavi};
	System.out.println("----------------------");
	System.out.println(age [2] );
	
	int favi=22;
	age [2]=favi;
	System.out.println(age [2] );
	
	for(int dob=0; dob<age.length; dob++){
		System.out.println(age[dob]);
	}
	
	String om="Prema";
	
	String a="Chandini";
	
	String shhh="megha";
	
	String swasthik="Vijayalakshmi";
	
	String h2o="Priyanka";
	
	String [] actressName={om,a,shhh,swasthik,h2o};
	System.out.println("----------------------");
	System.out.println(actressName [4]);
	
	String ka="Pallavi Raju";
	actressName [4]=ka;
	System.out.println(actressName [4]);
	
	for(int name=0; name<actressName.length; name++){
		System.out.println(actressName [name]);
	}
	
	float ajay=5.9f;
	
	float daya=5.7f;
	
	float sharath=5.4f;
	
	float alphin=5.8f;
	
	float manoj=5.9f;
	
	float [] height={ajay,daya,sharath,alphin,manoj};
	System.out.println("----------------------");
	System.out.println(height [3]);
	
	float arvind=5.7f;
	height [3]=arvind;
	System.out.println(height [3]);
	
	for(int foot=0; foot<height.length; foot++){
		System.out.println(height [foot]);
	}
	
	char shrikanth='A';
	
	char rugved='B';
	
	char sujata='A';
	
	char meenaxi='B';
	
	char nagaratna='D';
	
	char pooja='D';
	
	char [] section={shrikanth,rugved,sujata,meenaxi,nagaratna,pooja};
	System.out.println("--------------------------------");
	System.out.println(section [0]);
	
	char bhavani='D';
	section [0]=bhavani;
	System.out.println(section [0]);
	
	for(char school=0; school<section.length; school++){
		System.out.println(section [school]);
	}
	
	
	boolean prasad=true;
	boolean sai=false;
	
	boolean [] result={prasad,sai};
	System.out.println("------------------------------");
	System.out.println(result[1]);
	
	boolean pachhu=true;
	result [1]=pachhu;
	System.out.println(result[1]);
	
	for(int total=0; total<result.length; total++){
		System.out.println(result[total]);
	}
	
	double aBlock=12.98674d;
	
	double bBlock=67.89765d;
	
	double cBlock=56.89762d;
	
	double dBlock=78.98076d;
	
	double eBlock=98.78546d;
	
	double [] address={aBlock,bBlock,cBlock,dBlock,eBlock};
	System.out.println("----------------------------------");
	System.out.println(address [2]);
	
	double fBlock=87.67564d;
	address [2]=fBlock;
	System.out.println(address [2]);
	
	for(int apartment=0; apartment<address.length; apartment++){
		System.out.println(address[apartment]);
	}
	
   }
}