class Gadgets{
	public static int remoteCar(String name,String colour){
		
		int price=0;
		if(name=="BMW" || colour=="blue"){
			price=2300;
		}
		else{
			System.out.println("no car");
		}
		return price;
	}
	
	public static String doll(int price, String colour){
		
		String catagory="confuse";
		if(price==1200 || colour=="pink"){
			System.out.println("Barbie");
		}
		else{
			System.out.println("its a robot toy");
		}
		
		return catagory;
	}
	
	public static int smartPhone(String brand, int year){
		int amount=0;
		if(brand=="samsung" || year==5){
			amount=85000;
		}
		else{
			System.out.println("no need phone");
		}
		return amount;
	}
	
	public static char laptop(String name, double price){
		char grade='C';
		
		if(name=="mackbook" || price==1.00000){
			grade='A';
		}else{
			System.out.println("its not good lapy");
		}
		return grade;
	}
	
	public static String tablet(double inch, int size){
		String looks="don't know";
		
		if(inch==10.5 || size==256){
			System.out.println("its a good tablet");
		}
		else{
			System.out.println("its not good tablet");
		}
		return looks;
	}
	
	public static int earbuds(float version, String nsCancalation){
		int earbudsAmount=0;
		
		if(version==5.3f||nsCancalation=="Active"){
			earbudsAmount=3000;
		}
		else{
			System.out.println("not worth");
			
		}
		return earbudsAmount;
	}
	
	public static int camera(int resolution, String lensType){
		int cost=0;
		
		if(resolution==48 || lensType=="wideAngle"){
			cost=65000;
		}
		else{
			System.out.println("no mony");
			
		}
		return cost;
	}
	
	public static int gameConsole(int genaration, int tB){
		int total=0; 
		if(genaration==9 || tB==2){
			total= 53000;
		}
		else{
			System.out.println("its too expencive");
			
		}
		return total;
	}
	
	public static String SmartTv(int inch, int resolution ){
		String brand="none";
		
		if(inch==55 || resolution==4){
			
			brand="SAMSUNG";
			
		}
		else{
			brand="LG";
			
		}
		return brand;
	}
	
	public static int VrHeadset(int digree, int refershRateHz){
		int budget=0;
		
		if(digree==110 || refershRateHz==120){
			
			budget=12000;
			
		}
		else{
			budget=6000;
			
		}
		return budget;
	}
	
	public static int Projector(int lumens, double contrastRate){
		int totalPrice=0;
		
		if(lumens==3500 || contrastRate==2000.1){
			totalPrice=32000;
			
		}
		else{
			totalPrice=18000;
			
		}
		return totalPrice;
	}
	
	public static int Printer(String type, int speed){
		
		int totalCost=0;
		if(type=="laser" || speed==30){
			
			totalCost=23000;
		}
		else{
			totalCost=12000;
			
		}
		return totalCost;
	}
	
	
	public static int PowerBank(int capacity, String name){
		
		int totalAmount=0;
		
		if(capacity==20000 || name=="realme"){
			
			totalAmount=8060;
		}
		else{
			totalAmount=650;
			
			
		}
		return totalAmount;
	}
	
	public static char watch(String name, int value){
		char rank='N';
		
		if(name=="Titan" || value==6453){
			rank='A';
			
		}
		else{
			rank='0';
			
		}
		return rank;
	}
	
	public static String motar(String working, String item){
		
		String product="not worth";
		if(working=="no" || item=="old"){
		System.out.println("its in bad condition");
			
		}
		else{
			System.out.println("its in good condition");
			
		}
		return product;
	 
	}
	
}