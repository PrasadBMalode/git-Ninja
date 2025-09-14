class StoresRunner{
	public static void main(String [] args){
		
		Stores stores=new Stores();
		
		MallInfo firstMallInfo=new MallInfo("lulu",102);
		MallInfo secondMallInfo=new MallInfo("GT",168);
		MallInfo thirdMallInfo=new MallInfo("Garuda",109);
		MallInfo fourthMallInfo=new MallInfo("Galary",128);
		MallInfo fifthMallInfo=new MallInfo("Finix",233);
		
		MallInfo[] mallInfo={firstMallInfo,secondMallInfo,thirdMallInfo,
		                     fourthMallInfo,fifthMallInfo};
		
		stores.storesDisplay(mallInfo);
	}
}