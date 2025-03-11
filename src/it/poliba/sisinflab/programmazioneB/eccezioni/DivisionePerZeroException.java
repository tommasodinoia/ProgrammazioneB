package it.poliba.sisinflab.programmazioneB.eccezioni;
/**
 * Cattura una divisione per zero. Unchecked exception in quanto deriva 
 * da ArithmeticException che deriva da RuntimeException.
 *
 */
public class DivisionePerZeroException extends ArithmeticException {
	public DivisionePerZeroException() {
		System.err.println("Si è verificata una divisione per zero");
	}
}
