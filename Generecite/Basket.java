package fr.Generecite;

public class Basket<E> {
	
	private E item;
	/**
	 * 
	 * @return item
	 */
	public E getItem() {
		return this.item;
	}
	
	/**
	 * constructor
	 * 
	 * @param i
	 */
	public Basket(E i) {
		this.item=i;
	}

}
