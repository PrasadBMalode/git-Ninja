class StudentRunner
{
	public static void main(String [] ref)
	{
		Student student = new Student("Arun K",01);
		Student students=new Student("Ravi L",18);
		
	    ScienceSubject science = new ScienceSubject("Kanchan",50,student);
		KannadaSubject kannada = new KannadaSubject(24,"Kushal",students);
		science.displayScience();
		kannada.displayKannada();
	}
}