class{
	public static void main(String [] args){
		GaramMasala garamMasala=new GaramMasala("Everest Garam Masala");
		ChilliPowder chilliPowder=new ChilliPowder("MTR chilli Powder");
		Salt salt=new Salt(2);
		
		BabyCornGravy babyCornGravy=new BabyCornGravy(220, garamMasala, chilliPowder, salt);
		MashroomGravy mashroomGravy=new MashroomGravy(340, garamMasala, chilliPowder, salt);
		PannerGravy pannerGravy=new PannerGravy(320, garamMasala, chilliPowder, salt);
		
		babyCornGravy.displayBabyCornGravyDetails();
		mashroomGravy.displayMashroomGravyDetails();
		pannerGravy.displayPannerGravyDetails();
		
		
		
	}
}