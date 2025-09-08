class DataBundel{
	public DataBundel(){
		this(18);
	}
	
	public DataBundel(int roomNumber){
		this(18,"SAI_PRASAD_BM ");
	}
	public DataBundel(int roomNumber, String name){
		
		this(18,"SAI_PRASAD_BM ",786453787l);
	}
	public DataBundel(int roomNumber, String name, long registrationId){
		this(18,"SAI_PRASAD_BM ",786453787l,8.9f);
		
	}
	public DataBundel(int roomNumber, String name, long registrationId, float height){
		this(18,"SAI_PRASAD_BM ",786453787l,8.9f,750.25d);
		
	}
	public DataBundel(int roomNumber, String name, long registrationId, float height, double avgSpend){
		this(18,"SAI_PRASAD_BM ",786453787l,8.9f,750.25d, 'A');
		
	}
	public DataBundel(int roomNumber, String name, long registrationId, float height, double avgSpend, char grade){
		this(18,"SAI_PRASAD_BM ",786453787l,8.9f,800.45d, 'A',true);
		
	}
	
	public DataBundel(int roomNumber, String name, long registrationId, float height, double avgSpend, char grade, boolean veg){
		System.out.println(roomNumber);
		System.out.println(name);
		System.out.println(registrationId);
		System.out.println(height);
		System.out.println(avgSpend);
		System.out.println(grade);
		System.out.println(veg);
		
	}
}