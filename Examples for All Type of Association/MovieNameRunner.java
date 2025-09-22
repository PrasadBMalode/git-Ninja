class MovieNameRunner{
	public static void main(String [] args){
		
		
		MovieVillen movieVillen=new MovieVillen("Rakshit Shetty");
		MovieHeroien movieHeroien=new MovieHeroien("Sheetal Shetty");
		MovieHero movieHero=new MovieHero("Achyuth");
		
		MovieName movieName=new MovieName("Ulidavaru Kandante",movieHero,movieHeroien,movieVillen);
		
		movieName.displayMovieDetails();
		
		
		
		
	}
}