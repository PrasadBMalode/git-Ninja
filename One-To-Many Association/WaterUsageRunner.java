class WaterUsageRunner{
	public static void main(String [] args){
		
		Water water=new Water(2,true);
		water.waterDisplay();
		
		Drinking drinking=new Drinking("Black Water",5499,water);
		
		Coocking coocking=new Coocking("Prasad BM",30000,water);
		
		Bathing bathing=new Bathing("ASURE",40.5f,water);
		
		Coocking coockingTwo=new Coocking("SAI",35000,water);
		
		drinking.DrinkingDisplay();
		bathing.bathingDisplay();
		coocking.coockingDisplay();
		
		coockingTwo.coockingDisplay();
		
		
		
	}
}