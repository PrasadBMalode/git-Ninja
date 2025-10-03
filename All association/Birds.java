class Birds{
	public int totalBirdsSpecies;
	public Forest forest;
	
	public Birds(int totalBirdsSpecies, Forest forest){
		this.totalBirdsSpecies=totalBirdsSpecies;
		this.forest=forest;
	}
	public void displayBirds(){
		System.out.println("total Birds species in amezon forest=="+totalBirdsSpecies);
		System.out.println("Forest name=="+forest.forestName);
	}
}