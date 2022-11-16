package no.hvl.dat100.jplab11.oppgave3;

import no.hvl.dat100.jplab11.common.TODO;
import no.hvl.dat100.jplab11.oppgave1.*;
import no.hvl.dat100.jplab11.oppgave2.Tekst;

public class Blogg {

	// TODO: objektvariable 
	private Innlegg[] innleggtabell;
	protected int nesteledig;

	public Blogg() {
		
		innleggtabell = new Innlegg[20];
		nesteledig = 0;
	}

	public Blogg(int lengde) {
		
		innleggtabell = new Innlegg[lengde];
		nesteledig = 0;
	}

	public int getAntall() {
		
		return this.nesteledig;
	}
	
	public Innlegg[] getSamling() {
		
		return this.innleggtabell;
	}
	
	public int finnInnlegg(Innlegg innlegg) {

		int pos = -1;
		
		for (int i = 0; i < nesteledig; i++) {
				
			if (innleggtabell[i].getId() == innlegg.getId()) {
	
				pos = i;
			}
			
		}
		
		return pos;
	}

	public boolean finnes(Innlegg innlegg) {

		boolean finnes = false;
		
		for (int i = 0; i < nesteledig; i++) {
				
			if (innleggtabell[i].getId() == innlegg.getId()) {
	
				finnes = true;
			}
		}
		return finnes;
	}

	public boolean ledigPlass() {
		
		boolean erplass = false;
		
		if (nesteledig <= innleggtabell.length) {
			erplass = true;
		}
		return erplass;
	}
	
	public boolean leggTil(Innlegg innlegg) {

		boolean lagttil = false;
		boolean finnes = finnes(innlegg);
		
		if (finnes == false) {
			
			innleggtabell[nesteledig] = innlegg;
			lagttil = true;
		}
		return lagttil;
	}
	
	public String toString() {
		
		String streng = innleggtabell.length + "\n";
		
		for (int i = 0; i < nesteledig; i++) {
			
			streng = streng + Innlegg.toString(innleggtabell[i]);
		}
		//return innleggtabell.length + "\n" + "TEKST\n" + Tekst.getId() + "\n" + bruker + "\n" + dato + "\n" + likes + "\n" + tekst + "\n" + "BILDE\n" + id + "\n" + bruker + "\n" + dato + "\n" + likes + "\n" + tekst + "\n" + url + "\n"; 
	}

	// valgfrie oppgaver nedenfor
	
	public void utvid() {
		throw new UnsupportedOperationException(TODO.method());
	}
	
	public boolean leggTilUtvid(Innlegg innlegg) {

		throw new UnsupportedOperationException(TODO.method());
		
	}
	
	public boolean slett(Innlegg innlegg) {
		
		throw new UnsupportedOperationException(TODO.method());
	}
	
	public int[] search(String keyword) {
		
		throw new UnsupportedOperationException(TODO.method());

	}
}