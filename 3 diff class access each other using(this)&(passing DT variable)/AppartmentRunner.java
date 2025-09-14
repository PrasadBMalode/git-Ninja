class AppartmentRunner{
	public static void main(String [] args){
		Appartment appartment=new Appartment();
		
		Flores floresOne=new Flores(101,"akg");
		Flores floresTwo=new Flores(102,"skg");
		Flores floresThree=new Flores(103,"dkg");
		Flores floresFour=new Flores(104,"fkg");
		
		
		Flores [] flores={floresOne,floresTwo,floresThree,floresFour};
		
		
		appartment.appartmentDisplay(flores);
		
	}
}