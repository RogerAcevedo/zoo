package com.rogera.zoo;

public class Bat extends Mammals {

	public Bat() {
		super();
	}
	
	public void attackTown() {
		System.out.println("The bat used FIRE BLAST!: -100 energy \n");
		int energy = super.getEnergy();
		energy -= 100;
		super.setEnergy(energy);
		super.displayEnergy();
	}
	
	
	public void eatHumans() {
		System.out.println("This bat is gonna eat me ? i thought they were vegan?: +25 energy \n");
		int energy = super.getEnergy();
		energy += 25;
//		super() extends our parent class. invoke superclass method in our own 
		super.setEnergy(energy);
		super.displayEnergy();
	}
	
	public void fly() {
		System.out.println("HOMIE IS FAST! Coming at you 500 MPH!: Energy -50 \n");
		int energy = super.getEnergy();
		energy -= 50;
		super.setEnergy(energy);
		super.displayEnergy();
	}
		
}
