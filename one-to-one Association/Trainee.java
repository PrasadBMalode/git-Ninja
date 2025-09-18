class Trainee{
	public String batchName;
	public int numberOfStudents;
	
	public Trainee(String batchName,int numberOfStudents){
		
		this.batchName=batchName;
		this.numberOfStudents=numberOfStudents;
		
	}
	
	public void traineeDisplay(){
		System.out.println(batchName);
				System.out.println(numberOfStudents);

	}
	
}