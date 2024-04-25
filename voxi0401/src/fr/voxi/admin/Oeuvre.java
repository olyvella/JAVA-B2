package fr.voxi.admin;

public class Oeuvre {
	
	private int numero ;
	private String titre ;
	private static int compteur = 0  ; 
	
	public Oeuvre(int numero, String titre, int compteur ) {
		this.numero = numero;
		this.titre = titre;
	}
	
	
	public int getNumero() {
		return numero;
	}
	public void setNumero(int numero) {
		this.numero = numero;
	}
	public String getTitre() {
		return titre;
	}
	public void setTitre(String titre) {
		this.titre = titre;
	}
	
	public int getCompteur() {
		compteur = numero ++ ; 
		return compteur;
		
	}

	@Override
	public String toString() {
		return "Oeuvre [numero=" + numero + ", titre=" + titre + "]";
	}
	
	
	

}
