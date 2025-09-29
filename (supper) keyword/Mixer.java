class Mixer extends ElectricDevice{

public int price;
public String mixerName;
public float bladeSize;
public double volatage;
public long serialNumber;
public char energyRating;
public boolean isWorking;

public Mixer(){
System .out.println("this is non arguemental constructor");
}
public Mixer(int price,String mixerName,float bladeSize,double volatage,long serialNumber,char energyRating,boolean isWorking){

super();
this.price=price;
this.mixerName=mixerName;
this.bladeSize=bladeSize;
this.volatage=volatage;
this.serialNumber=serialNumber;
this.energyRating=energyRating;
this.isWorking=isWorking;

super.price=price;
super.mixerName=mixerName;
super.bladeSize=bladeSize;
super.volatage=volatage;
super.serialNumber=serialNumber;
super.energyRating=energyRating;
super.isWorking=isWorking;

}
public void displayMixer(){

System.out.println("Mixer price="+this.price);
System.out.println("Mixer name="+this.mixerName);
System.out.println("blade size="+this.bladeSize);
System.out.println("volatage="+this.volatage);
System.out.println("serialNumber="+this.serialNumber);
System.out.println("energyRating="+this.energyRating);
System.out.println("isWorking="+this.isWorking);

System.out.println("Mixer price="+super.price);
System.out.println("Mixer name="+super.mixerName);
System.out.println("blade size="+super.bladeSize);
System.out.println("volatage="+super.volatage);
System.out.println("serialNumber="+super.serialNumber);
System.out.println("energyRating="+super.energyRating);
System.out.println("isWorking="+super.isWorking);


}
}