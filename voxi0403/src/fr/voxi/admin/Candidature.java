package fr.voxi.admin;

import java.time.LocalDate;

public class Candidature {
	
	private int numero ; 
	private int etat ; 
	private LocalDate date ;
	
	public static final int EN_ATTENTE = 1 ;
	public static final int ETUDIEE = 2;
	public static final int ANNULEE = 3;
	public static final int ACCEPTEE = 4 ;
	public static final int REJETEE = 5;
	
	
	public Candidature(int numero, int etat, LocalDate date) {
		super();
		this.numero = numero;
		this.etat = etat;
		this.date = date;
	}
	
	public static int getEnAttente() {
		return EN_ATTENTE;
	}



	public static int getEtudiee() {
		return ETUDIEE;
	}



	public static int getAnnulee() {
		return ANNULEE;
	}



	public static int getAcceptee() {
		return ACCEPTEE;
	}



	public static int getRejetee() {
		return REJETEE;
	}
	
	public int getNumero() {
		return numero;
	}

	public void setNumero(int numero) {
		this.numero = numero;
	}

	public int getEtat() {
		return etat;
	}

	public LocalDate getDate() {
		return date;
	}

	public void setDate(LocalDate date) {
		this.date = date;
	}

	public void setEtat(int etat) {
		this.etat = etat;
	}

	@Override
	public String toString() {
		return "Candidature [numero=" + numero + ", etat=" + etat + ", date=" + date + "]";
	} 
	
	
	
	

}
