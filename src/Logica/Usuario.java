package Logica;

import java.util.ArrayList;
import java.util.List;

public class Usuario {
	
	public Usuario(String username, String password) {
		
		this.password = password;
		this.username = username;
		List<Texto> algo = new ArrayList<Texto>();
		this.textosEnPosecion = (ArrayList<Texto>) algo;
		
	}
	
	private String username;
	private String password;
	public ArrayList<Texto> textosEnPosecion;
	
	public Libro agregarLibro(String titulo, String autor) {
		
		Libro l1 = new Libro(titulo,autor);
		l1.copias = 1;
		return l1;
		
	}
	
	public Libro agregarLibro(String titulo, String autor, Inventario inventario) {
		
		Libro l1 = new Libro(titulo,autor);
		inventario.libros.add(l1);
		l1.copias = 1;
		return l1;
		
	}
	
	public Revista agregarRevista(String titulo, String autor) {
		
		Revista l1 = new Revista(titulo,autor);
		return l1;
		
	}
	
	public Revista agregarRevista(String titulo, String autor, Inventario inventario) {
		
		Revista l1 = new Revista(titulo,autor);
		inventario.revistas.add(l1);
		return l1;
		
	}
	
	public void agregarEjemplarLibro(Libro libro) {
		
		libro.copias = libro.copias + 1;
		
	}
	
	public String rentarLibro(Libro libro) {
		
		libro.copias = libro.copias-1;
		textosEnPosecion.add(libro);
		return libro.titulo;
		
	}

	public String getUsername() {
		return username;
	}

	public ArrayList<Texto> getTextosEnPosecion() {
		return textosEnPosecion;
	}
	

}
