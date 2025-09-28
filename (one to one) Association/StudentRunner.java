class StudentRunner{
	public static void main(String [] args){
		PhNumber phNumber=new PhNumber(6360211265l,"indian");
		Student student=new Student("Prasad",101,phNumber);
		student.displayStudentDetails();
	}
}