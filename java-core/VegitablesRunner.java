class VegitablesRunner{
	public static void main(String args []){
		
		int rate=Vegitables.vegitableRate(55);
		System.out.println(rate);
		
		String name=Vegitables.vegitableName("Tomato");
		System.out.println(name);
		
		float weight=Vegitables.vegitableWeight(45.6f);
		System.out.println(weight);
		
		char letter=Vegitables.vegitableLetter('T');
		System.out.println(letter);
		
		boolean good=Vegitables.vegitableCondition(true);
		System.out.println(good);
		
		double content=Vegitables.vegitableContent(13.4567);
		System.out.println(content);
		
		long produce=Vegitables.vegitableProduced(4567891234l);
		System.out.println(produce);
	}
}