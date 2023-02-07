/*
 * Attributi 
 * 
 * Descrizione, stringa che identifica le cartteristiche
 * Punteggio un intero da 1 a 10 che indica quanto una perosa cerca quella caratteristica in un altra persona
 * 
 * Si scriva un costruttore che assegni una stringa alla descrizione e che assegni il valore 0 al punteggio per indicare che questo non è ancora stato assegnato
 * Si scriva il metodo privato valido(Punteggio) che restituica vero se il puteggio dato è valido e cioè se è compreso da 1 e 10
 * Si scriva il metodo setPunteggio(Punteggio) che assegna il punteggio dato se questo è valido.
 * Si scriva il metodo setPunteggio() che legge il punteggio inserito da tastiera continuando a richiederlo se il punteggio inserito non è valido
 * Si scriva una classe test carateristiche per collaudare la classe caratteristiche
 */

import java.util.Scanner;
public class Caratteristiche {

	private String descrizione;
	private int punteggio;
	
	public Caratteristiche () {
		
		this.descrizione = null;
		this.punteggio = 0;
	}

	public String getDescrizione() {
		return descrizione;
	}

	public int getPunteggio() {
		return punteggio;
	}

	public void setDescrizione(String descrizione) {
		this.descrizione = descrizione;
	}
	
	/*
	 * ==============================================================================================00
	 */
	
	private boolean valido(int punteggio) {
		
		boolean check;
		
		if (punteggio <= 10 && punteggio >= 1) {
			check = true;
		}
		else {
			check = false;
		}
		
		return check;
	}
	

	public void setPunteggio(int punteggio) {
		
		if (valido(punteggio)) {
			this.punteggio = punteggio;
		}
		else {
			
			System.out.println("Reinserire il punteggio. Si ricoda che deve essere compreso tra 1 e 10.");
			
			System.out.println(" ");
			
			setPunteggio();
		}
		
	}
	
	public void setPunteggio() {
		
		Scanner s1 = new Scanner(System.in);
		
		System.out.print("Inserisci il punteggio: ");
		int val = s1.nextInt();
		
		System.out.println(" ");
		
		setPunteggio(val);
	}
	
	public void verifica_compatibilita(Caratteristiche c) {
		
		if (descrizione.equals(c.getDescrizione())) {
			if (punteggio - c.getPunteggio() >= 0 && punteggio - c.getPunteggio() <= 2 || c.getPunteggio() - punteggio >= 0 && c.getPunteggio() - punteggio <= 2) { 
				System.out.println("Le persone inserite sono compatibili.");
			}
			else {
				System.out.println("Le persone inserite non sono compatibili.");
			}
		}
		else {
			System.out.println("Le persone inserite non sono compatibili.");
		}
	}
	
}
