class TeeInfo{
	public String teeNames;
	public int pricesOfTee;
	
	public TeeInfo(String teeNames,int pricesOfTee){
		this. teeNames=teeNames;
		this.pricesOfTee=pricesOfTee;
	}
	
	public void teeDisplay(){
		System.out.println(teeNames);
		System.out.println(pricesOfTee);
		
	}
}