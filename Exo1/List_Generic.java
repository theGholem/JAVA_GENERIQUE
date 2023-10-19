package fr.Exo1;

import java.util.ArrayList;
import java.util.List;

public class List_Generic<T> {
	
	private List<T> maList;
	
	/**
	 * @apiNote constructor de class
	 * 
	 * 
	 */
	public List_Generic() {
		this.maList=new ArrayList<T>(); //Instanciation 
	}
	
	/**
	 * Fonction qui permet d'ajouter des elements à ma List 
	 * 
	 * @param e
	 */
	public void addElements(T e) {
		maList.add(e);
	}
	
	/**
	 * 
	 * Fonction qui permet de supprimer des elements à ma List 
	 * 
	 * @param e
	 */
	public void removeElements(T e) {
		maList.remove(e);
	}
	
	/**
	 * 
	 * @return la taille de notre liste
	 */
	public int sizeList() {
		return maList.size();
	}
	
	public T getElementByIndex(int index) {
		
		if(index>=0 && index<maList.size()) {
			return maList.get(index);
		}else {
			throw new IndexOutOfBoundsException("Index hors limite");
		}
	}
	
	
	public static void main(String[]args) {
		
		List_Generic<Integer> list_Integer=new List_Generic<>();
		List_Generic<String> list_String=new List_Generic<>();
		
		//Ajout d'elements dans notre liste d'entier
		list_Integer.addElements(1);
		list_Integer.addElements(8);
		list_Integer.addElements(9);
		
		
		
		//Ajout d'elements dans notre liste de string
		list_String.addElements("KAMCHI");
		list_String.addElements("PANCHO");
		list_String.addElements("GUTS");
		list_String.addElements("ICHIGO");
		list_String.addElements("KANEKI");
		
		//on va supprimer quelques elements de nos listes
		list_Integer.removeElements(9);
		list_String.removeElements("KANEKI");
		
		//on veut afficher la taille de nos listes
		System.out.println("Taille de la liste d'entier : " + list_Integer.sizeList()+"(on commence le comptage a partir de '0')");
		System.out.println("Taille de la liste de chaine : " + list_String.sizeList()+"(on commence le comptage a partir de '0')");
		
		//On veut maintenant determiner l'element à la position 1 de nos liste
		System.out.println("L'element a la position 1 de la liste d'entier est :"+list_Integer.getElementByIndex(0));
		System.out.println("L'element a la position 1 de la liste de chaine est :"+list_String.getElementByIndex(0));
		
		//Position 2
		System.out.println("L'element a la position 2 de la liste d'entier est :"+list_Integer.getElementByIndex(1));
		System.out.println("L'element a la position 2 de la liste de chaine est :"+list_String.getElementByIndex(1));
	}
	
}


