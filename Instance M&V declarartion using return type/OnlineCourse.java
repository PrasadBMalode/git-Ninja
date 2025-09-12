class OnlineCourse{
	public String courseName="java full stack";
	public int courseID=555676;
	public long enrollmentCount=2500040l;
	public float rating=4.6f;
	public double fee=14999.99d;
	public char level='A';
	public boolean isCirtified=true;
	
	public String name(){
		return courseName;
	}
	public int id(){
		return courseID;
	}
	public long count(){
		return enrollmentCount;
	}
	public float courseRating(){
		return rating;
	}
	public double cost(){
		return fee;
	}
	public char courseLevel(){
		return level;
	}
	public boolean cirtified(){
		return isCirtified;
	}
}