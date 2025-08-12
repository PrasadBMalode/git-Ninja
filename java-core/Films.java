class Films{
	public static void main(String [] args){
		
		String thirler="Insidious";
		String horrer="Conjuring";
		String mythological="Asur";
		String zombies="Go Goa Gon";
		String sciFi="Interstellar";
		String suspense="404 Error Not Found";
		
		String [] movies={thirler,horrer,mythological,mythological,sciFi, suspense};
		
		System.out.println("My Fev Movies Collectio");
		
		for(int pictures=0; pictures < movies.length; pictures++)
			System.out.println(movies[pictures]);
		
		
	}
}