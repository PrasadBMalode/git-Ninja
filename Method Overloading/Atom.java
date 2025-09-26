class Atom{
	public void displayAtom(String name){
		System.out.println("Atom name=="+name);
	}
	public void displayAtom(String name, int electrons){
		System.out.println("Atom name=="+name);
		System.out.println("Electrons count=="+electrons);
	}
	public void displayAtom(String name, int electrons, long nucleusMass){
		System.out.println("Atom name=="+name);
		System.out.println("Electrons count=="+electrons);
		System.out.println("Nucleaus mass=="+nucleusMass);
	}
	public void displayAtom(String name, int electrons, long nucleusMass, float radious){
		System.out.println("Atom name=="+name);
		System.out.println("Electrons count=="+electrons);
		System.out.println("Nucleaus mass=="+nucleusMass);
		System.out.println("Atom Radious=="+radious);
	}
	public void displayAtom(String name, int electrons, long nucleusMass, float radious, double energyLevel){
		System.out.println("Atom name=="+name);
		System.out.println("Electrons count=="+electrons);
		System.out.println("Nucleaus mass=="+nucleusMass);
		System.out.println("Atom Radious=="+radious);
		System.out.println("Atom energy Level=="+energyLevel);
	}
	public void displayAtom(String name, int electrons, long nucleusMass, float radious, double energyLevel,
	                           char symbol){
		System.out.println("Atom name=="+name);
		System.out.println("Electrons count=="+electrons);
		System.out.println("Nucleaus mass=="+nucleusMass);
		System.out.println("Atom Radious=="+radious);
		System.out.println("Atom energy Level=="+energyLevel);
		System.out.println("Atom symbol=="+symbol);
	}
	public void displayAtom(String name, int electrons, long nucleusMass, float radious, double energyLevel,
	                           char symbol, boolean isStable){
		System.out.println("Atom name=="+name);
		System.out.println("Electrons count=="+electrons);
		System.out.println("Nucleaus mass=="+nucleusMass);
		System.out.println("Atom Radious=="+radious);
		System.out.println("Atom energy Level=="+energyLevel);
		System.out.println("Atom symbol=="+symbol);
		System.out.println("Atom is stable=="+isStable);
	}
}