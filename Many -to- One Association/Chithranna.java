class Chithranna{
	public String chithrannaName;
	public int chithrannaPrice;
	public Oil oil;
	public Pienuts pienuts;
	public Turmaric turmaric;
	
	public Chithranna(String chithrannaName, int chithrannaPrice, Oil oil, Pienuts pienuts,Turmaric turmaric ){
		this.chithrannaName=chithrannaName;
		this.chithrannaPrice=chithrannaPrice;
		this.oil=oil;
		this.pienuts=pienuts;
		this.turmaric=turmaric;
	}
	
	public void displayChithrannaDetails(){
		System.out.println("Name of Chithranna=="+chithrannaName);
		System.out.println("price of that Chithranna=="+chithrannaPrice);
		System.out.println("total spoons of oil=="+oil.oilNumberOfSpoons);
		System.out.println("Pinuts in gram way=="+pienuts.gramsOfPienuts);
		System.out.println("Turmuric in gram way=="+turmaric.gramOfTurmaric);
	}
	
	
}