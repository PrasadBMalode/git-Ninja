class Army{
	public int approximateSoldiersCount;
	public Rifile rifile;
	public Missile missile;
	public Helicopter helicopter;
	
	public Army(int approximateSoldiersCount,Rifile rifile,Missile missile,Helicopter helicopter){
		this.approximateSoldiersCount=approximateSoldiersCount;
		this.rifile=rifile;
		this.missile=missile;
		this.helicopter=helicopter;
	}
	
	public void displayArmyDetails(){
		System.out.println("Approximate Active soldiers Count in Lakhs=="+approximateSoldiersCount);
		System.out.println("Common useing Rifiles=="+rifile.firstRifileName);
		System.out.println("Common using missile=="+missile.missileName);
		System.out.println("Common using helicpters=="+helicopter.firstHelicopterName);
		
	}
	
	
}