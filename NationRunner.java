class NationRunner
{
	public static void main(String [] ref)
	{
	Nation nation = new Nation();	
	int population =nation.displayPopulation();
	System.out.println(population);
	long area =nation.displayArea();
	System.out.println(area);
	float rate = nation.displayRate();
	System.out.println(rate);
	double gdp =nation.displayGdp();
	System.out.println(gdp);
	char currency=nation.displayCurrency();
	System.out.println(currency);
	boolean democracy=nation.displayDemocracy();
	System.out.println(democracy);
	String name=nation.displayName();
	System.out.println(name);
	}
}