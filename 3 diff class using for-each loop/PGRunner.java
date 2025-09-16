class PGRunner{
	public static void main(String [] args){
		
		PG pG=new PG();
		
		PgRoom firstPgRoom=new PgRoom("Prasad",101);
		PgRoom secondPgRoom=new PgRoom("sai",102);
		PgRoom thirdPgRoom=new PgRoom("saiPrasad",103);
		PgRoom fourthPgRoom=new PgRoom("daya",104);
		PgRoom fifthPgRoom=new PgRoom("sumit",105);
		
		PgRoom[] pgRoom={firstPgRoom,secondPgRoom,thirdPgRoom,fourthPgRoom,fifthPgRoom};
		
		pG.pGDisplay(pgRoom);
		
	}
}