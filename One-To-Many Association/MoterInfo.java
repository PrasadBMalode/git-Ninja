class MoterInfo{
	public String moterBrandName;
	public int moterPrice;
	public ElectriCity electriCity;
	
	public MoterInfo(String moterBrandName,int moterPrice,ElectriCity electriCity){
		this.moterBrandName=moterBrandName;
		this.moterPrice=moterPrice;
		this.electriCity=electriCity;
	}
	
	public void moterInfoDisplay(){
		System.out.println("moter brand name=="+moterBrandName);
		System.out.println("total cost of moter=="+moterPrice);
		System.out.println(electriCity.totalunits);
		System.out.println(electriCity.isUsefull);
	}
	
}