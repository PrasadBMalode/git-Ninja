class DayaRunner{
	public static void main(String [] args){
		new Daya();
		new Daya("Dayanand Sharma");
		Daya daya =new Daya("Dayanand Sharma",102);
		Daya dayaNumber =new Daya("Dayanand Sharma",102,786576455378l);
		Daya dayaDetail =new Daya("Dayanand Sharma",102,786576455378l,7.7f);
		Daya dayaFullDetail =new Daya("Dayanand Sharma",102,786576455378l,7.7f,10.00056d);
		Daya fullDetail =new Daya("Dayanand Sharma",102,786576455378l,7.7f,10.00056d,'A');
		Daya fullDetails =new Daya("Dayanand Sharma",102,786576455378l,7.7f,10.00056d,'A',true);
	}
}