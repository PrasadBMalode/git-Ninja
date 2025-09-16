class GameDataRunner{
	public static void main(String [] args){
		GameData gameData=new GameData();
		
		GameInfo firstGameInfo=new GameInfo("GTA V",100.5f);
		GameInfo secondGameInfo=new GameInfo("call of duty",120.5f);
		GameInfo thirdGameInfo=new GameInfo("Elden Ring",50.8f);
		GameInfo fourthGameInfo=new GameInfo("Cyberpunk 2077",70.2f);
		GameInfo fifthGameInfo=new GameInfo("Red Dead Redemption 2",150.5f);
		
		GameInfo [] gameInfo={firstGameInfo,secondGameInfo,thirdGameInfo,
		                       fourthGameInfo,fifthGameInfo};
		
		gameData.gameDataDisplay(gameInfo);
	}
}