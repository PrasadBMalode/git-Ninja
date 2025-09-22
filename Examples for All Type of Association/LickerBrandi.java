class LickerBrandi{
	public String brandiName;
	public IceCube iceCube;
	public Flevour flevour;
	public Spirit spirit;
	
	public LickerBrandi(String brandiName,IceCube iceCube,Flevour flevour,Spirit spirit){
		this.brandiName=brandiName;
		this.iceCube=iceCube;
		this.flevour=flevour;
		this.spirit=spirit;
		
	}
	
	public void displayBrandiDetails(){
		System.out.println("Name of the Brandi=="+brandiName);
		System.out.println("Number of Ice Cubes=="+iceCube.noOfIceCube);
		System.out.println("Flevour name=="+flevour.flevourName);
		System.out.println("Spirit quantity for mix in ML=="+spirit.quantityOfSpirit);
		
		
	}
	
}