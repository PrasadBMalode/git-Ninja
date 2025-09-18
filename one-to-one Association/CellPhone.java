class CellPhone{
	public String cellPhoneName;
	public int cellprice;
	public SIM_Card sIM_Card;
	
	public CellPhone(String cellPhoneName,int cellprice,SIM_Card sIM_Card){
		this.cellPhoneName=cellPhoneName;
		this.cellprice=cellprice;
		this.sIM_Card=sIM_Card;
	}
	
	public void CellPhoneDisplay(){
		System.out.println(cellPhoneName);
		System.out.println(cellprice);
		System.out.println(sIM_Card.simName);
		System.out.println(sIM_Card.simPrice);
	}
}