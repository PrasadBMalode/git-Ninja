class GardenRunner

{
	public static void main(String [] ref)
	{
		Garden garden = new Garden(2300,'P');
		Garden nature = new Garden(2000,'B');
		
		RoseGarden rose = new RoseGarden(1200,true,garden);
		BotanicalGarden botanical = new BotanicalGarden(true,240.45f,nature);
		PublicParkGarden park = new PublicParkGarden(756,true,garden);
		rose.displayRoseGarden();
		botanical.displayBotanicalGarden();
		park.displayPublicParkGarden();


		
	}
}