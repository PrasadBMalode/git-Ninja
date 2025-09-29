class Iron extends Metal{

public int price;
public String shopName;
public float rateing;
public long ownerNumber;
public double review;
public char gender;
public boolean isOriginal;
public Iron(){
System .out.println("this is non arguemental constructor");
}


public Iron (int price,String shopName,float rateing,long ownerNumber,double review,char gender,boolean isOriginal){
super();
this.price=price;
this.shopName=shopName;
this.rateing=rateing;
this.ownerNumber=ownerNumber;
this.review=review;
this.gender=gender;
this.isOriginal=isOriginal;

super.price=price;
super.shopName=shopName;
super.rateing=rateing;
super.ownerNumber=ownerNumber;
super.review=review;
super.gender=gender;
super.isOriginal=isOriginal;


}
public  void displayIron(){

System.out.println("price=="+this.price);
System.out.println("shop name=="+this.shopName);
System.out.println("rate=="+this.rateing);
System.out.println(" owner number=="+this.ownerNumber);
System.out.println("review=="+this.review);
System.out.println("gender=="+this.gender);
System.out.println("is good=="+this.isOriginal);


System.out.println("price=="+super.price);
System.out.println("shop name=="+super.shopName);
System.out.println("rate=="+super.rateing);
System.out.println(" owner number=="+super.ownerNumber);
System.out.println("review=="+super.review);
System.out.println("gender=="+super.gender);
System.out.println("is good=="+super.isOriginal);


}
}