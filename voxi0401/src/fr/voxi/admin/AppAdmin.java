package fr.voxi.admin;

public class AppAdmin {
	
	public static void main(String[] args) {
		
		Oeuvre oeuvre103 = new Oeuvre( 103 , "Le Crépuscule et l'Aube ", 0 );
		
		System.out.println( oeuvre103) ; 
		System.out.println( oeuvre103.getNumero() ) ; 
		
		System.out.println( oeuvre103.getTitre() ) ; 
		
		Oeuvre oeuvre302 = new Oeuvre( 302 , "Nature Humaine" , 0) ; 
		
		System.out.println( oeuvre302 );
		System.out.println( oeuvre302.getCompteur());
		
		Oeuvre oeuvre318 = new Oeuvre( 318 , "L'Anomalie " , 0 ) ;
		
		System.out.println( oeuvre318 ) ; 
		System.out.println(oeuvre103.getCompteur()); 
	}

}
