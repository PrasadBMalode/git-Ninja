class TeeMilkRunner{
	public static void main(String [] args){
		Milk milk=new Milk();
		
		TeeInfo firstTeeInfo=new TeeInfo("Green Tee",20);
		TeeInfo secondTeeInfo=new TeeInfo("Ginger Tee",15);
		TeeInfo thirdTeeInfo=new TeeInfo("Black Tee",10);
		TeeInfo fourthTeeInfo=new TeeInfo("Masala tee",25);
		TeeInfo fifthTeeInfo=new TeeInfo("Lemon tee",18);
		
		TeeInfo[] teeInfo={firstTeeInfo,secondTeeInfo,thirdTeeInfo,
		                    fourthTeeInfo,fifthTeeInfo};
		
		milk.milkDisplay(teeInfo);
	}
}