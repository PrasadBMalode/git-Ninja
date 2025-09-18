class ComputerRunner{
	public static void main(String [] args){
		
		KeyBored keyBored=new KeyBored("HP KeyBored",22.5f);
		Computer computer=new Computer("SAMSUNG",85.999d,keyBored);
		computer.computerDisplay();
		
	}
}