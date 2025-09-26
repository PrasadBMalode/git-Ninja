class Cell{
	public void displayCell(String description){
		System.out.println("Description for cell=="+description);
	}
	public void displayCell(String description, int chromosomNumber){
		System.out.println("Description for cell=="+description);
		System.out.println("Cell chromosom Number=="+chromosomNumber);
	}
	public void displayCell(String description, int chromosomNumber, long cellMassPg){
		System.out.println("Description for cell=="+description);
		System.out.println("Cell chromosom Number=="+chromosomNumber);
		System.out.println("Cell cell Mass in picoGrams=="+cellMassPg);
	}
	public void displayCell(String description, int chromosomNumber, long cellMassPg, float cellDiameter){
		System.out.println("Description for cell=="+description);
		System.out.println("Cell chromosom Number=="+chromosomNumber);
		System.out.println("Cell cell Mass in picoGrams=="+cellMassPg);
		System.out.println("Cell Diameter=="+cellDiameter);
	}
	public void displayCell(String description, int chromosomNumber, long cellMassPg, float cellDiameter,
	                         double cytoplasmVolumeUm3){
		System.out.println("Description for cell=="+description);
		System.out.println("Cell chromosom Number=="+chromosomNumber);
		System.out.println("Cell cell Mass in picoGrams=="+cellMassPg);
		System.out.println("Cell Diameter=="+cellDiameter);
		System.out.println("Cell cytoplasm Volume Um3=="+cytoplasmVolumeUm3);
	}
	public void displayCell(String description, int chromosomNumber, long cellMassPg, float cellDiameter,
	                         double cytoplasmVolumeUm3, char type){
		System.out.println("Description for cell=="+description);
		System.out.println("Cell chromosom Number=="+chromosomNumber);
		System.out.println("Cell cell Mass in picoGrams=="+cellMassPg);
		System.out.println("Cell Diameter=="+cellDiameter);
		System.out.println("Cell cytoplasm Volume Um3=="+cytoplasmVolumeUm3);
		System.out.println("Cell containing Eukaryotic type=="+type);
	}
	public void displayCell(String description, int chromosomNumber, long cellMassPg, float cellDiameter,
	                         double cytoplasmVolumeUm3, char type, boolean isAlive){
		System.out.println("Description for cell=="+description);
		System.out.println("Cell chromosom Number=="+chromosomNumber);
		System.out.println("Cell cell Mass in picoGrams=="+cellMassPg);
		System.out.println("Cell Diameter=="+cellDiameter);
		System.out.println("Cell cytoplasm Volume Um3=="+cytoplasmVolumeUm3);
		System.out.println("Cell containing Eukaryotic type=="+type);
		System.out.println("Cell is alive=="+isAlive);
	}
}