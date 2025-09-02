class RakshaRunner{
	public static void main(String [] args){
		new Raksha();
		new Raksha("Ravi Sharma");
		Raksha raksha =new Raksha("Raksha",105);
		Raksha rakshaNumber =new Raksha("Raksha",105,8899775768l);
		Raksha rakshaDetail =new Raksha("Raksha",105,8899775768l,4.7f);
		Raksha rakshaFullDetail =new Raksha("Raksha",105,8899775768l,4.7f,87.8976d);
		Raksha fullDetail =new Raksha("Raksha",105,8899775768l,4.7f,87.8976d,'A');
		Raksha fullDetails =new Raksha("Raksha",105,8899775768l,4.7f,87.8976d,'A',true);
	}
}