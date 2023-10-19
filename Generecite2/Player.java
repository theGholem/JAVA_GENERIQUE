package fr.Generecite2;

/**
 * 
 * @apiNote cette classe represente un joueur. Un joueur est caracterisé par son nom,
 *          son age et son niveau
 * 
 * @author Konan
 *
 */
public class Player {

	protected String namePlayer;
	/**
	 * 
	 * @return nameOfPlayer
	 */
	public String getNamePlayer() {
		return this.namePlayer;
	}
	
	protected int oldPlayer;
	/**
	 * 
	 * @return oldOfPlayer
	 */
	public int getOldPlayer(){
		return this.oldPlayer;
	}
	
	protected int levelPlayer;
	/**
	 * 
	 * @return levelOfPlayer
	 */
	public int getLevelPlayer() {
		return this.levelPlayer;
	}
	
	/**
	 * constructor
	 * 
	 * @param n
	 * @param o
	 * @param l
	 */
	public Player(String n, int o, int l) {
		this.namePlayer=n;
		this.oldPlayer=o;
		this.levelPlayer=l;
	}
	
	
}
