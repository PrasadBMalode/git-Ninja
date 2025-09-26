class ToolRunner{
	public static void main(String args [] ){
		Hammer hammer=new Hammer();
		
		hammer.displayToolName("Hammer");
		hammer.displayToolManifactureYear(2012);
		hammer.displayToolBatchNumber(98765432123l);
		hammer.displayToolWeight(3.5f);
		hammer.displayToolLength(16.50d);
		hammer.displayToolType('T');
		hammer.displayToolReuseable(true);
	}
}