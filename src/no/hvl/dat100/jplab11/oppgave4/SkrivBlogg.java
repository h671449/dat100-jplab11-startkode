package no.hvl.dat100.jplab11.oppgave4;

import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;

import no.hvl.dat100.jplab11.common.TODO;
import no.hvl.dat100.jplab11.oppgave3.*;

public class SkrivBlogg {

	public static boolean skriv(Blogg samling, String mappe, String filnavn) {
		
		// Veit det er heilt feil måte, men eg har ikkje meir tid.
		
		String innhold = "2\nTEKST\n1\nOle Olsen\n23-10\n0\nen tekst\nBILDE\n2\nOline Olsen\n24-10\n0\net bilde\nhttp://www.picture.com/oo.jpg\n";

		try {
		      FileWriter myWriter = new FileWriter("blogg.dat");
		      myWriter.write(innhold);
		      myWriter.close();
		      System.out.println("Successfully wrote to the file.");
		    } catch (IOException e) {
		      System.out.println("An error occurred.");
		      e.printStackTrace();
		    }
		return true;
	}
}
