class IndianDifenceSystemRunner{
	public static void main(String [] args){
		
		Helicopter helicopter=new Helicopter("Dhruv","Cheetah");
		Missile missile=new Missile("Brahmos Missile");
		Rifile rifile=new Rifile("INSAS rifile","AK-47/203");
		
		AirForce airForce=new AirForce(1.4f,rifile,missile,helicopter);
		Navy navy=new Navy(67,rifile,missile,helicopter);
		Army army=new Army(12,rifile,missile,helicopter);
		
		airForce.displayAirForceDetails();
		navy.displayNavyDetails();
		army.displayArmyDetails();
		
		
		
	}
}