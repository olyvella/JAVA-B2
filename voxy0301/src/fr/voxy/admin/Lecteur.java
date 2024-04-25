package fr.voxy.admin;

public class Lecteur {
	
	private int numero ;
	private String nom ; 
	private String prenom ; 
	private int nbAbook = 0 ;
	
	public Lecteur(int numero, String nom, String prenom, int nbAbook) {
		this.numero = numero;
		this.nom = nom;
		this.prenom = prenom;
		this.nbAbook = nbAbook;
	}

	public int getNumero() {
		return numero;
	}
	
	public void setNumero(int numero) {
		this.numero = numero;
	}
	
	public String getNom() {
		return nom;
	}
	
	public void setNom(String nom) {
		this.nom = nom;
	}
	
	public String getPrenom() {
		return prenom;
	}
	
	public void setPrenom(String prenom) {
		this.prenom = prenom;
	}
	
	public int getNbAbook() {
		return nbAbook;
	}
	
	public void setNbAbook(int nbAbook) {
		this.nbAbook = nbAbook ;
	}
	
	public String estActif() {
		if( nbAbook >= 10 ) {
			return "le lecteur est actif"; 
		}
		else {
			return "le lecteur est passif" ; 
			
		}
	}
	
	public void produireUnAudioBook() {
		this.nbAbook = nbAbook + 1;
	}
	
	

	@Override
	public String toString() {
		return "Lecteur [numero=" + numero + ", nom=" + nom + ", prenom=" + prenom + ", nbAbook=" + nbAbook + "]";
	} 
	
	
	
	

	
	
	
	
	

}
