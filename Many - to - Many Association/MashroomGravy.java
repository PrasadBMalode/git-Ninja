class MashroomGravy{
	public int mashroomGravyPrice;
	public GaramMasala garamMasala;
	public ChilliPowder chilliPowder;
	public Salt salt;
	
	public MashroomGravy(int mashroomGravyPrice, GaramMasala garamMasala,
	                              ChilliPowder chilliPowder,Salt salt){
									  
	this.mashroomGravyPrice=mashroomGravyPrice;
	this.garamMasala=garamMasala;
	this.chilliPowder=chilliPowder;
	this.salt=salt;
	
		
	}
	
	public void displayMashroomGravyDetails(){
		System.out.println("Gravy name=="+mashroomGravyPrice);
		System.out.println("Brand name of garam masala=="+garamMasala.brandNameOfGamramMasala);
		System.out.println("Brand name of chilli powder=="+chilliPowder.brandNameOfChilliPowder);
		System.out.println("total spoons of salt=="+salt.spoonsOfSalt);
	}
}