package Logica;

public class Revista extends Texto{

	public Revista(String titulo, String autor) {
		super(titulo, autor);
		// TODO Auto-generated constructor stub
	}
	
	public String getTitulo() {
		return titulo;
	}

	public String getAutor() {
		return autor;
	}

	public boolean isEnInventario() {
		return enInventario;
	}

}
