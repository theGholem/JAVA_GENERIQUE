package fr.Exo2;

import java.util.ArrayList;
import java.util.List;


/*--------------------------------------START CLASS MYDICTIONNARY----------------------------------------*/
/**
 * 
 * @apiNote cette classe generique permet de creer une liste de paire cle-valeur
 * 			Notre dictionnaire est une liste de pair cle-valeur
 * @author Konan
 *
 */
public class MyDictionnary<K, V> {
	
	//Attribut
	
	private List<Pair<K, V>> entries; //on va instancier notre objet dans le constructor
	
	//Constructor
	public MyDictionnary() {
		entries=new ArrayList<Pair<K, V>>(); //Notre 'entries' est donc une pair cle-valeur de type ArrayList
	}
	
	/**
	 * 
	 * cette methode permet d'ajouter une pair cle-valeur à notre objet liste
	 * 
	 * @param key
	 * @param value
	 */
	public void addElement(K key, V value) {
		Pair<K, V>ourPair=new Pair<K, V>(key, value);
		entries.add(ourPair);
	}
	
	
	/**
	 * 
	 * cette methode permet de supprimer une valeur associé a la clé que le user saisi
	 * 
	 * @param key
	 */
	public void removeElement(K key) {
		
		//Initialisation de la variable qui va contenir notre Pair à retirer. (ici une string-->null)
		Pair<K, V> pairToRemove=null;
		
		for(Pair<K, V> pair : entries) {
			//Si la clé de la position ou on se trouve est egale à celle entré par le user, alors notre variable recois cette pair a remove
			if(pair.getKey().equals(key)) {
				pairToRemove=pair;
				break; //on cesse de parcourir la boucle autommatiquement
			}
		}
		
		if(pairToRemove !=null) 
			entries.remove(pairToRemove); //si pairToRemove est different de null, alors on la supprime effectivement
		                                  //sinon ca signifie que la clé saisi est hors de porté
			
	}
	
	
	/**
	 * 
	 * @return la taille de notre dictionnaire
	 */
	public int entriesSize() {
		 return entries.size();
	 }
	
	
	/**
	 * 
	 * 
	 * @param key
	 * @return la valeur associé à la clé saisi par le user
	 */
	public V getValueByKey(K key) {
		
		for(Pair<K, V> pair : entries) {
			//Ici on compare les clés, et si elle sont identique on affiche la valeur correspondante à la clé
			if(pair.getKey().equals(key))
				return pair.getValue();
		}
		return null; //Dans le cas ou la clé n'est pas reconnu dans le dictionnaire
	}
	
	/*--------------------------------------START CLASS PAIR----------------------------------------*/
   
	/**
	 * 
	 * @apiNote cette classe generique permet de decrire une paire cle-valeur.
	 * 
	 * @author Konan
	 *
	 */
	private class Pair<K, V> {
		
		private K key;
		/**
		 * 
		 * @return la clé saisi par le user
		 */
		public K getKey() {
			return this.key;
		}
		
		private V value;
		/**
		 * 
		 * @return la valeur saisi par le user
		 */
		public V getValue() {
			return this.value;
		}
		
		/**
		 * constructor
		 * 
		 * @param key
		 * @param value
		 */
		public Pair(K key, V value) {
			this.key=key;
			this.value=value;
		}
	}
	
	/*--------------------------------------END CLASS PAIR----------------------------------------*/
	
	
	
	/*--------------------------------------START CLASS MAIN----------------------------------------*/
    
	public static void main(String[]args) {
		
		MyDictionnary<String, Integer> dico=new MyDictionnary<String, Integer>(); //Instantiation de notre objet dictionnaire
		
		//Ajout de paire cle-valeur a notre dictionnanire de pair
		dico.addElement("cle1", 23);
		dico.addElement("cle2", 43);
		dico.addElement("cle3", 63);
		dico.addElement("cle4", 83);
		dico.addElement("cle5", 103);
		
		//Obtention de la taille de notre dictionnaire
		System.out.println("\nLa taille du dictionnaire est :"+dico.entriesSize());
		
		//Obtention de la valeur associé à la clé saisi par un user (dans notre cas on vas texter une de nos clé
		String keyToLookup="cle4";
		Integer valueKey=dico.getValueByKey(keyToLookup);
		if(valueKey !=null) {
			System.out.println("La valeur correspondante à la clé '"+keyToLookup+"' est :"+valueKey);
		}else {
			System.out.println("La clé " + keyToLookup + " n'existe pas dans le dictionnaire.");
		}
		
		//Suppression d'une paire clé-valeur en fonction de la clé saisie par le user
		String keyToRemove="cle1";
		dico.removeElement(keyToRemove);
		
		//Nouvelle taille du tableau apres modification
		System.out.println("\nla taille finale de notre tableau est de :"+dico.entriesSize());
		
	}
}

/*--------------------------------------END CLASS MYDICTIONNARY----------------------------------------*/