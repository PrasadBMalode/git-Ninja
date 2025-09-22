class LickerRum{
	public String rumName;
	public IceCube iceCube;
	public Flevour flevour;
	public Spirit spirit;
	
	public LickerRum(String rumName,IceCube iceCube,Flevour flevour,Spirit spirit){
		this.rumName=rumName;
		this.iceCube=iceCube;
		this.flevour=flevour;
		this.spirit=spirit;
		
	}
	
	public void displayRumDetails(){
		System.out.println("Name of the Rum=="+rumName);
		System.out.println("Number of Ice Cubes=="+iceCube.noOfIceCube);
		System.out.println("Flevour name=="+flevour.flevourName);
		System.out.println("Spirit quantity for mix in ML=="+spirit.quantityOfSpirit);
		
		
	}
	
}