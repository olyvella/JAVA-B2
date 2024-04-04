package fr.voxi.admin;

public class AppAdmin {

	public static void main(String[] args) {
		
		Lecteur lecteur1 = new Lecteur( 101,"SANTERRE","Jean",20 ) ;
	
		System.out.println( lecteur1) ; 
		System.out.println( lecteur1.getNom() ) ; 
		
		Lecteur lecteur2 = new Lecteur( 102, "NONATO","Isabella", 0) ; 
		
		System.out.println(lecteur2) ; 
		System.out.println( lecteur2.getNom() );
		
		lecteur2.setNom("SANTERRE");
		System.out.println( lecteur2.getNom() );
		
		if (lecteur1.estActif() == true )
			System.out.println("Lecteur est Actif");
			else 
				System.out.println("Lecteur est Passif");
		
		if (lecteur2.estActif() == true )
			System.out.println("Lecteur est Actif");
			else 
				System.out.println("Lecteur est Passif");
		
		
			

		
		
		
		
		

		
		
		
		
		
		
		

	}

}
