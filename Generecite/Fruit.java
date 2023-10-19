package fr.Generecite;

public class Fruit {

	private String name;
	/**
	 * 
	 * @return name of fruit
	 */
	public String getName() {
		return this.name;
	}
	
	private String color;
	/**
	 * 
	 * @return color of fruit
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
	public Fruit(String n, String c) {
		this.name=n;
		this.color=c;
	}
	
	public void displayFruit() {
		System.out.println("Nom du fruit : "+this.getName()+"\nCouleur du fruit : "+this.getColor());
	}
}
