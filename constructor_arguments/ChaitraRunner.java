class ChaitraRunner{
	public static void main(String [] args){
		new Chaitra();
		new Chaitra("Ravi Sharma");
		Chaitra chaitra =new Chaitra("Chaitra",106);
		Chaitra chaitraNumber =new Chaitra("Chaitra",106,7867564534l);
		Chaitra chaitraDetail =new Chaitra("Chaitra",106,7867564534l,4.4f);
		Chaitra chaitraFullDetail =new Chaitra("Chaitra",106,7867564534l,4.4f,87.6976d);
		Chaitra fullDetail =new Chaitra("Chaitra",106,7867564534l,4.4f,87.6976d,'A');
		Chaitra fullDetails =new Chaitra("Chaitra",106,7867564534l,4.4f,87.6976d,'A',true);
	}
}