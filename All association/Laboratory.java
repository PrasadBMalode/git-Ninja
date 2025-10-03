class Laboratory{
	public String labName;
	public Beaker beaker;
	public Solution solution;
	public Molecule molecule;
	
	public Laboratory(String labName,Beaker beaker, Solution solution, Molecule molecule){
		this.labName=labName;
		this.beaker=beaker;
		this.solution=solution;
		this.molecule=molecule;
	}
	
	public void displayLaboratory(){
		System.out.println("lab name=="+labName);
		System.out.println("capacity in ml=="+beaker.beakerCapacityInMl);
		System.out.println("solution state=="+solution.solutionState);
		System.out.println("number of atoms=="+molecule.numberOfAtoms);
		
		
	}
}