package lt.vcs.andrius.picosaparatas;

import java.util.ArrayList;
import java.util.List;

import lt.vcs.andrius.picosaparatas.picos.Pica;
import lt.vcs.andrius.picosaparatas.picos.Produktai;
import lt.vcs.andrius.picosaparatas.picos.Receptas;

public class PicosAparatas {
	
	public final static int MAX_PIZZA_SIZE = 30;
	
	private int panaudojimuSkaicius;
	
	private Produktai likutis;
	
	private List<Receptas> receptai;
	
	
	public PicosAparatas(Produktai likutis, List<Receptas> receptai) {
		this.likutis = likutis;
		this.receptai = receptai;
	}
	
	public PicosAparatas(List<Receptas> receptai) {
		this(new Produktai(0, 0, 0, 0, 0), receptai);
	}




	public Pica gaminkPica(String pavadinimas, int dydis) {
		
		for(Receptas receptas : receptai) {
			if(receptas.gaukReceptoPavadinima().equals(pavadinimas)) 
				return gaminkPica(receptas, dydis);
		}
		
		return null;
		
	}
	
	
	private Pica gaminkPica(Receptas receptas, int dydis) {
		
		Pica kepimui = receptas.gaukPicaKepimui(dydis);
		
		// TODO make check if can consume products
		if(true) {
			likutis.atimkProduktus(kepimui.getProduktai());
			panaudojimuSkaicius++;
		} else {
			// TODO throw exception?
		}
		
		return kepimui;
	}
	
	public List<Pica> gaukPasiulymus(){
		// TODO implement pizza suggestions to calculate pizza sizes
		List<Pica> list = new ArrayList<>();
		list.add(new Pica("", null, 0));
		return list;
	}
	
	
	

}
