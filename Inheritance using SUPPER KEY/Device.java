class Device extends ElectronicDevice
{
	public String brandName ;
	public int price;
	public char type;
	public float screenSize;
	public double weight;
	public long serialNumber ;
	public boolean isSamartDevice;
	
	public Device()
	{
		super();
		System.out.println("Device class  no-argument const");
	}
	public Device(String brandName,int price,char type,float screenSize,double weight,long serialNumber,boolean isSamartDevice)
	{
		this();
		
		this.brandName=brandName;
		this.price=price;
		this.type=type;
		this.screenSize=screenSize;
		this.serialNumber=serialNumber;
		this.isSamartDevice=isSamartDevice;
		this.weight=weight;
		
		super.brandName=brandName;
		super.price=price;
		super.type=type;
		super.screenSize=screenSize;
		super.serialNumber=serialNumber;
		super.isSamartDevice=isSamartDevice;
		super.weight=weight;
	}
	public void displayDevice()
	{
	System.out.println("Device brandName " +this.brandName);
	System.out.println("Device price" +this.price);
	System.out.println("Device type "+this.type);
	System.out.println("Device screen Size "+this.screenSize);
	System.out.println("Device serialNumber "+this.serialNumber);
	System.out.println("Device isSamart Device "+this.isSamartDevice);
	System.out.println("Device weight "+this.weight);
	
	System.out.println("Device brandName " +super.brandName);
	System.out.println("Device price" +super.price);
	System.out.println("Device type "+super.type);
	System.out.println("Device screen Size "+super.screenSize);
	System.out.println("Device serialNumber "+super.serialNumber);
	System.out.println("Device isSamart Device "+super.isSamartDevice);
	System.out.println("Device weight "+super.weight);
	}
}