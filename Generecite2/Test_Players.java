package fr.Generecite2;

public class Test_Players {

	public static void main(String[] args) {
		
		Player1 p1=new Player1("KAMADO",12,6);
		Player2 p2=new Player2("KUKO",16,4);
		Player3 p3=new Player3("GUEUS",23,2);
		
		Box<Player1> box_p1=new Box(p1);
		Box<Player2> box_p2=new Box(p2);
		Box<Player3> box_p3=new Box(p3);
		
		System.out.println("\n--------Nom--------");
		
		System.out.println("JOUEUR 1 :"+box_p1.getElements().getNamePlayer());
		System.out.println("JOUEUR 2 :"+box_p2.getElements().getNamePlayer());
		System.out.println("JOUEUR 3 :"+box_p3.getElements().getNamePlayer());
		
		System.out.println("\n--------Age--------");
		
		System.out.println("JOUEUR 1 :"+box_p1.getElements().getOldPlayer()+" ans");
		System.out.println("JOUEUR 2 :"+box_p2.getElements().getOldPlayer()+" ans");
		System.out.println("JOUEUR 3 :"+box_p3.getElements().getOldPlayer()+" ans");
		
		System.out.println("\n--------Niveau--------");
		
		System.out.println("JOUEUR 1 :"+box_p1.getElements().getLevelPlayer());
		System.out.println("JOUEUR 2 :"+box_p2.getElements().getLevelPlayer());
		System.out.println("JOUEUR 3 :"+box_p3.getElements().getLevelPlayer());
	}

}
