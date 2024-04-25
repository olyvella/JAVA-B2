package fr.voxy.appadmin;

public class Evaluation {
	
	private int numero ;
	private int note ; 
	private String commentaire ; 
	private boolean valide = true;
	
	public Evaluation( int numero, int note, String commentaire, boolean valide) {
		this.numero = numero;
		this.commentaire = commentaire;
		this.note = note;
		this.valide = valide;
	}

	public int getNumero() {
		return numero;
	}

	public void setNumero(int numero) {
		this.numero = numero;
	}

	public int getNote() {
		return note;
	}

	public void setNote(int note) {
		this.note = note;
	}

	public String getCommentaire() {
		return commentaire;
	}

	public void setCommentaire(String commentaire) {
		this.commentaire = commentaire;
	}

	public boolean isValide() {
		return valide;
	}

	public void setValide(boolean valide) {
		this.valide = valide;
	}

	@Override
	public String toString() {
		return "Evaluation [numero=" + numero + ", note=" + note + ", commentaire=" + commentaire + ", valide=" + valide
				+ "]";
	}
	
	
	
	
	
	

}
