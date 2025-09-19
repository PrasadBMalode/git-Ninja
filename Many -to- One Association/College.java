class College{
	public String collgeName;
	public Teacher teacher;
	public Department department;
	public NAAC nAAC;
	
	public College(String collgeName, Teacher teacher, Department department, NAAC nAAC){
		this.collgeName=collgeName;
		this.teacher=teacher;
		this.department=department;
		this.nAAC=nAAC;
	}
	
	public void displayCollegeDetails(){
		System.out.println("College name=="+collgeName);
		System.out.println("Teacher name=="+teacher.teacherName);
		System.out.println("Department name=="+department.departmentName);
		System.out.println("NAAC commity grade for college=="+nAAC.nAACGrade);
		
		
	}
}