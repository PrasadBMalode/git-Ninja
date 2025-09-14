class StaffRunner{
	public static void main(String [] args){
		Staff staff=new Staff();
		
		SchoolData firstSchoolData=new SchoolData("Akash",32);
		SchoolData secondSchoolData=new SchoolData("presidency",45);
		SchoolData thirdSchoolData=new SchoolData("JSS",62);
		SchoolData fourthSchoolData=new SchoolData("RTES",29);
		SchoolData fifthSchoolData=new SchoolData("KLE",35);
		
		SchoolData[] schoolData={firstSchoolData,secondSchoolData,thirdSchoolData,
		                           fourthSchoolData,fifthSchoolData};
		
		staff.staffDisplay(schoolData);
	}
}