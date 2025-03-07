package biblioteca;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;
import java.util.List;

/**
 * Pruebas unitarias para la clase Biblioteca.
 */
class BibliotecaTest {

    @Test
    void testBuscarLibrosPorAutor() {
        // Crear una biblioteca con algunos libros
        Biblioteca biblioteca = new Biblioteca();
        biblioteca.agregarLibro(new Libro("1984", "George Orwell", 1949));
        biblioteca.agregarLibro(new Libro("Rebelión en la granja", "George Orwell", 1945));
        biblioteca.agregarLibro(new Libro("El extranjero", "Albert Camus", 1942));
        biblioteca.agregarLibro(new Libro("Crimen y castigo", "Fiódor Dostoievski", 1866));

        // Buscar libros de George Orwell (debería encontrar 2)
        List<Libro> orwellBooks = biblioteca.encuentraLibrosPorAutor("George Orwell");
        assertNotNull(orwellBooks, "La lista de libros de Orwell no debería ser null");
        assertEquals(2, orwellBooks.size(), "Debería haber 2 libros de Orwell");

        // Buscar libros de un autor que no está en la biblioteca (debería devolver lista vacía)
        List<Libro> sinLibros = biblioteca.encuentraLibrosPorAutor("Autor Desconocido");
        assertNotNull(sinLibros, "Debería devolver una lista vacía, no null");
        assertEquals(0, sinLibros.size(), "Debería haber 0 libros de un autor desconocido");

        // Buscar libros de Dostoievski (debería encontrar 1)
        List<Libro> dostoBooks = biblioteca.encuentraLibrosPorAutor("Fiódor Dostoievski");
        assertNotNull(dostoBooks, "La lista de libros de Dostoievski no debería ser null");
        assertEquals(1, dostoBooks.size(), "Debería haber 1 libro de Dostoievski");
    }
}
