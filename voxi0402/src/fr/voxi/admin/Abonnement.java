package fr.voxi.admin;
import java.time.LocalDate ; 

public class Abonnement {
	
	private int numero ; 
	private LocalDate dateSouscription ; 
	private static int dureeAbnt = 5 ; 
	
	public Abonnement (int numero, LocalDate dateSouscription) {
		
		this.numero = numero ; 
		this.dateSouscription = dateSouscription ; 
			
	}

	public int getNumero() {
		return numero;
	}

	public void setNumero(int numero) {
		this.numero = numero;
	}

	public LocalDate getDateSouscription() {
		return dateSouscription;
	}

	public void setDateSouscription(LocalDate dateSouscription) {
		this.dateSouscription = dateSouscription;
	}

	public static int getDureeAbnt() {
		return dureeAbnt;
	}

	public static void setDureeAbnt(int dureeAbnt) {
		Abonnement.dureeAbnt = dureeAbnt;
	}

	@Override
	public String toString() {
		return "Abonnement [numero=" + numero + ", dateSouscription=" + dateSouscription + "]";
	}

	
	
}
