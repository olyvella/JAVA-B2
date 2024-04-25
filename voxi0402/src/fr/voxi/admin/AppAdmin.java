package fr.voxi.admin;
import java.time.LocalDate ;

public class AppAdmin {
	
	public static void main(String[] args) {
		
	Abonnement abn1 = new Abonnement (201 , LocalDate.of(2024,1,3));
	
	System.out.println( abn1 ) ; 	
	
	Abonnement abn2 = new Abonnement (202 , LocalDate.of(2024,10,1));
	System.out.println( abn2 ) ;
	
	System.out.println( abn2.getDureeAbnt()) ;
	System.out.println( abn2.getDureeAbnt()) ;
	
	abn1.setDureeAbnt(7);
	System.out.println( abn1.getDureeAbnt());
	
	
	
	
	
	
	
}
	
}
