class Fruit
{
public Fruit()
{
this(100);
}
public Fruit(int prFruit){
this(500,"gudbud");
System.out.println("the Fruit constructor with prFruit ="+prFruit);
}
public Fruit(int ammount,String flavere){
this(60,"arun",5.5f);
System.out.println("this is arugmrntal constructorprFruit="+ammount);
System.out.println("this is arugmrntal constructor brandName="+flavere);
}
public Fruit(int prFruit, String brandName,float rateing ){
	this(true,6.6,'A',"choclate");
System.out.println("this is a constructor rateing="+rateing);
System.out.println("this is constructor prFruit="+prFruit);
System.out.println("this is constructor brandName="+brandName);
}
public Fruit(boolean isGood,double reveiw,char grade,String flavere){
	System.out.println("this Fruit is good="+isGood);
	System.out.println("Fruit is choclate flavere="+flavere);
}
}