class ZooRunner{
	public static void main(String [] args){
		Animals animals=new Animals(3200,true);
		Zoo zoo=new Zoo("Banner Gattha Zoo",75,animals);
		zoo.zooDisplay();
	}
}