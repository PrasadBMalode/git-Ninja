class Hammer extends Tool{
	public void displayToolName(String hammerName){
		System.out.println("its a Hammer (Derived class) method");
		System.out.println(hammerName);
	}
	public void displayToolManifactureYear(int hammerYear){
		System.out.println(hammerYear);
	}
	public void displayToolBatchNumber(long hammerBatchNumber){
		System.out.println(hammerBatchNumber);
	}
	public void displayToolWeight(float hammerWeight){
		System.out.println(hammerWeight);
	}
	public void displayToolLength(double hammerLength){
		System.out.println(hammerLength);
	}
	public void displayToolType(char hammerType){
		System.out.println(hammerType);
	}
	public void displayToolReuseable(boolean ishammerReuseable){
		System.out.println(ishammerReuseable);
	}
	
}