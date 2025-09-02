class RaviRunner{
	public static void main(String [] args){
		new Ravi();
		new Ravi("Ravi Sharma");
		Ravi ravi =new Ravi("Ravi Sharma",104);
		Ravi raviNumber =new Ravi("Ravi Sharma",104,9876543214l);
		Ravi raviDetail =new Ravi("Ravi Sharma",104,9876543214l,5.7f);
		Ravi raviFullDetail =new Ravi("Ravi Sharma",104,9876543214l,5.7f,76.8976d);
		Ravi fullDetail =new Ravi("Ravi Sharma",104,9876543214l,5.7f,76.8976d,'C');
		Ravi fullDetails =new Ravi("Ravi Sharma",104,9876543214l,5.7f,76.8976d,'C',false);
	}
}