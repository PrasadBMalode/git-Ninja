class GoldChain{
	public GoldChain(){
		this("Ganesh Jewlwry");
		System.out.println("its default class GoldChain ");
	}
	public GoldChain(String shopName){
		this("Ganesh Jewlwry",1234);
		System.out.println(shopName);
	}
	public GoldChain(String shopName,int id){
	this("Ganesh Jewlwry",1234,987654321l);
		System.out.println(shopName);
		System.out.println(id);
	}
	public GoldChain(String shopName,int id,long series){
	this("Ganesh Jewlwry",1234,987654321l,true);
		System.out.println(shopName);
		System.out.println(id);
		System.out.println(series);
	}
	public GoldChain(String shopName,int id,long series,boolean isGood){
		this("Ganesh Jewlwry",1234,987654321l,true,30.5f);
		System.out.println(shopName);
		System.out.println(id);
		System.out.println(series);
		System.out.println(isGood);
	}
	public GoldChain(String shopName,int id,long series,boolean isGood, float weight){
		this("Ganesh Jewlwry",1234,987654321l,true,30.5f,165000.99d);
		System.out.println(shopName);
		System.out.println(id);
		System.out.println(series);
		System.out.println(isGood);
		System.out.println(weight);
	}
	public GoldChain(String shopName,int id,long series,boolean isGood, float weight, double price ){
		this("Ganesh Jewlwry",1234,987654321l,true,30.5f,165000.99d,'A');
		System.out.println(shopName);
		System.out.println(id);
		System.out.println(series);
		System.out.println(isGood);
		System.out.println(weight);
		System.out.println(price);
	}
	public GoldChain(String shopName,int id,long series,boolean isGood, float weight, double price, char grade){
		System.out.println(shopName);
		System.out.println(id);
		System.out.println(series);
		System.out.println(isGood);
		System.out.println(weight);
		System.out.println(price);
		System.out.println(grade);
	}
}