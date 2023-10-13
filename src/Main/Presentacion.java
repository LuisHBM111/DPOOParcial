package Main;

import Logica.Libro;
import Logica.Revista;
import Logica.Usuario;
import Logica.Texto;

public class Presentacion {

	public static void main(String[] args) {
		
		Usuario u1 = new Usuario("Luis","123");
		
		//Agregar Libro
		Libro ejemplo1 = u1.agregarLibro("1984", "Orwell");
		System.out.println("Agregaste el libro "+ ejemplo1.getTitulo()+ " del autor " + ejemplo1.getAutor()+ " y hay estas copias " + ejemplo1.getCopias());
		//Agregar revista
		Revista ejemplo2 = u1.agregarRevista("Hola mundo", "Semana");
		System.out.println("Agregaste el libro "+ ejemplo2.getTitulo()+ " del autor " + ejemplo2.getAutor()+ " y si esta disponible " + ejemplo2.isEnInventario());
		//Agregar ejemplar libro
		System.out.println("Las copias eran: "+ ejemplo1.getCopias());
		u1.agregarEjemplarLibro(ejemplo1);
		System.out.println("Las ahora copias son: "+ ejemplo1.getCopias());
		//Polimorfismo
		Texto ejemplo3 = new Libro("HOLA","A");
		Texto ejemplo4 = new Revista("ASD","B");
		System.out.println("Se creo el libro: "+ ejemplo3.getTitulo());
		System.out.println("Se creo la revista: "+ ejemplo4.getTitulo());
		//Rentar
		String ejemplo5 = u1.rentarLibro(ejemplo1);
		System.out.println("El usuario "+ u1.getUsername()+" rento el libro "+ ejemplo5);
		//ver libros de un usuario
		for(Texto cosas:u1.getTextosEnPosecion()) {
			System.out.println(cosas.getTitulo());
		}
	}

}
