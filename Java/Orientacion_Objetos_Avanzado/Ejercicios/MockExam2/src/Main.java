package MockExam2;

public class Main {

	public static void main(String[] args) throws MemoryStorageException, PublicacionesException {
		System.out.println("Las valoraciones son: ");
		System.out.println(Valoraciones.MUYBUENA.getValoracion());
		Publicacion p = new Recomendacion("El Doble Elefante Telépata De Guerra es un elefante que concede deseos pedidos a Aquandrius por Finn en \"El Límite\". ",new Usuario("Chapero","Fran"),4);
		p.valorar("Muy buena");
		System.out.println(p);
		Usuario u = new Usuario("Chapero","Fran");
		Publicacion p1 = new Tweet("Frio y Calor",u);
		p1.valorar("MUYBUENA");
		System.out.println(p1.getValoracion());
		MemoryStorage m = new MemoryStorage();
		m.addUsuario("Chapero", "Fran");
		m.addPublicaion("Frio y Calor", "Fran");
		System.out.println(m.mostrarTweets());
		System.out.println(m.mostrarPosts());
		
	}

}