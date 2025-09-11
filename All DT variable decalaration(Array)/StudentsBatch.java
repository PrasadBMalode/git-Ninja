class StudentsBatch{
	public String [] names={"PRASAD","DAYA","BHOOMI","CHANDU","MANDARA","ARVIND","SHARATH"};
	
	public void batch(){
		
		for(int students=0; students<names.length; students++){
			System.out.println(names[students]);
		}
	}
}