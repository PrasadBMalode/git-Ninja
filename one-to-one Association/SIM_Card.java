class SIM_Card{
	public String simName;
	public int simPrice;
	
	public SIM_Card(String simName,int simPrice){
		this.simName=simName;
		this.simPrice=simPrice;
	}
	
	public void SIM_CardDisplay(){
		System.out.println(simName);
		System.out.println(simPrice);
	}
}