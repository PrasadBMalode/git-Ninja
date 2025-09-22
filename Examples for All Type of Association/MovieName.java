class MovieName{
	public String nameOfTheMovie;
	public MovieHero movieHero;
	public MovieHeroien movieHeroien;
	public MovieVillen movieVillen;
	
	public MovieName(String nameOfTheMovie,MovieHero movieHero,MovieHeroien movieHeroien,MovieVillen movieVillen){
		
		this.nameOfTheMovie=nameOfTheMovie;
		this.movieHero=movieHero;
		this.movieHeroien=movieHeroien;
		this.movieVillen=movieVillen;
	}
	
	public void displayMovieDetails(){
		System.out.println("Movie name=="+nameOfTheMovie);
		System.out.println("Hero name=="+movieHero.movieHero);
		System.out.println("Heroien name=="+movieHeroien.movieHeroien);
		System.out.println("Villen name=="+movieVillen.movieVillen);
		
	} 
	
}