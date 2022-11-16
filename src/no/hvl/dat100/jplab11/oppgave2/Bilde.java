package no.hvl.dat100.jplab11.oppgave2;

import no.hvl.dat100.jplab11.common.TODO;

public class Bilde extends Tekst {

	// TODO - objekt variable
	private int id;
	private int likes;
	private String bruker;
	private String dato;
	private String tekst;
	private String url;
	
	public Bilde(int id, String bruker, String dato, String tekst, String url) {
		
		this.id = id;
		this.bruker = bruker;
		this.dato = dato;
		likes = 0;
		this.tekst = tekst;
		this.url = url;
	}

	public Bilde(int id, String bruker, String dato, int likes, String tekst, String url) {
		
		this.id = id;
		this.bruker = bruker;
		this.dato = dato;
		this.likes = likes;
		this.tekst = tekst;
		this.url = url;
	}
	
	public String getUrl() {
		
		return url;

	}

	public void setUrl(String url) {
		
		this.url = url;
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
		
		return "BILDE\n" + id + "\n" + bruker + "\n" + dato + "\n" + likes + "\n" + tekst + "\n" + url + "\n";

	}

	// Metoden nedenfor er kun for valgfri oppgave 6
	public String toHTML() {
		
		throw new UnsupportedOperationException(TODO.method());
				
	}
}
