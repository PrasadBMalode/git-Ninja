class Trainer{
	public String trainerName;
	public double trainerSalary;
	public Trainee trainee;
	
	
	public Trainer(String trainerName,double trainerSalary, Trainee trainee){
		this.trainerName=trainerName;
		this.trainerSalary=trainerSalary;
		this.trainee=trainee;
	}
	
	public void trainerDisplay(){
	System.out.println(trainerName);
	System.out.println(trainerSalary);
	System.out.println(trainee.batchName);
	System.out.println(trainee.numberOfStudents);
	
	}
}