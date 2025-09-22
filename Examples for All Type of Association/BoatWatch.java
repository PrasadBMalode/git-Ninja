class BoatWatch{
	public int boatWatchPrice;
	public BoatCompany boatCompany;
	
	public BoatWatch(int boatWatchPrice,BoatCompany boatCompany){
		this.boatWatchPrice=boatWatchPrice;
		this.boatCompany=boatCompany;
	}
	
	public void displayWatchDetails(){
		System.out.println("Boat watch price=="+boatWatchPrice);
		System.out.println("Boat company Founder=="+boatCompany.brandFounder);
	}
}