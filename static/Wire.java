class Wire{
	 
	 public static int length;
	 public static String colour;
	 public static long series;
	 public static float voltage;
	 public static double current;
	 public static char grade;
	 public static boolean goodProduct;

	public static void wireCharector(){
		
		System.out.println(length);
		System.out.println("inside the (wireCharector) method=  "+colour);
		System.out.println(series);
		System.out.println(voltage);
		System.out.println(current);
		System.out.println(grade);
		System.out.println(goodProduct);
	}
	public static void wireLength(){
		System.out.println("inside the (wireLength) method=  "+colour);
	}
	
}
