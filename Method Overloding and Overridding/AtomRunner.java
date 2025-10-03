class AtomRunner{
	public static void main(String [] args){
		Atom atom=new Atom();
		//atom.displayAtom("Carbon", 6, 12000000000078l, 0.2f, 13.65d, 'C', true);
		atom.displayAtom("Carbon");
		atom.displayAtom("Carbon",6);
		atom.displayAtom("Carbon",6,12000000000078l);
		atom.displayAtom("Carbon",6,12000000000078l,0.2f);
		atom.displayAtom("Carbon",6,12000000000078l,0.2f,13.65d);
		atom.displayAtom("Carbon",6,12000000000078l,0.2f,13.65d,'c');
		atom.displayAtom("Carbon",6,12000000000078l,0.2f,13.65d,'c',true);
	}
}