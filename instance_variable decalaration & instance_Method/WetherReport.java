class WetherReport{
	
	public int temparature=32;
	public String place="Bangalore";
	public long recordID=123456789l;
	public float windSpeed=12.8f;
	public double pressure=1013.25d;
	public char zone='W';
	public boolean isRaining=true;
	
	public void report(){
		
		//temparature=42;
		
		System.out.println("wether temparature is="+temparature);
		System.out.println("Location="+place);
		System.out.println("report ID="+recordID);
		System.out.println("wind Speed="+windSpeed);
		System.out.println("wind pressure="+pressure);
		System.out.println("wether Zone="+zone);
		System.out.println("is now raining="+isRaining);
		
	}
	
}

