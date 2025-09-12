class StudentFour{
	public void four(StudentThree studentThree){
		StudentTwo studentTwo=new StudentTwo();
		studentThree.three(studentTwo);
		System.out.println("this is a Four method");
	}
}