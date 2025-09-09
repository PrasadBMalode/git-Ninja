class SportsMatch{
	
	public String tournamentName="IPL Final";
	public int matchId=334455;
	public long stadiumCode=123456789864l;
	public float runRate=7.8f;
	public double totalScore=198.45;
	public char result='W';
	public boolean isCompleated=true;
	
	public void match(){
		
		System.out.println("Tourenment Name= "+  tournamentName);
		
		System.out.println("IPL match id= "+ matchId );
		
		System.out.println("code of the statudium "+  stadiumCode);
		
		System.out.println("ipl match run rate "+  runRate);
		
		System.out.println("total score of an match "+  totalScore);
		
		System.out.println("final results of the match "+  result);
		
		System.out.println(" finaly  match completed"+  isCompleated);
	}
}