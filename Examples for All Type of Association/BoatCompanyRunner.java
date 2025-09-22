class BoatCompanyRunner{
	public static void main(String [] args){
		BoatCompany boatCompany=new BoatCompany("Aman Gupta");
		
		BoatHeadSet boatHeadSet=new BoatHeadSet(6500,boatCompany);
		BoatSpeekers boatSpeekers=new BoatSpeekers(18999,boatCompany);
		BoatWatch boatWatch=new BoatWatch(3200,boatCompany);
		
		boatHeadSet.displayHeadSet();
		boatSpeekers.displaySpeekersDetails();
		boatWatch.displayWatchDetails();
		
		
	}
}