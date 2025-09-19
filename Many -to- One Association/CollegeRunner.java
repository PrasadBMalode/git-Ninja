class CollegeRunner{
	public static void main(String [] args){
		NAAC nAAC=new NAAC('A');
		Department department=new Department("CS Department");
		Teacher teacher=new Teacher("PRASAD BM");
		College college=new College("RTES college",teacher, department, nAAC);
		college.displayCollegeDetails();
		
	}
}