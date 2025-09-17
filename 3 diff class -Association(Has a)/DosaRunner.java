class DosaRunner{
	public static void main(String [] args){
		Chetnyee chetnyee=new Chetnyee("Pudina Chetny");
		Dosa dosa=new Dosa(chetnyee);
		System.out.println(dosa.name);
	}
}