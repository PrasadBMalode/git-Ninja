class OnlineCourseRunner{
	public static void main(String [] args){
		
		OnlineCourse onlinecourse=new OnlineCourse();
		String courseName=onlinecourse.name();
		System.out.println(courseName);
		
		int courseID=onlinecourse.id();
		System.out.println(courseID);
		
		long enrollmentCount=onlinecourse.count();
		System.out.println(enrollmentCount);
		
		float rating=onlinecourse.courseRating();
		System.out.println(rating);
		
		double fee=onlinecourse.cost();
		System.out.println(fee);
		
		char level=onlinecourse.courseLevel();
		System.out.println(level);
		
		boolean isCirtified=onlinecourse.cirtified();
		System.out.println(isCirtified);
	}
}