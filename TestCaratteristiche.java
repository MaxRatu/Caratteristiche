import java.util.Scanner;
public class TestCaratteristiche {

	public static void main (String [] args) {
		
		Scanner s1 = new Scanner(System.in);
		
		Caratteristiche s2 = new Caratteristiche();
		Caratteristiche s3 = new Caratteristiche();
		
		//quale cratteristica vuoi e quale punteggio vuoi? 
	
		
		System.out.print("Inserisci la descrizione della prima persona: ");
		String descrizione1 = s1.nextLine();
		
		s2.setDescrizione(descrizione1);
		
		s2.setPunteggio();
		
		System.out.print("Inserisci la descrizione della seconda persona: ");
		String descrizione2 = s1.nextLine();
		
		s3.setDescrizione(descrizione2);
		
		s3.setPunteggio();
		
		System.out.println("Verifica compatibilità");
		
		s2.verifica_compatibilita(s3);
		
		
	}
}
