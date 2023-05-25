package com.rogera.zoo;

// EXTENSION OF OUR "Mammals" CLASS
public class Gorilla extends Mammals{

	public Gorilla() {
		super();
	}
	
	public void throwSomething() {
		int energy = super.getEnergy();
		energy -= 5;
		System.out.println("Gorilla throwing shade rn: -5 energy \n");
		super.setEnergy(energy);
		// "super.displayEnergy();" - displays in "Test" class
		super.displayEnergy();
	}
	
	public void eatBananas() {
		int energy = super.getEnergy();
		energy += 10;
		System.out.println("Toma Chango tu Banana: +10 energy \n");
		super.setEnergy(energy);
		super.displayEnergy();
	}
	
	public void climb() {
		int energy = super.getEnergy();
		energy -= 10;
		System.out.println("This Gorrilla is climbing: -10 energy \n");
		super.setEnergy(energy);
		super.displayEnergy();
	}
	
}
