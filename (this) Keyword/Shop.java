class Shop{
public Shop()
{
this(100);
}
public Shop(int price){
this(500000,"gogel");
System.out.println("the  constructor with price ="+price);
}
public Shop(int num,String name){
this(11,"accenture",5.5f);
System.out.println("this is arugmrntal constructorprice="+num);
System.out.println("this is arugmrntal constructor name="+name);
}
public Shop(int employeenumber, String ShopName,float rateing ){
	this(true,6.6,'A',"ibm");
System.out.println("this is a constructor rateing="+rateing);
System.out.println("this is constructor price="+employeenumber);
System.out.println("this is constructor ShopName="+ShopName);
}
public Shop(boolean isGood,double reveiw,char grade,String name){
	this(40,4.6f,false,'B',"tajaupahara",6.6,9988776655l);
	System.out.println("name="+name);
	System.out.println("this  is good="+isGood);
	System.out.println("name="+name);
	System.out.println("this is grade="+grade);

}
public Shop(int ammount,float reveiw,boolean isBad,char grade,String brandName,double rateing,long number){
	System.out.println("ammount="+ammount);
	System.out.println("reveiw="+reveiw);
	System.out.println("isBad="+isBad);
	System.out.println("grade="+grade);
	System.out.println("flavere="+brandName);
	System.out.println("rateing="+rateing);
	System.out.println("number="+number);
}
}