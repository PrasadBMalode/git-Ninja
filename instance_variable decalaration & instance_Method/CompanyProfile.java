class CompanyProfile{
	public String companyName="Infosys";
	public int companyId=202576;
	public long cinNumber=987656789l;
	public float sharePrice=785.25f;
	public double revenue=1250000.564d;
	public char category='A';
	public boolean isListed=true;
	
	public void company(){
		System.out.println("company Name="+companyName);
		System.out.println("Company ID="+companyId);
		System.out.println("Company CIN number="+cinNumber);
		System.out.println("share price of company="+sharePrice);
		System.out.println("revenue of a company="+revenue);
		System.out.println("catagory="+category);
		System.out.println("is this company listed="+isListed);
		
	}
}