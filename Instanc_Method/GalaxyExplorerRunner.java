class GalaxyExplorerRunner{
	public static void main(String args []){
		
		GalaxyExplorer lanch=new GalaxyExplorer();
		lanch.lanchExplorer();
		
		GalaxyExplorer scan=new GalaxyExplorer();
		scan.scanStars();
		
		GalaxyExplorer  cosmic=new GalaxyExplorer();
		cosmic.collectCosmicData();
		
		GalaxyExplorer  blackHoles=new GalaxyExplorer();
		blackHoles.exploreBlackHoles();
		
		GalaxyExplorer  end=new GalaxyExplorer();
		end.endMission();
	}
}