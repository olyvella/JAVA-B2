package fr.voxy.appadmin;

public class AppAdmin {

	public static void main(String[] args) {
		
		Evaluation eval1 = new Evaluation( 1, 23 , "J'aime", true ) ;
		
		System.out.println( eval1) ; 	
		System.out.println("Un lecteur vient d'indiquer qu'il aime l'évaluation" + " " + "numero" + " " + eval1.getNumero() ) ;
		System.out.println("Nombre de J'aime de l'évaluation numero " + " " + eval1.getNumero() + " : " + eval1.getNote() );	

		Evaluation eval2 = eval1 ;
		
		System.out.println( eval2.toString()) ;
		System.out.println( eval1.toString()) ;
		
		System.out.println("Un lecteur vient d'indiquer qu'il aime l'évaluation" + " " + "numero" + " " + 2 ) ;
		
		System.out.println( "Evaluation n° " + 2 + ":"+ " " + eval2 ) ;
		System.out.println( "Evaluation n° " + 1 + ":"+ " " + eval1 ) ;
		
		System.out.println( "Réf. Éval. n° 1 : " + eval1.hashCode() ) ;
		System.out.println( "Réf. Éval. n° 2 : " + eval2.hashCode() ) ;
		

		
		
		
		
		
		
		
		
		
		
			

		
		
		
		
		

		
		
		
		
		
		
		

	}

}
