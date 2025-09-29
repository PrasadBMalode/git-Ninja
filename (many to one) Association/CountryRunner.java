class CountryRunner
{
	public static void main(String [] ref)
	{
		Delhi delhi = new Delhi(45688,'D');
	    Bangalore bangalore = new Bangalore(7890670768l,true);
	    Mumbai mumbai = new Mumbai(38.56f,7897);
	    Kolkata kolkata = new Kolkata(456.344,9876543);
		
		Country country = new Country("India",delhi,bangalore,mumbai,kolkata);
		country.displayCountry();
	}
}