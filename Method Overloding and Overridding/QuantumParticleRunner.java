class QuantumParticleRunner{
	public static void main(String [] args){
		QuantumParticle quantumParticle=new QuantumParticle();
		
		quantumParticle.displayQuantumParticle("Electrons");
		quantumParticle.displayQuantumParticle("Electrons", 1024);
		quantumParticle.displayQuantumParticle("Electrons", 1024, 5000008974l);
		quantumParticle.displayQuantumParticle("Electrons", 1024, 5000008974l, 0.8f);
		quantumParticle.displayQuantumParticle("Electrons", 1024, 5000008974l, 0.8f, 0.7865d);
		quantumParticle.displayQuantumParticle("Electrons", 1024, 5000008974l, 0.8f, 0.7865d, 'E');
		quantumParticle.displayQuantumParticle("Electrons", 1024, 5000008974l, 0.8f, 0.7865d, 'E', false);
	}
}