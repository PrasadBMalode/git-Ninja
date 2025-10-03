class Tribuaries{
	public int totalAvgTribuaries;
	public Forest forest;
	
	public Tribuaries(int totalAvgTribuaries,Forest forest){
		this.totalAvgTribuaries=totalAvgTribuaries;
		this.forest=forest;
	}
	public void displayTribuaries(){
		System.out.println("total Tribuaries in amezon forest=="+totalAvgTribuaries);
		System.out.println("Forest name=="+forest.forestName);
	}
}