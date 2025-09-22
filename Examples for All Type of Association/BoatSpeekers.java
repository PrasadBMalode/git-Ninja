class BoatSpeekers{
	public int speekersPrice;
	public BoatCompany boatCompany;
	
	public BoatSpeekers(int speekersPrice,BoatCompany boatCompany){
		this.speekersPrice=speekersPrice;
		this.boatCompany=boatCompany;
		
	}
	
	public void displaySpeekersDetails(){
		System.out.println("Boat Speekers price=="+speekersPrice);
        System.out.println("Boat company Founder=="+boatCompany.brandFounder);		
	}
}