class RecordSet{
	public RecordSet(){
		this(32);
	}
	
	public RecordSet(int roomNumber){
		this(32,"Alphin ");
	}
	public RecordSet(int roomNumber, String name){
		
		this(32,"Alphin ",987453787l);
	}
	public RecordSet(int roomNumber, String name, long registrationId){
		this(32,"Alphin ",987453787l,8.9f);
		
	}
	public RecordSet(int roomNumber, String name, long registrationId, float height){
		this(32,"Alphin ",987453787l,8.9f,789.25d);
		
	}
	public RecordSet(int roomNumber, String name, long registrationId, float height, double avgSpend){
		this(32,"Alphin ",987453787l,8.9f,789.25d, 'A');
		
	}
	public RecordSet(int roomNumber, String name, long registrationId, float height, double avgSpend, char grade){
		this(32,"Alphin ",987453787l,8.9f,789.45d, 'A',false);
		
	}
	
	public RecordSet(int roomNumber, String name, long registrationId, float height, double avgSpend, char grade, boolean veg){
		System.out.println(roomNumber);
		System.out.println(name);
		System.out.println(registrationId);
		System.out.println(height);
		System.out.println(avgSpend);
		System.out.println(grade);
		System.out.println(veg);
		
	}
}