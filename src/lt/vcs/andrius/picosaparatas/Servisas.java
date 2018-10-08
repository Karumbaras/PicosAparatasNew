package lt.vcs.andrius.picosaparatas;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

import lt.vcs.andrius.picosaparatas.picos.Pica;
import lt.vcs.andrius.picosaparatas.picos.Produktai;
import lt.vcs.andrius.picosaparatas.picos.Receptas;

public class Servisas {
	
	private List<PicosAparatas> aparatai = new ArrayList<>();
	private List<Receptas> receptai = new ArrayList<>();
	
	public Servisas() {
		receptai.add(new Receptas(new Pica("skani", new Produktai(4, 3, 6, 1, 9), 10)));
		receptai.add(new Receptas(new Pica("nelabai", new Produktai(4, 9, 13, 1, 9), 10)));
	}
	
	
	public void pridekAparata() {
		pridekAparata(new Produktai(100, 100, 100, 100, 100));
	}
	
	public void pridekAparata(Produktai produktai) {
		aparatai.add(new PicosAparatas(produktai.kopijuok(), receptai));
	}
	
	public void pridekRecepta(Receptas receptas) {
		receptai.add(receptas);
	}
	
	public void gaminkPica(String pavadinimas, int dydis) {
		
		if(aparatai.isEmpty()) {
			// TODO go away
			return;
		}
		
		int picosAparatoNumeris = new Random().nextInt(aparatai.size());
		
		Pica pica = aparatai.get(picosAparatoNumeris).gaminkPica(pavadinimas, dydis);
		
		System.out.println("Turime pica: " + pica);
	}
	
	

}
