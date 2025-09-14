class MallInfo{
	public String mallNames;
	public int numberOfStores;
	
	public MallInfo(String mallNames,int numberOfStores){
		
		this.mallNames=mallNames;
		this.numberOfStores=numberOfStores;
		
	}
	
	public void mallDisplay(){
		System.out.println(mallNames);
		System.out.println(numberOfStores);
	}
}