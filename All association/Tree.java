class Tree{
	public int totalTreeSpecies;
	public Forest forest;
	
	public Tree(int totalTreeSpecies,Forest forest){
		this.totalTreeSpecies=totalTreeSpecies;
		this.forest=forest;
	}
	
	public void displayTree(){
		System.out.println("total tree species in amezon forest=="+totalTreeSpecies);
		System.out.println("Forest name=="+forest.forestName);
	}
}