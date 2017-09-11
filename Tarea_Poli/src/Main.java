
public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Monster a1, b1, c1;
	       
	       a1 = new FireMonster  ("Charmander","Lanzallamas"); //toma su form de FireMonster - polimorfimos
	       System.out.println(a1.toString());
	       
	       
	       b1 = new WaterMonster ("Squirtle","Hidrobomba"); //toma su forma de WaterMonster - polimorfismos 
	       System.out.println(b1.toString());
	       
	       c1 = new StoneMonster ("Bulbasaur","Rayo Solar"); // toma su forma de StoneMonster - polimorfismo 
	       System.out.println(c1.toString());

	}

}
