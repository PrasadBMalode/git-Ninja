class BotanicalGarden
{
	public boolean hasResearchCenter;
	public float area;
	public Garden garden;
	
	public BotanicalGarden(boolean hasResearchCenter,float area,Garden garden)
	{
		this.area=area;
		this.garden=garden;
		this.hasResearchCenter=hasResearchCenter;
	}
	public void displayBotanicalGarden()
	{
		System.out.println("BotanicalGarden has Research Center :"+hasResearchCenter+ ","+ "BotanicalGarden area :"+area);
		System.out.println("Garden dialy Visitors :"+garden.dialyVisitors+ ","+ "Garden type :"+garden.type);
	}
}