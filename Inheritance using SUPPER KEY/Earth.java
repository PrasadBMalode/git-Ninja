class Earth extends Planet{
	public String name;
	public int eartTotalCountries;
	public long earthAgeYears;
	public float earthGravity;
	public double earthSurfaceArea;
	public char earthSymbol;
	public boolean eartHasALife;
	
	public Earth(){
		super();
		System.out.println("this is non argument Eart Constructor");
	}
	
	public Earth(String name, int eartTotalCountries, long earthAgeYears, float earthGravity,
                	double earthSurfaceArea, char earthSymbol, boolean eartHasALife){
						
						this();
						
						this.name=name;
						this.eartTotalCountries=eartTotalCountries;
						this.earthAgeYears=earthAgeYears;
						this.earthGravity=earthGravity;
						this.earthSurfaceArea=earthSurfaceArea;
						this.earthSymbol=earthSymbol;
						this.eartHasALife=eartHasALife;
						
						super.name=name;
						super.eartTotalCountries=eartTotalCountries;
						super.earthAgeYears=earthAgeYears;
						super.earthGravity=earthGravity;
						super.earthSurfaceArea=earthSurfaceArea;
						super.earthSymbol=earthSymbol;
						super.eartHasALife=eartHasALife;
		
		
	}
	
	public void displayEarth(){
		System.out.println("Name of planet"+this.name);
		System.out.println("total countries in earth=="+this.eartTotalCountries);
		System.out.println("earth total years=="+this.earthAgeYears);
        System.out.println("gravity of earth=="+this.earthGravity);
	    System.out.println("surface area of earth=="+this.earthSurfaceArea);
		System.out.println("earth symbol=="+this.earthSymbol);
	    System.out.println("is there has a life=="+this.eartHasALife);
		
		System.out.println("Name of planet"+super.name);
		System.out.println("total countries in earth=="+super.eartTotalCountries);
		System.out.println("earth total years=="+super.earthAgeYears);
        System.out.println("gravity of earth=="+super.earthGravity);
	    System.out.println("surface area of earth=="+super.earthSurfaceArea);
		System.out.println("earth symbol=="+super.earthSymbol);
	    System.out.println("is there has a life=="+super.eartHasALife);
		
		
	}
}