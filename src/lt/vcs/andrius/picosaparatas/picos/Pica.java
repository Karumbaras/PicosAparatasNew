package lt.vcs.andrius.picosaparatas.picos;

public class Pica {
	private String pavadinimas;
	private Produktai produktai;
	private int dydis;

	public Pica(String pavadinimas, Produktai produktai, int dydis) {
		super();
		this.pavadinimas = pavadinimas;
		this.produktai = produktai;
		this.dydis = dydis;
	}

	public String getPavadinimas() {
		return pavadinimas;
	}

	public Produktai getProduktai() {
		return produktai;
	}

	public int getDydis() {
		return dydis;
	}

	@Override
	public String toString() {
		return "Pica [pavadinimas=" + pavadinimas + ", dydis=" + dydis + ", produktai=" + produktai.toString() + "]";
	}

}
