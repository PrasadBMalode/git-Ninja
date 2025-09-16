class Game{
	public static int players;
	public static String gameName;
	public static long gameId;
	public static float rating;
	public static double version;
	public static char code;
	public static boolean isOnline;
	
	public Game(int players,String gameName,long gameId, float rating, double version, char code, boolean isOnline){
		
		System.out.println("first try="+this.players);
		System.out.println("first try="+this.gameName);
		System.out.println("first try="+this.gameId);
		System.out.println("first try="+this.rating);
		System.out.println("first try="+this.version);
		System.out.println("first try="+this.code);
		System.out.println("first try="+this.isOnline);
		
		this.players=players;
		this.gameName=gameName;
		this.gameId=gameId;
		this.rating=rating;
		this.version=version;
		this.code=code;
		this.isOnline=isOnline;
		
		System.out.println("second try="+this.players);
		System.out.println("second try="+this.gameName);
		System.out.println("second try="+this.gameId);
		System.out.println("second try="+this.rating);
		System.out.println("Second try="+this.version);
		System.out.println("Second try="+this.code);
		System.out.println("Second try="+this.isOnline);
		
		
	}
}