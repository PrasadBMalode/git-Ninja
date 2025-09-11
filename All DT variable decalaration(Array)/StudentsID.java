class StudentsID{
	public int [] rollNumbers={101,102,103,104,105,106};
	
	public void id(){
		for(int student=0; student<rollNumbers.length; student++){
			System.out.println(rollNumbers[student]);
		}
	}
}