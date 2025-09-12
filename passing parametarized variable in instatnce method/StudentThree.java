class StudentThree{
	public void three(StudentTwo studentTwo){
		StudentOne studentOne=new StudentOne();
		studentTwo.two(studentOne);
		System.out.println("this is a Three method");
	}
}