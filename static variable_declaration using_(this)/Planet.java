class Planet{
	public static int planetPosition;
	public static String planetName;
	public static long series;
	public static float gravity;
	public static double diameater;
	public static char panetCode;
	public static boolean supportLife;
	
	public Planet(int planetPosition,String planetName,long series, float gravity, double diameater, char panetCode, boolean supportLife){
		
		System.out.println("first try="+this.planetPosition);
		System.out.println("first try="+this.planetName);
		System.out.println("first try="+this.series);
		System.out.println("first try="+this.gravity);
		System.out.println("first try="+this.diameater);
		System.out.println("first try="+this.panetCode);
		System.out.println("first try="+this.supportLife);
		
		this.planetPosition=planetPosition;
		this.planetName=planetName;
		this.series=series;
		this.gravity=gravity;
		this.diameater=diameater;
		this.panetCode=panetCode;
		this.supportLife=supportLife;
		
		System.out.println("second try="+this.planetPosition);
		System.out.println("second try="+this.planetName);
		System.out.println("second try="+this.series);
		System.out.println("second try="+this.gravity);
		System.out.println("Second try="+this.diameater);
		System.out.println("Second try="+this.panetCode);
		System.out.println("Second try="+this.supportLife);
		
		
	}
}