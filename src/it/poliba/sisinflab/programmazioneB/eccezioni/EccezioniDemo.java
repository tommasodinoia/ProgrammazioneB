package it.poliba.sisinflab.programmazioneB.eccezioni;

public class EccezioniDemo {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		int a = (int)Math.round(Math.random());
		int b = (int)Math.round(Math.random());
		System.out.println("a : " + a);
		System.out.println("b : " + b);
		//System.out.println("Risultato della divisione: " + Operazioni.divisione(a,b));
		try{
			System.out.println("Risultato della divisione: " + Operazioni.divisione(a,b));
			System.out.println("Risultato del logaritmo: " + Operazioni.logaritmo(a));
			System.out.println("Vengo visualizzato solo se non si verifica alcuna eccezione");
		}
		catch(ArithmeticException ae){
			System.err.println("Il denominatore della divisione è pari a 0 \n\n");

            ae.printStackTrace();
        }
		catch(LogaritmoNonDefinitoException lnd){
			System.err.println("Si è cercato di calcolare il logaritmo di zero \n\n");

            // getStackTrace
            StackTraceElement[] traceElements = lnd.getStackTrace();

            System.out.println(  "\nStack trace ottenuto da getStackTrace:" );
            System.out.println();
            System.out.println( "Classe\t\t\t\t\t\t\t\t\t\t\t  File\t\t\t  Linea\t  Metodo" );

            for ( int i = 0; i < traceElements.length; i++ ) {
                StackTraceElement currentElement = traceElements[ i ];
                System.out.print( currentElement.getClassName() + "\t| " );
                System.out.print( currentElement.getFileName() + "\t| " );
                System.out.print( currentElement.getLineNumber() + "\t| " );
                System.out.print( currentElement.getMethodName() + "\n" );
            }
		}
		finally{
			System.out.println("\n\n\nQualunque cosa accada vengo visualizzato");
		}
	}
}
