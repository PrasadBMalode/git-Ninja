class RoseGarden
{
	public int noOfRoses;
	public boolean hasGreenhouse;
	public Garden garden;
	
	public RoseGarden(int noOfRoses,boolean hasGreenhouse,Garden garden)
	{
		this.noOfRoses=noOfRoses;
		this.hasGreenhouse=hasGreenhouse;
        this.garden=garden;
	}
	public void displayRoseGarden()
	{
		System.out.println("Number of roses :"+noOfRoses+ ","+ "RoseGarden has Greenhouse :"+hasGreenhouse);
		System.out.println("Garden dialy Visitors :"+garden.dialyVisitors+ ","+ "Garden type :"+garden.type);
	}
}