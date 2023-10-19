package fr.Generecite;

public class Main {

	public static void main(String[] args) {
		
		//Creation et initialisation de nos objets vegetable et fruit
		Vegetable vg=new Vegetable("OIGNON","VIOLET");
		Fruit ft=new Fruit("KIWI","VERT");
		
		//Ajout de chque objet dans notre panier et instantiation de notre panier
		Basket<Vegetable> bskOf_V=new Basket(vg);
		Basket<Fruit> bsk0f_F=new Basket(ft);
		
		//Affichage via nos methode
		System.out.println("\n--------------Info legume :----------------");
		bskOf_V.getItem().displayVegetable();
		
		System.out.println("\n--------------Info fruit :------------------");
		System.out.println("Nom : "+bsk0f_F.getItem().getName());
		bsk0f_F.getItem().displayFruit();
		
		
	}

}
