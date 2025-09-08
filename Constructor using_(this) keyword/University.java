class University{
	public University(){
		this(25000);
	}
	
	public University(int students){
		this(25000,"Oxford University");
	}
	public University(int students, String name){
		
		this(25000,"Oxford University",786453787l);
	}
	public University(int students, String name, long id){
		this(25000,"Oxford University",786453787l,92.3f);
		
	}
	public University(int students, String name, long id, float placmentRate){
		this(25000,"Oxford University",786453787l,92.3f,750.25d);
		
	}
	public University(int students, String name, long id, float placmentRate, double campusArea){
		this(25000,"Oxford University",786453787l,92.3f,750.25d, 'A');
		
	}
	public University(int students, String name, long id, float placmentRate, double campusArea, char grade){
		this(25000,"Oxford University",786453787l,92.3f,750.25d, 'A',true);
		
	}
	
	public University(int students, String name, long id, float placmentRate, double campusArea, char grade, boolean isGOVT){
		System.out.println(students);
		System.out.println(name);
		System.out.println(id);
		System.out.println(placmentRate);
		System.out.println(campusArea);
		System.out.println(grade);
		System.out.println(isGOVT);
		
	}
}