class LaboratoryRunner{
	public static void main(String [] args){
		Molecule molecule=new Molecule(2);
		Solution solution=new Solution("liquid");
		Beaker beaker=new Beaker(250.5f);
		Laboratory laboratory=new Laboratory("Chemistry lab",beaker,solution,molecule);
		laboratory.displayLaboratory();
	}
}