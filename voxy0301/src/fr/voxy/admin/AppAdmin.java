package fr.voxy.admin;

public class AppAdmin {

	public static void main(String[] args) {
		
		Lecteur lecteur1 = new Lecteur( 101,"SANTERRE","Jean",20 ) ;
	
		System.out.println( lecteur1) ; 
		System.out.println( lecteur1.getNom() ) ; 
		
		Lecteur lecteur2 = new Lecteur( 102, "NONATO","Isabella", 0) ; 
		
		System.out.println(lecteur2) ; 
		System.out.println( lecteur2.getNom() );
		
		lecteur2.setNom("SANTERRE");
		System.out.println( lecteur1.estActif());
		System.out.println( lecteur2.estActif());
		
		System.out.println( " Nombre d'audiobooks produit par le lecteur n° " + lecteur1.getNumero() + " " + "" + " : " + lecteur1.getNbAbook() );
		lecteur1.produireUnAudioBook();
		System.out.println( " Nombre d'audiobooks produit par le lecteur n° " + lecteur1.getNumero() + " : " + lecteur1.getNbAbook());
		
		
		
		
		
			

		
		
		
		
		

		
		
		
		
		
		
		

	}

}
