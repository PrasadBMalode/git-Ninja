class Forest{
	public String name="Amezone Forest";
	public int totalAnimals=456784;
	public long totalLeaves=7865753425467l;
	public float avgRainFall=345.67f;
	public double oxygenProduction=9876.4321d;
	public char forestGrade='A';
	public boolean isProtected=true;
	
	public String forestName(){
		return name;
	}
	public int animals(){
		return totalAnimals;
	}
	public long Leaves(){
		return totalLeaves;
	}
	public float rainFall(){
		return avgRainFall;
	}
	public double oxygen(){
		return oxygenProduction;
	}
	public char grade(){
		return forestGrade;
	}
	public boolean forestProtected(){
		return isProtected;
	} 
}