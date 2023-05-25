package com.rogera.zoo;

public class Mammals {
	private int energy;
	
//	CONSTRUCTORS
	
	//DEFAULT
	public Mammals() {
		this.energy = 100;
	}
	
	//EMPTY - NO PARAMETERS
	public int getEnergy() {
		return this.energy;
	}
	
	//TAKES IN "int energy" parameter
	public void setEnergy(int energy) {
		this.energy = energy;
	}
	
	public int displayEnergy() {
//		PRINTTF??
		System.out.printf("The energy level is %s \n" , this.energy);
		return this.energy;
	}


}

