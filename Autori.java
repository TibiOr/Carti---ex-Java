package carti;

public class Autori {
	private String nume;
	private String anNastere;
	private String nationalitate;
	private String informatii;

	public Autori(String nume, String anNastere, String nationalitate, String informatii) {
		super();
		this.nume = nume;
		this.anNastere = anNastere;
		this.nationalitate = nationalitate;
		this.informatii = informatii;
	}

	public String getNume() {
		return nume;
	}

	public void setNume(String nume) {
		this.nume = nume;
	}

	public String getAnNastere() {
		return anNastere;
	}

	public void setAnNastere(String anNastere) {
		this.anNastere = anNastere;
	}

	public String getNationalitate() {
		return nationalitate;
	}

	public void setNationalitate(String nationalitate) {
		this.nationalitate = nationalitate;
	}

	public String getInformatii() {
		return informatii;
	}

	public void setInformatii(String informatii) {
		this.informatii = informatii;
	}

}
