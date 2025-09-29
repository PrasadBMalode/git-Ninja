class Country
{
	public String countryName;
	public Delhi delhi;
	public Bangalore bangalore;
	public Mumbai mumbai;
	public Kolkata kolkata;
	public Country(String countryName,Delhi delhi,Bangalore bangalore,Mumbai mumbai,Kolkata kolkata)
	{
		this.countryName=countryName;
		this.delhi=delhi;
		this.mumbai=mumbai;
		this.kolkata=kolkata;
		this.bangalore=bangalore;
		
	}
	public void displayCountry()
	{
		System.out.println("Country name :"+countryName);
		System.out.println("Delhi area :"+delhi.area+ ","+ "Delhi initial :"+delhi.initial);
		System.out.println("Bangalore population :"+bangalore.population+ ","+"Bangalore is Capital :"+bangalore.isCapital);
		System.out.println("Mumbai temperature :"+mumbai.temperature+ ","+ "Mumbai area :"+mumbai.area);
		System.out.println("Kolkata population :"+kolkata.population+ ","+ "Kolkata literacyRate :"+kolkata.literacyRate);
	}
}