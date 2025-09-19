class MilkShake{
	public String milkShakeName;
	public int milkShakePrice;
	public Suger suger;
	public DryFruit dryFruit;
	public IceCream iceCream;
	
	public MilkShake(String milkShakeName,int milkShakePrice,Suger suger,DryFruit dryFruit,IceCream iceCream){
		this.milkShakeName=milkShakeName;
		this.milkShakePrice=milkShakePrice;
		this.suger=suger;
		this.dryFruit=dryFruit;
		this.iceCream=iceCream;

	}
	
	public void displayMilkShakeDetails(){
		System.out.println("Milk Shake Name=="+milkShakeName);
		System.out.println("Cost of venila Milk Shake=="+milkShakePrice);
		System.out.println("Suger Details=="+suger.spoonsOfSuger);
		System.out.println("Dry fruits details=="+dryFruit.dryFruitName);
		System.out.println("Which icreem gone add=="+iceCream.iceCreamName);
		
		
	} 
}