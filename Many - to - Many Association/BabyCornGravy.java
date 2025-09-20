class BabyCornGravy{
	public int babyCornGravyPrice;
	public GaramMasala garamMasala;
	public ChilliPowder chilliPowder;
	public Salt salt;
	
	public BabyCornGravy(int babyCornGravyPrice, GaramMasala garamMasala,
	                              ChilliPowder chilliPowder,Salt salt){
									  
	this.babyCornGravyPrice=babyCornGravyPrice;
	this.garamMasala=garamMasala;
	this.chilliPowder=chilliPowder;
	this.salt=salt;
	
		
	}
	
	public void displayBabyCornGravyDetails(){
		System.out.println("Gravy name=="+babyCornGravyPrice);
		System.out.println("Brand name of garam masala=="+garamMasala.brandNameOfGamramMasala);
		System.out.println("Brand name of chilli powder=="+chilliPowder.brandNameOfChilliPowder);
		System.out.println("total spoons of salt=="+salt.spoonsOfSalt);
	}
}