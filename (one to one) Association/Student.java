class Student{
	public String studentName;
	public int studentid;
	public PhNumber phNumber;
	
	public Student(String studentName, int studentid, PhNumber phNumber){
		this.studentName=studentName;
		this.studentid=studentid;
		this.phNumber=phNumber;
		
	}
	
	public void displayStudentDetails(){
		System.out.println(studentName);
		System.out.println(studentid);
		System.out.println(phNumber.number);
		System.out.println(phNumber.nation);
		
	}
}