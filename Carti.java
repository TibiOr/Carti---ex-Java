package carti;

public class Carti {
	private String titlu;
	private String anAparitie;
	private String autor;
	private String informatii;

	public Carti(String titlu, String anAparitie, String autor, String informatii) {
		super();
		this.titlu = titlu;
		this.anAparitie = anAparitie;
		this.autor = autor;
		this.informatii = informatii;
	}

	public String getTitlu() {
		return titlu;
	}

	public void setTitlu(String titlu) {
		this.titlu = titlu;
	}

	public String getAnAparitie() {
		return anAparitie;
	}

	public void setAnAparitie(String anAparitie) {
		this.anAparitie = anAparitie;
	}

	public String getAutor() {
		return autor;
	}

	public void setAutor(String autor) {
		this.autor = autor;
	}

	public String getInformatii() {
		return informatii;
	}

	public void setInformatii(String informatii) {
		this.informatii = informatii;
	}

}
