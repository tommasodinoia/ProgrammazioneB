package it.poliba.sisinflab.programmazioneB.eccezioni;

import java.io.*;
import java.util.Scanner;

public class FileReaderExample {

	public static void main(String args[]) throws FileNotFoundException {
		
		Scanner scanner = new Scanner(System.in);
		String nome = scanner.nextLine();

		File fileDaLeggere = new File(nome);

		// Se il nome esiste ci dà informazioni sul fileDaLeggere
		if (fileDaLeggere.exists()) {
			System.out.println(fileDaLeggere.getName()
					+ " esiste\n"
					+ "Ultima modifica: " + fileDaLeggere.lastModified()
					+ "\nDimensione: " + fileDaLeggere.length()
					+ "\nPath: " + fileDaLeggere.getAbsolutePath()
					+ "\nLivello superiore: " + fileDaLeggere.getParent());

			// Informazioni se si tratta di un fileDaLeggere
			if (fileDaLeggere.isFile()) {
					try {
						BufferedReader input = new BufferedReader(new FileReader(fileDaLeggere));
						StringBuffer buffer = new StringBuffer();
						String text;
						System.out.println("\n\n");

						while ((text = input.readLine()) != null)
							buffer.append(text + "\n");

                        System.out.println("Il contenuto del fileDaLeggere è \n\n\n");
						System.out.println(buffer.toString());
					}
					// Gestione delle eccezioni
					catch (IOException ioException) {
						System.err.println("si è verificato un errore in fase di manipolazione del fileDaLeggere");
					}

			}

			// Visualizzazione del contenuto di una directory se si tratta di
			// una directory
			else if (fileDaLeggere.isDirectory()) {

			    BufferedWriter output = null;

				String directory[] = fileDaLeggere.list();

                File fileDaScrivere = new File(nome + ".out.txt");
                try {
                    output = new BufferedWriter(new FileWriter(fileDaScrivere));
                    for (int i = 0; i < directory.length; i++)
                        output.write(directory[i] + "\n");
                }
                catch (IOException ioe) {
                    ioe.printStackTrace();
                }
                finally {
                    if (output != null)
                        try {
                            output.close();
                        } catch (IOException e) {
                            System.err.println("Errore nella chiusura del file.");
                            e.printStackTrace();
                        }
                }

			}

		}

		// Se non si tratta nè di un fileDaLeggere nè di una directory
		else {
			throw new FileNotFoundException();
		}

	}

}
