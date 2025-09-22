class BoatHeadSet{
	public int headSetPrice;
    public BoatCompany boatCompany;
	
	public BoatHeadSet(int headSetPrice,BoatCompany boatCompany){
		this.headSetPrice=headSetPrice;
		this.boatCompany=boatCompany;
	}
	
	public void displayHeadSet(){
		System.out.println("Boat HeadSet Price=="+headSetPrice);
		System.out.println("Boat company Founder=="+boatCompany.brandFounder);
		
	}
	
}