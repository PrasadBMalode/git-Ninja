class SpectFrameRunner{
	public static void main(String [] args){
		Lens lens=new Lens(1800);
		SpectFrame spectFrame=new SpectFrame("Light blue",lens);
		
		spectFrame.displayFrame();
	}
}