class FridgInfo{
	public String fridgName;
	public int fridgPrice;
	public ElectriCity electriCity;
	
	public FridgInfo(String fridgName,int fridgPrice,ElectriCity electriCity){
		
		this.fridgName=fridgName;
		this.fridgPrice=fridgPrice;
		this.electriCity=electriCity;
		
	}
	
	public void fridgInfoDisplay(){
		
		System.out.println("Brand name"+fridgName);
		System.out.println("price of fridg=="+fridgPrice);
		System.out.println(electriCity.totalunits);
		System.out.println(electriCity.isUsefull);
		
	}
}
