package fr.Generecite2;

public class Box<T> {

	private T elements;
	/**
	 * 
	 * @return elemets de type inconnu
	 */
	public T getElements() {
		return this.elements;
	}
	
	public Box(T elements) {
		this.elements=elements;
	}
}
