class KannadaSubject
{
	public int totalUnits;
	public String subjectTeacherName;
	public Student student;
	
	public KannadaSubject(int totalUnits,String subjectTeacherName,Student student)
	{
		this.totalUnits=totalUnits;
		this.student=student;
		this.subjectTeacherName=subjectTeacherName;
	}
	public void displayKannada()
	{
		System.out.println("Total units in subject :"+totalUnits+ ","+ "Subject teacher name :"+subjectTeacherName);
		System.out.println("Student name :"+student.studentName+ ","+ "Student id :"+student.id);
	}
}