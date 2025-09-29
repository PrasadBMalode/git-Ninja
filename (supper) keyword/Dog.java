class Dog extends Animal{

public int animalAge;
public String animalName;
public float animalHeight;
public long animalOwnerNumber;
public double animalPrice;
public char animalGender;
public boolean isPetAnimal;


public Dog(){
System.out.println("this non arguement constructor");
}
public Dog(int animalAge,String animalName,float animalHeight,long animalOwnerNumber,double animalPrice,char animalGender,boolean isPetAnimal)
{
super();
super.animalAge=animalAge;
super.animalName=animalName;
super.animalHeight=animalHeight;
super.animalOwnerNumber=animalOwnerNumber;
super.animalPrice=animalPrice;
super.animalGender=animalGender;
super.isPetAnimal=isPetAnimal;

this.animalAge=animalAge;
this.animalName=animalName;
this.animalHeight=animalHeight;
this.animalOwnerNumber=animalOwnerNumber;
this.animalPrice=animalPrice;
this.animalGender=animalGender;
this.isPetAnimal=isPetAnimal;
}
public  void displayDog(){

System.out.println("animal Age=="+this.animalAge);
System.out.println("animal name=="+this.animalName);
System.out.println("animal Height=="+this.animalHeight);
System.out.println("animal owner number=="+this.animalOwnerNumber);
System.out.println("animal price=="+this.animalPrice);
System.out.println("animalgender=="+this.animalGender);
System.out.println("it is a pet=="+this.isPetAnimal);


System.out.println("animal Age=="+super.animalAge);
System.out.println("animal name=="+super.animalName);
System.out.println("animal Height=="+super.animalHeight);
System.out.println("animal owner number=="+super.animalOwnerNumber);
System.out.println("animal price=="+super.animalPrice);
System.out.println("animalgender=="+super.animalGender);
System.out.println("it is a pet=="+super.isPetAnimal);



}
}