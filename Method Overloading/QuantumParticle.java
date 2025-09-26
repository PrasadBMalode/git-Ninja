class QuantumParticle{
	public void displayQuantumParticle(String particleName){
		System.out.println("Quantum particle name=="+particleName);
	}
	public void displayQuantumParticle(String particleName, int particleID){
		System.out.println("Quantum particle name=="+particleName);
		System.out.println("Quantum particle ID=="+particleID);
	}
	public void displayQuantumParticle(String particleName, int particleID, long positionInNanometers){
		System.out.println("Quantum particle name=="+particleName);
		System.out.println("Quantum particle ID=="+particleID);
		System.out.println("Quantum particle position in nanometers=="+positionInNanometers);
	}
	public void displayQuantumParticle(String particleName, int particleID, long positionInNanometers, float momentum){
		System.out.println("Quantum particle name=="+particleName);
		System.out.println("Quantum particle ID=="+particleID);
		System.out.println("Quantum particle position in nanometers=="+positionInNanometers);
		System.out.println("Quantum particle momentum=="+momentum);
	}
	public void displayQuantumParticle(String particleName, int particleID, long positionInNanometers, float momentum,
	                                     double probability){
		System.out.println("Quantum particle name=="+particleName);
		System.out.println("Quantum particle ID=="+particleID);
		System.out.println("Quantum particle position in nanometers=="+positionInNanometers);
		System.out.println("Quantum particle momentum=="+momentum);
		System.out.println("Quantum particle probability=="+probability);
	}
	public void displayQuantumParticle(String particleName, int particleID, long positionInNanometers, float momentum,
	                                     double probability, char typeSymbol){
		System.out.println("Quantum particle name=="+particleName);
		System.out.println("Quantum particle ID=="+particleID);
		System.out.println("Quantum particle position in nanometers=="+positionInNanometers);
		System.out.println("Quantum particle momentum=="+momentum);
		System.out.println("Quantum particle probability=="+probability);
		System.out.println("Quantum particle type Symbol=="+typeSymbol);
	}
	public void displayQuantumParticle(String particleName, int particleID, long positionInNanometers, float momentum,
	                                     double probability, char typeSymbol, boolean isObserved){
		System.out.println("Quantum particle name=="+particleName);
		System.out.println("Quantum particle ID=="+particleID);
		System.out.println("Quantum particle position in nanometers=="+positionInNanometers);
		System.out.println("Quantum particle momentum=="+momentum);
		System.out.println("Quantum particle probability=="+probability);
		System.out.println("Quantum particle type Symbol=="+typeSymbol);
		System.out.println("Quantum particle is Observed=="+isObserved);
	}
}