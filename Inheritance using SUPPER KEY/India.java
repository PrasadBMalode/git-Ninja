class India extends Country
{
	public String countryName;
	public int population;
	public char initial;
	public float area;
	public double literacyRate;
	public long gdp;
	public boolean isDeveloped;
	
	public India()
	{
		super();
		System.out.println("India class  no-argument const");
	}
	public India(String countryName,int population,char initial,float area,double literacyRate,long gdp,boolean isDeveloped)
	{
		this();
		
		this.countryName=countryName;
		this.population=population;
		this.initial=initial;
		this.area=area;
		this.literacyRate=literacyRate;
		this.isDeveloped=isDeveloped;
		this.gdp=gdp;
		
		super.countryName=countryName;
		super.population=population;
		super.initial=initial;
		super.area=area;
		super.literacyRate=literacyRate;
		super.isDeveloped=isDeveloped;
		super.gdp=gdp;
	}
	public void displayIndia()
	{
	System.out.println(this.countryName);
	System.out.println("India population "+this.population);
	System.out.println("India is Developed "+this.isDeveloped);
	System.out.println("India gdp "+this.gdp);
	System.out.println("India literacyRate "+this.literacyRate);
	System.out.println("India initial "+this.initial);
	System.out.println("India area "+this.area);
	
	System.out.println(super.countryName);
	System.out.println("India population "+super.population);
	System.out.println("India is Developed "+super.isDeveloped);
	System.out.println("India gdp "+super.gdp);
	System.out.println("India literacyRate "+super.literacyRate);
	System.out.println("India initial "+super.initial);
	System.out.println("India area "+super.area);
	}
}