package biblioteca;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
 * Pruebas unitarias para la clase Libro.
 */
class LibroTest {

    @Test
    void testCrearLibro() {
        Libro libro = new Libro("1984", "George Orwell", 1949);
        assertNotNull(libro, "El libro no debería ser null");
        assertEquals("1984", libro.getTitulo(), "El título no coincide");
        assertEquals("George Orwell", libro.getAutor(), "El autor no coincide");
        assertEquals(1949, libro.getAnioPublicacion(), "El año de publicación no coincide");
    }

    @Test
    void testSetters() {
        Libro libro = new Libro("Titulo original", "Autor original", 2000);

        libro.setTitulo("Nuevo Titulo");
        libro.setAutor("Nuevo Autor");
        libro.setAnioPublicacion(2023);

        assertEquals("Nuevo Titulo", libro.getTitulo(), "Error en setTitulo()");
        assertEquals("Nuevo Autor", libro.getAutor(), "Error en setAutor()");
        assertEquals(2023, libro.getAnioPublicacion(), "Error en setAnioPublicacion()");
    }
}
