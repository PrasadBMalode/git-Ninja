class StudentRavi{
	public float raviObtainedMarks;
	public Java java;
	public DBMS dBMS;
	public OS oS;
	
	public StudentRavi(float raviObtainedMarks,Java java, DBMS dBMS,OS oS){
		
		this.raviObtainedMarks=raviObtainedMarks;
		this.java=java;
		this.dBMS=dBMS;
		this.oS=oS;
		
	}
	
	public void raviDetails(){
		System.out.println("Student Ravi obtained marks=="+raviObtainedMarks);
		System.out.println("Total marks in JAVA=="+java.javaTotalMarks);
		System.out.println("Total marks in DBMS=="+dBMS.dBMSTotalMarks);
		System.out.println("Total marks in Operating System=="+oS.osTotalMarks);
		
	}
}