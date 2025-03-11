package it.poliba.sisinflab.programmazioneB.eccezioni;
/**
 * Cattura un logaritmo calcolato su zero- Checked Exception in quanto deriva da Exception
 * @author tommmaso
 *
 */
public class LogaritmoNonDefinitoException extends Exception {
	public LogaritmoNonDefinitoException(){
		System.err.println("Il logaritmo vale -infinito per x = 0");
	}
}
