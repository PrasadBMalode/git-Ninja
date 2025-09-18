class TrainerRunner{
	public static void main(String [] args){
		
		Trainee trainee=new Trainee("Evening Batch",17);
		Trainer trainer=new Trainer("Mahesh",35.999d,trainee);
		trainer.trainerDisplay();
		
		
	}
}