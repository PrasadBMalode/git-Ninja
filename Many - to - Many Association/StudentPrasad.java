class StudentPrasad{
	public float prasadObtainedMarks;
	public Java java;
	public DBMS dBMS;
	public OS oS;
	
	public StudentPrasad(float prasadObtainedMarks,Java java, DBMS dBMS,OS oS){
		
		this.prasadObtainedMarks=prasadObtainedMarks;
		this.java=java;
		this.dBMS=dBMS;
		this.oS=oS;
		
	}
	
	public void prasadDetails(){
		System.out.println("Student prasad obtained marks=="+prasadObtainedMarks);
		System.out.println("Total marks in JAVA=="+java.javaTotalMarks);
		System.out.println("Total marks in DBMS=="+dBMS.dBMSTotalMarks);
		System.out.println("Total marks in Operating System=="+oS.osTotalMarks);
		
	}
	
}