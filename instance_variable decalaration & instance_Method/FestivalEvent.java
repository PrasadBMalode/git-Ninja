class FestivalEvent{
	
	public String festivalName="Dasara";
	public int visitorCount=50000;
	public long passNumber=9898786765l;
	public float areaSize=25075f;
	public double budget=125000.99d;
	public char eventType='C';
	public boolean isEventFree=false;
	
	public void festival(){
		
		System.out.println("Festival Name= "+ festivalName );
		System.out.println(" total vistors count="+ visitorCount );
		System.out.println(" visiting pass number= "+ passNumber );
		System.out.println(" total organizing area= "+ areaSize );
		System.out.println(" total budget of event="+ budget );
		System.out.println(" is this event cultural type "+ eventType );
		System.out.println(" is this event free of cost="+ isEventFree );
	}
}