package abr;
import abr.Arbre;

public class main {

	public static void main(String[] args) {
		new Arbre(null,0,null);

		new Arbre(
				new Arbre(
						new Arbre(null, 3, null), 
						5, 
						new Arbre(
								new Arbre(
										new Arbre(null, 6, null), 
										8, 
										null),
								12, 
								new Arbre(null, 13, null))), 
				20, 
				new Arbre( 
						new Arbre(null, 21, null), 
						25, 
						new Arbre(null, 28, null)));


	}
}
