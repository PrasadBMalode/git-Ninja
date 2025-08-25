class GadgetsRunner{
	public static void main(String [] args){
		
		int price=Gadgets.remoteCar("toyato","blue");
		System.out.println(price);
		
		String catagory=Gadgets.doll(120,"pnk");
		System.out.println(catagory);
		
		int amount=Gadgets.smartPhone("samsung",5);
		System.out.println(amount);
		
		char grade=Gadgets.laptop("mackbook",1.00000);
		System.out.println(grade);
		
		String looks=Gadgets.tablet(10.5,256);
		System.out.println(looks);
		
		int cost=Gadgets.camera(48, "wideAngle");
		System.out.println(cost);
		
		int total=Gadgets.gameConsole(9,2);
		System.out.println(total);
		
		int rank=Gadgets.watch("Titan",6453);
		System.out.println(rank);
		
		int totalCost =Gadgets.Printer("laser",30);
		System.out.println(totalCost);
		
		int totalPrice=Gadgets.Projector(3500,2000.1);
		System.out.println(totalPrice);
		
		String brand=Gadgets.SmartTv(55,4);
		System.out.println(brand);
		
		int budget=Gadgets.VrHeadset(110,120);
		System.out.println(budget);
		
		int earbudsAmount=Gadgets.earbuds(5.3f,"Active");
		System.out.println(earbudsAmount);
		
		Gadgets.motar("no","old" );
		System.out.println();
		
		int totalAmount=Gadgets.PowerBank(20000,"realme");
		System.out.println(totalAmount);

	}
}