class DataSet{
	public DataSet(){
		System.out.println("its a Default constructor");
	}
	public DataSet(String name){
		System.out.println(name);
	}
	public DataSet(int members, long series, float range){
		System.out.println(members);
		System.out.println(series);
		System.out.println(range);
	}
	public DataSet(double total, boolean present, char gender){
		System.out.println(total);
		System.out.println(present);
		System.out.println(gender);
	}
}