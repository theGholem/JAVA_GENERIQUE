package fr.Exo3;

import java.util.ArrayList;
import java.util.EmptyStackException;
import java.util.List;

public class Stack<T> {
	
	private List<T> myStack; //Attibut
	
	/**
	 * Constructor
	 */
	public Stack() {
		myStack=new ArrayList<T>(); //Instanciation
	}
	
	
	/**
	 ** cette methode permet d'empiler les elements
	 * 
	 * @param t
	 */
	public void pushElement(T t) {
		myStack.add(t);
	}
	
	/**
	 * 
	 * @return vrai ou faux conformement à l'etat de notre pile
	 */
	public Boolean isEmpty() {
		return myStack.isEmpty(); //la methode isEmpty() permet de verifier si notre pile est vide ou pas
	}
	
	/**
	 * 
	 * @return le dernier element supprimé de  notre pile
	 */
	public T popElement() {
		if(isEmpty()) {
			throw new EmptyStackException(); //gere l'erreur du cas ou notre pile ne serait pas vide
		}
		/**
		 *Ici on utilise la methode remove() pour suprimer le dernier element ajouté a la pile(tailleDeLaPile-1)
		 */
		T Stack=myStack.remove(myStack.size()-1);
		return Stack; 
	}
	
	/**
	 * 
	 * @return la taille de la pile
	 */
	public int count() {
		return myStack.size();
	}
	
	/**
	 * 
	 * @return l'element en haut de la pile
	 */
	public T peek() {
		if(isEmpty()) {
			throw new EmptyStackException();
		}
		T Stack=myStack.get(0); //L'indice 0 correspond a l'element au sommet de la pile. En effet on compte à partir de 0
		return Stack;
	}
	
	public static void main(String[]args) {
		
		Stack<String> pile=new Stack<String>();
		
		pile.pushElement("ALLEMAGNE");
		pile.pushElement("BOLIVIE");
		pile.pushElement("CANADA");
		pile.pushElement("DANEMARK");
		pile.pushElement("ESTONIE");
		
		System.out.println("\nLa taille de notre pile actuelle est : "+pile.count());
		
		//suppression du dernier element ajouté a notre pile soit 'ESTONIE'
		System.out.println("On decide de supprimer le dernier element de la pile soit : '"+pile.popElement()+"'");
		
		//Affichage de la nouvelle taille
		System.out.println("La taille a ete mise a jour : "+pile.count());
		
		//recuperation de l'element en haut de la pile
		System.out.println("Element au sommet de la pile :"+pile.peek());
		
		//Affichage de la nouvelle taille
		System.out.println("La taille a ete mise a jour : "+pile.count());
		
	}
	

}
