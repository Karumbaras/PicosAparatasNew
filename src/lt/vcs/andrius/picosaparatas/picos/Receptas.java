package lt.vcs.andrius.picosaparatas.picos;

public class Receptas {
	
	private Pica pica = null;
	
	public Receptas(Pica pica) {
		super();
		this.pica = pica;
	}
	
	public String gaukReceptoPavadinima() {
		return pica.getPavadinimas();
	}

	public Pica gaukPicaKepimui(int dydis) {
		return new Pica(pica.getPavadinimas(), pica.getProduktai().kopijuok(pica.getDydis(), dydis), dydis);
	}

}
