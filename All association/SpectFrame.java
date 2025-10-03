class SpectFrame{
	public String frameColour;
	public Lens lens;
	
	public SpectFrame(String frameColour, Lens lens){
		this.frameColour=frameColour;
		this.lens=lens;
	}
	public void displayFrame(){
		System.out.println("Frame colour=="+frameColour);
		System.out.println("lense price=="+lens);
	}
}