class LiquorScotch{
	public String scotchName;
	public IceCube iceCube;
	public Flevour flevour;
	public Spirit spirit;
	
	public LiquorScotch(String scotchName,IceCube iceCube,Flevour flevour,Spirit spirit){
		this.scotchName=scotchName;
		this.iceCube=iceCube;
		this.flevour=flevour;
		this.spirit=spirit;
		
	}
	
	public void displayScotchDetails(){
		System.out.println("Name of the Scotch=="+scotchName);
		System.out.println("Number of Ice Cubes=="+iceCube.noOfIceCube);
		System.out.println("Flevour name=="+flevour.flevourName);
		System.out.println("Spirit quantity for mix in ML=="+spirit.quantityOfSpirit);
		
		
	}
	
}