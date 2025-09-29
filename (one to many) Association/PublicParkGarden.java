class PublicParkGarden
{
	public int noOfGates;
	public boolean hasPlayground;
	public Garden garden;
	
	public PublicParkGarden(int noOfGates,boolean hasPlayground,Garden garden)
	{
		this.noOfGates=noOfGates;
		this.hasPlayground=hasPlayground;
		this.garden=garden;
	}
	public void displayPublicParkGarden()
	{
		System.out.println("Number of gates :"+noOfGates+ ","+ "ublicPark Garden has Playground :"+hasPlayground);
		System.out.println("Garden dialy Visitors :"+garden.dialyVisitors+ ","+ "Garden type :"+garden.type);
	}
}