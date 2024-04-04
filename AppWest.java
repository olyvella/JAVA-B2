public class AppWest {
	public static void main( String [] args ){
		Personnage heros = new Personnage( "Jo" , true , 2 ) ;
		System.out.println( heros.getNom() ) ;
		heros.seReposer() ;
		System.out.println( heros.getFatigue() ) ;
	}
}


