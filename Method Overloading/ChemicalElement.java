class ChemicalElement{
	public void displayChemicalElements(String name){
		System.out.println("Chemical Element name=="+name);
	}
	public void displayChemicalElements(String name, int atomicNumber){
		System.out.println("Chemical Element name=="+name);
		System.out.println("Chemical Element atomic Number=="+atomicNumber);
	}
	public void displayChemicalElements(String name, int atomicNumber, long chemicalID){
		System.out.println("Chemical Element name=="+name);
		System.out.println("Chemical Element atomic Number=="+atomicNumber);
		System.out.println("Chemical Element id=="+chemicalID);
	}
	public void displayChemicalElements(String name, int atomicNumber, long chemicalID, float atomicWeight){
		System.out.println("Chemical Element name=="+name);
		System.out.println("Chemical Element atomic Number=="+atomicNumber);
		System.out.println("Chemical Element id=="+chemicalID);
		System.out.println("Chemical Element weight=="+atomicWeight);
	}
	public void displayChemicalElements(String name, int atomicNumber, long chemicalID, float atomicWeight,
	                                      double meltigPoint){
		System.out.println("Chemical Element name=="+name);
		System.out.println("Chemical Element atomic Number=="+atomicNumber);
		System.out.println("Chemical Element id=="+chemicalID);
		System.out.println("Chemical Element weight=="+atomicWeight);
		System.out.println("Chemical Element melting poin=="+meltigPoint);
	}
	public void displayChemicalElements(String name, int atomicNumber, long chemicalID, float atomicWeight,
	                                      double meltigPoint, char chemicalType){
		System.out.println("Chemical Element name=="+name);
		System.out.println("Chemical Element atomic Number=="+atomicNumber);
		System.out.println("Chemical Element id=="+chemicalID);
		System.out.println("Chemical Element weight=="+atomicWeight);
		System.out.println("Chemical Element melting poin=="+meltigPoint);
		System.out.println("Chemical Element which type=="+chemicalType);
	}
	public void displayChemicalElements(String name, int atomicNumber, long chemicalID, float atomicWeight,
	                                      double meltigPoint, char chemicalType, boolean isEveryWhere){
		System.out.println("Chemical Element name=="+name);
		System.out.println("Chemical Element atomic Number=="+atomicNumber);
		System.out.println("Chemical Element id=="+chemicalID);
		System.out.println("Chemical Element weight=="+atomicWeight);
		System.out.println("Chemical Element melting poin=="+meltigPoint);
		System.out.println("Chemical Element which type=="+chemicalType);
		System.out.println("Chemical Element electron every where=="+isEveryWhere);
	}
}