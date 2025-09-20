class StudentRunner{
	public static void main(String [] args){
		Java java=new Java(100);
		DBMS dBMS=new DBMS(100);
		OS oS=new OS(100);
		
		StudentRavi studentRavi=new StudentRavi(78,java,dBMS,oS);
		StudentSai studentSai=new StudentSai(88,java,dBMS,oS);
		StudentPrasad studentPrasad=new StudentPrasad(89,java,dBMS,oS);
		
		studentPrasad.prasadDetails();
		studentSai.saiDetails();
		studentRavi.raviDetails();
		
		
	}
}