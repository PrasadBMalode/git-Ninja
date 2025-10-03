class ForestRunner{
	public static void main(String [] args){
		Forest forest=new Forest("Amezone forest");
		Tribuaries tribuaries=new Tribuaries(1300,forest);
		Birds birds=new Birds(1399,forest);
		Tree tree=new Tree(16000,forest);
		
		tribuaries.displayTribuaries();
		birds.displayBirds();
		tree.displayTree();
	}
}