package it.poliba.sisinflab.programmazioneB.generics;


public class Coppia <P,S>{
	private P primo;
	private S secondo;
	
	public Coppia(P primoElemento, S secondoElemento){
		this.primo = primoElemento;
		this.secondo = secondoElemento;
	}
	
	public P getPrimo(){
		return primo; 
	}
	
	public S getSecondo(){
		return secondo;
	}
}
