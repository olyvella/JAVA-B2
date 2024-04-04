public class Personnage {
	
	private String nom = "Mon nom est personne" ;
	private boolean affame = false ;
	private int fatigue = 0 ;
	
	public Personnage( String nom , boolean affame , int fatigue ){
		this.nom = nom ;
		this.affame = affame ;
		this.fatigue = fatigue ;
	}

	public Personnage( String nom ){
		this.nom = nom ;
	}

	public Personnage(){
	}

	public String getNom(){
		return nom;
	}

	public void setNom( String nom ){
		this.nom = nom;
	}

	public boolean isAffame(){
		return affame;
	}

	public void setAffame( boolean affame ){
		this.affame = affame;
	}

	public int getFatigue(){
		return fatigue ;
	}

	public void setFatigue( int fatigue ){
		this.fatigue = fatigue;
	}
	
	public boolean estEnPleineForme(){
		if( fatigue == 0 ){
			return true ;
		}
		else {
			return false ;
		}
	}
	
	public void seDeplacer( int nbKm ){
		if( nbKm > 3 && fatigue < 10 ){
			fatigue = fatigue + 1 ;
		}
	}
	
	public void seReposer(){
		fatigue = 0 ;
	}
	
	public void parler( String message ){
		System.out.println( nom + " dit : " + message ) ;
	}

	public void parler( String message , boolean enCriant ){
		if( enCriant == false ){
			System.out.println( nom + " dit : " + message ) ;
		}
		else {
			System.out.println( nom + " dit : " + message.toUpperCase() ) ;
		}
	}
	
	public String toString(){
		return "Personnage[" + nom + "," + affame + "," + fatigue + "]" ;
	}

}
