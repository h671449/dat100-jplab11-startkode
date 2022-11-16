package no.hvl.dat100.jplab11.oppgave2;

import no.hvl.dat100.jplab11.common.TODO;
import no.hvl.dat100.jplab11.oppgave1.*;

public class Tekst extends Innlegg {

	// TODO: objektvariable
	private int id;
	private int likes;
	private String bruker;
	private String dato;
	private String tekst;
	
	public Tekst () {
		
	}
	
	public Tekst(int id, String bruker, String dato, String tekst) {
		
		this.id = id;
		this.bruker = bruker;
		this.dato = dato;
		likes = 0;
		this.tekst = tekst;
	}
	
	public Tekst(int id, String bruker, String dato, int likes, String tekst) {
		
		this.id = id;
		this.bruker = bruker;
		this.dato = dato;
		this.likes = likes;
		this.tekst = tekst;
	}
	
	public String getBruker() {
		
		return bruker;

	}

	public void setBruker(String bruker) {
		
		this.bruker = bruker;
	}

	public String getDato() {

		return dato;
		
	}

	public void setDato(String dato) {
		
		this.dato = dato;
	}

	public int getId() {
		
		return id;

	}

	public int getLikes() {
		
		return likes;
	}
	
	public String getTekst() {

		return tekst;

	}

	public void setTekst(String tekst) {
		
		this.tekst = tekst;
	}

	@Override
	public String toString() {
		
		return "TEKST\n" + id + "\n" + bruker + "\n" + dato + "\n" + likes + "\n" + tekst + "\n";

	}
	
	// Metoden nedenfor er kun for valgfri oppgave 6
	public String toHTML() {
			
		throw new UnsupportedOperationException(TODO.method());
				
	}
}
