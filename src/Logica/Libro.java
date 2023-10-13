package Logica;

public class Libro extends Texto{

	public Libro(String titulo, String autor) {
		super(titulo, autor);
		// TODO Auto-generated constructor stub
	}
	
	protected int copias;
	
	public String getTitulo() {
		return titulo;
	}

	public String getAutor() {
		return autor;
	}

	public boolean isEnInventario() {
		return enInventario;
	}
	
	public int getCopias() {
		return copias;
	}

}
