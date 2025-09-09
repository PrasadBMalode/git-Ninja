class TechnologyDevice{
	
	public String brand="REALME";
	public int modelId=654321;
	public long serialNumber=987654321234l;
	public float screenSize=6.7f;
	public double price=54999.99d;
	public char deviceType='M';
	public boolean is5gSupported=true;
	
	public void technology(){
		
		System.out.println(" Device brand name="+ brand );
		System.out.println(" Model Id="+ modelId );
		System.out.println(" serial number of device= "+ serialNumber );
		System.out.println(" screen size of device="+ screenSize );
		System.out.println(" total cost of device"+ price );
		System.out.println(" device containing which type="+ deviceType );
		System.out.println(" is support for 5g"+ is5gSupported );
	}
}