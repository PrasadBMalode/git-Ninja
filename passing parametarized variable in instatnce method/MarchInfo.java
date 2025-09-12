class MarchInfo{
	public void march(FebruaryInfo februaryInfo){
		JanuaryInfo januaryInfo=new JanuaryInfo();
		februaryInfo.february(januaryInfo);
		System.out.println("this is a march method");
	}
}