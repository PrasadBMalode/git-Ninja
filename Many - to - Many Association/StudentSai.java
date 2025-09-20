class StudentSai{
	public float saiObtainedMarks;
	public Java java;
	public DBMS dBMS;
	public OS oS;
	
	public StudentSai(float saiObtainedMarks,Java java, DBMS dBMS,OS oS){
		
		this.saiObtainedMarks=saiObtainedMarks;
		this.java=java;
		this.dBMS=dBMS;
		this.oS=oS;
		
	}
	
	public void saiDetails(){
		System.out.println("Student Sai obtained marks=="+saiObtainedMarks);
		System.out.println("Total marks in JAVA=="+java.javaTotalMarks);
		System.out.println("Total marks in DBMS=="+dBMS.dBMSTotalMarks);
		System.out.println("Total marks in Operating System=="+oS.osTotalMarks);
		
	}
}