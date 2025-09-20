class PannerGravy{
	public int pannerGravyPrice;
	public GaramMasala garamMasala;
	public ChilliPowder chilliPowder;
	public Salt salt;
	
	public PannerGravy(int pannerGravyPrice, GaramMasala garamMasala,
	                              ChilliPowder chilliPowder,Salt salt){
									  
	this.pannerGravyPrice=pannerGravyPrice;
	this.garamMasala=garamMasala;
	this.chilliPowder=chilliPowder;
	this.salt=salt;
	
		
	}
	
	public void displayPannerGravyDetails(){
		System.out.println("Gravy name=="+pannerGravyPrice);
		System.out.println("Brand name of garam masala=="+garamMasala.brandNameOfGamramMasala);
		System.out.println("Brand name of chilli powder=="+chilliPowder.brandNameOfChilliPowder);
		System.out.println("total spoons of salt=="+salt.spoonsOfSalt);
	}
}