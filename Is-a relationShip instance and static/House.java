class House extends Buildeing{
	
	public static void displayHouse(){
		buildingName="MRR heigst";
		
		System.out.println(buildingName);
	}
	
	public void displayHouseDetails(){
		buildingName="SATVA";
		noOfFloors=39;
		
		System.out.println(buildingName);
		System.out.println(noOfFloors);
		
		displayBuilding();
	}
	
}