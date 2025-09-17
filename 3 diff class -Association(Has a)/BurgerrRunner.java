class BurgerrRunner{
	public static void main(String []args){
		Cheez cheez=new Cheez("Cheez Burgerr");
		Burgerr burgerr=new Burgerr(cheez);
		System.out.println(burgerr.name);
	}
}