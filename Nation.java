class Nation
{
	public int population = 45000;
	public long area = 5675433l;
	public float literacyRate = 77.3f;
	public double gdp = 3.45;
	public char currencySymbol  = 'R';
	public boolean isDemocracy = true;
	public String name = "India";
	
	public int displayPopulation()
	{
		return population;
	}
	public long displayArea()
	{
		return area;
	}
	public float displayRate()
	{
		return literacyRate;
	}
	public double displayGdp()
	{
		return gdp;
	}
	public char displayCurrency()
	{
		return currencySymbol;
	}
	public boolean displayDemocracy()
	
	{
		return isDemocracy;
	}
	public String displayName()
	{
		return name;
	}
}