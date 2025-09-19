class MilkShakeRunner{
	public static void main(String [] args){
		IceCream iceCream=new IceCream("Venila ICE Cream");
		DryFruit dryFruit=new DryFruit("Cashew Nut");
		Suger suger=new Suger(2);
		MilkShake milkShake=new MilkShake("Venila Milk Shake", 220, suger, dryFruit, iceCream);
		milkShake.displayMilkShakeDetails();
		
	}
}