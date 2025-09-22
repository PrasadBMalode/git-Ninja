class LickersRunner{
	public static void main(String [] args){
		Spirit spirit=new Spirit(150);
		Flevour flevour=new Flevour("Pinapal");
		IceCube iceCube=new IceCube(5);
		
		LiquorScotch liquorScotch=new LiquorScotch("Johinie Walker",iceCube,flevour,spirit);
		LickerBrandi lickerBrandi=new LickerBrandi("Beehive",iceCube,flevour,spirit);
		LickerRum lickerRum=new LickerRum("Old Munk",iceCube,flevour,spirit);
		
		liquorScotch.displayScotchDetails();
		lickerBrandi.displayBrandiDetails();
		lickerRum.displayRumDetails();
	}
}