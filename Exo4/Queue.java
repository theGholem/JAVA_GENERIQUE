package fr.Exo4;

import java.util.ArrayList;
import java.util.List;
import java.util.NoSuchElementException;

public class Queue<T> {
	
	private List<T> myQueue;
	
	/**
	 * Constructor
	 */
	public Queue() {
		this.myQueue=new ArrayList<T>(); //Instanciation de notre objet de liste
	}
	
	/**
	 * méthode enqueueElement() pour enfiler un élément de type T à la fin de la file
	 * 
	 * @param e
	 */
	public void enqueueElement(T e) {
		this.myQueue.add(e);
	}

	/**
	 * 
	 * @return vrai si la file est vide, faux si la file n'est pas vide
	 */
	public Boolean isEmpty() {
		return this.myQueue.isEmpty();
	}
	
	/**
	 * 
	 * @return l'element ajouter en premier et le supprime de la file
	 */
	public T dequeueElement() {
		
		if(isEmpty()) {
			throw new NoSuchElementException("La file est vide"); //dans le cas ou la file est vide
		}
		
		return this.myQueue.remove(0); //on supprime l'element a l'indice 0 selon FIFO car c'est le premier de la file 
	}
	
	/**
	 * 
	 * @return le nombre d'element de notre file
	 */
	public int count() {
		return this.myQueue.size();
	}
	
	/**
	 * 
	 * @return l'element en tete de file
	 */
	public T peek() {
		
		if(isEmpty()) {
			throw new NoSuchElementException("La file est vide"); //dans le cas ou la file est vide
		}
		
		return this.myQueue.get(0);//on recupere l'element a l'indice 0 selon FIFO car c'est le premier de la file à ce moment 
	}
	
	/**
	 * classe d'execution
	 * 
	 * @param args
	 */
	public static void main(String args[]) {
		
		Queue<String> file=new Queue<String>(); //Instanciation de notre objet de Queue
		
		//Ajout d'element à notre file
		file.enqueueElement("FINLANDE");
		file.enqueueElement("GABON");
		file.enqueueElement("HONGRIE");
		file.enqueueElement("IRELANDE");
		file.enqueueElement("JAMAIQUE");
		
		//Size de notre file
		System.out.println("---------File(FIFO:First_In-First_Out)-----------\nLa taille de notre file est : "+file.count());
		
		//retirer(defiler) le dernier element de la file
		System.out.println("On retire d'abord :"+file.dequeueElement());
		System.out.println("On retire ensuite :"+file.dequeueElement());
		
		//On veut obtenir le premier element de la file(tete de file)
		System.out.println("Maintenant l'element en tete de file est:"+file.peek());
		
		//Nouvelle taille maj de notre file
		System.out.println("La taille de notre file mise a jour est : "+file.count());
		
	}
	
	
}
