package fr.Generecite;

public class Vegetable {

	private String name;
	/**
	 * 
	 * @return name of vegetable
	 */
	public String getName() {
		return this.name;
	}
	
	private String color;
	/**
	 * 
	 * @return color of vegetable
	 */
	public String getColor() {
		return this.color;
	}
	
	/**
	 * constructor
	 * 
	 * @param n
	 * @param c
	 */
	public Vegetable(String n, String c) {
		this.name=n;
		this.color=c;
	}
	
	public void displayVegetable() {
		System.out.println("Nom du legume : "+this.getName()+"\nCouleur du legume : "+this.getColor());
	}
	
}
