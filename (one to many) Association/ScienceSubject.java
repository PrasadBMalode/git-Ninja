class ScienceSubject
{
	public String subjectTeacherName;
	public int noOfStudentInScienceSubject;
	public Student student;
	
	public ScienceSubject(String subjectTeacherName,int noOfStudentInScienceSubject,Student student)
	{
		this.subjectTeacherName=subjectTeacherName;
		this.noOfStudentInScienceSubject=noOfStudentInScienceSubject;
		this.student=student;
	}
	public void displayScience()
	{
		System.out.println("Subject teacher name :"+subjectTeacherName+ ","+ "Number of student :"+noOfStudentInScienceSubject);
		System.out.println("Student name :"+student.studentName+ ","+ "Student id :"+student.id);
	}
}