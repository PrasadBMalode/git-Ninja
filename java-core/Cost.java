class Cost{
	public static void main(String [] args){
		
		byte band=90;
		byte chain=120;
		byte ring=40;
		byte belt=100;
		byte clip=30;
		
		byte [] accessories={band, chain, ring, belt, clip};
		System.out.println(accessories [2]);
		
		byte noseRing=65;
		accessories [2]= noseRing;
		System.out.println(accessories [2]);
		
		System.out.println("Some Amount list of Accessories");
		
		for (byte amount=0; amount < accessories.length; amount++)
		System.out.println(accessories [amount] );
		
	}
}