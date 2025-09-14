class SchoolData{
	public String schoolName;
	public int numberOfStaffs;
	
	
	public SchoolData(String schoolName,int numberOfStaffs){
		
		this.schoolName=schoolName;
		this.numberOfStaffs=numberOfStaffs;
	}
	
	public void schoolDisplay(){
		System.out.println(schoolName);
		System.out.println(numberOfStaffs);
	}

	
}