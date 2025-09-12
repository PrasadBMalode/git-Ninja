class AprilInfo{
	public void april(MarchInfo marchInfo){
		FebruaryInfo februaryInfo=new FebruaryInfo();
		marchInfo.march(februaryInfo);
		System.out.println("this is a april method");
	}
}