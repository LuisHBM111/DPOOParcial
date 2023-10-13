package Logica;

public abstract class Texto {
	
	private static int Id = 0;

	public Texto(String titulo, String autor) {
		
		this.titulo = titulo;
		this.autor = autor;
		this.id = getNextID();
		this.enInventario = true;
		
	}
	
	protected int id;
	protected String titulo;
	protected String autor;
	protected boolean enInventario;
	
	public static int getNextID() {
	    int id = Id;  
	    ++Id;
	    ++id; 
	    return id;
	}

	public abstract String getTitulo();

	public abstract String getAutor();

	public abstract boolean isEnInventario();

}
