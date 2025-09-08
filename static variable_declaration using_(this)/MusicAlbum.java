class MusicAlbum{
	public static int songCount;
	public static String name;
	public static long albumId;
	public static float rating;
	public static double albumPrice;
	public static char genre;
	public static boolean recorded;
	
	public MusicAlbum(int songCount,String name,long albumId, float rating, double albumPrice, char genre, boolean recorded){
		
		System.out.println("first try="+this.songCount);
		System.out.println("first try="+this.name);
		System.out.println("first try="+this.albumId);
		System.out.println("first try="+this.rating);
		System.out.println("first try="+this.albumPrice);
		System.out.println("first try="+this.genre);
		System.out.println("first try="+this.recorded);
		
		this.songCount=songCount;
		this.name=name;
		this.albumId=albumId;
		this.rating=rating;
		this.albumPrice=albumPrice;
		this.genre=genre;
		this.recorded=recorded;
		
		System.out.println("second try="+this.songCount);
		System.out.println("second try="+this.name);
		System.out.println("second try="+this.albumId);
		System.out.println("second try="+this.rating);
		System.out.println("Second try="+this.albumPrice);
		System.out.println("Second try="+this.genre);
		System.out.println("Second try="+this.recorded);
		
		
	}
}