class WorkersData{
	public WorkersData(){
		System.out.println("its a default constructor");
	}
	public WorkersData(String group,boolean hardWork){
		System.out.println(group);
		System.out.println(hardWork);
	}
	public WorkersData(int total_workers, long products){
		System.out.println(total_workers);
		System.out.println(products);
	}
	public WorkersData(float workRange, double salary, char groupGrade){
		System.out.println(workRange);
		System.out.println(salary);
		System.out.println(groupGrade);
	}
}