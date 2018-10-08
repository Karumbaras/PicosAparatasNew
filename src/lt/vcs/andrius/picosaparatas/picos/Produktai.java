package lt.vcs.andrius.picosaparatas.picos;

public class Produktai {
	private int suris;
	private int padas;
	private int padazas;
	private int desra;
	private int pomidoras;

	public Produktai(int suris, int padas, int padazas, int desra, int pomidoras) {
		super();
		this.suris = suris;
		this.padas = padas;
		this.padazas = padazas;
		this.desra = desra;
		this.pomidoras = pomidoras;
	}

	public void atimkProduktus(Produktai produktai) {
		this.suris = -produktai.suris;
		this.padas = -produktai.padas;
		this.padazas = -produktai.padazas;
		this.desra = -produktai.desra;
		this.pomidoras = -produktai.pomidoras;
	}

	public void pridekProduktus(Produktai produktai) {
		
		this.suris = +produktai.suris;
		this.padas = +produktai.padas;
		this.padazas = +produktai.padazas;
		this.desra = +produktai.desra;
		this.pomidoras = +produktai.pomidoras;
	}
	
	public Produktai kopijuok() {
		return new Produktai(suris, padas, padazas, desra, pomidoras);
	}
	
	public Produktai kopijuok(int dydis1, int dydis2) {
		double koeficientas = ((double) dydis2) / dydis1;
		return new Produktai(perskaiciuokProdukta(suris, koeficientas), perskaiciuokProdukta(padas, koeficientas), perskaiciuokProdukta(padazas, koeficientas), perskaiciuokProdukta(desra, koeficientas), perskaiciuokProdukta(pomidoras, koeficientas));
	}

	public int getSuris() {
		return suris;
	}

	public void setSuris(int suris) {
		this.suris = suris;
	}

	public int getPadas() {
		return padas;
	}

	public void setPadas(int padas) {
		this.padas = padas;
	}

	public int getPadazas() {
		return padazas;
	}

	public void setPadazas(int padazas) {
		this.padazas = padazas;
	}

	public int getDesra() {
		return desra;
	}

	public void setDesra(int desra) {
		this.desra = desra;
	}

	public int getPomidoras() {
		return pomidoras;
	}

	public void setPomidoras(int pomidoras) {
		this.pomidoras = pomidoras;
	}
	
	private int perskaiciuokProdukta(int produktoVerte, double koeficientas) {
		return (int) Math.ceil(produktoVerte * koeficientas);
	}

	@Override
	public String toString() {
		return "Produktai [suris=" + suris + ", padas=" + padas + ", padazas=" + padazas + ", desra=" + desra
				+ ", pomidoras=" + pomidoras + "]";
	}
	
	

}
