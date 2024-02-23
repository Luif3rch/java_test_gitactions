import entity.Album;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import service.AlbumService;

import static org.junit.jupiter.api.Assertions.*;

public class AlbumServiceTest {
    private AlbumService AlbumService;

    @BeforeEach
    void setUp() {
        AlbumService = new AlbumService();
    }

    @Test
    public void addAlbumTest() {
        // Tamaño inicial del arrays
        int initialSize = AlbumService.getAlbums().size();

        // Albumo a agregar
        Album newAlbum = new Album("9", "All Killer No Filler", "Sum 41", "2001", "Pop punk", "Contiene éxitos como 'Fat Lip' y 'In Too Deep'.");
        // Agregar el Albumo
        AlbumService.addAlbum(newAlbum);

        // Tamaño del array después de agregar el Albumo
        int newSize = AlbumService.getAlbums().size();

        // Verificar que el tamaño del array ha aumentado en 1
        assertEquals(initialSize + 1, newSize);
    }

    @Test
    public void testAddAlbumReturnsCorrectAlbum() {
        Album newAlbum = new Album("9", "All Killer No Filler", "Sum 41", "2001", "Pop punk", "Contiene éxitos como 'Fat Lip' y 'In Too Deep'.");
        Album addedAlbum = AlbumService.addAlbum(newAlbum);
        assertEquals(newAlbum, addedAlbum);
    }

    @Test
    public void testAddMultipleAlbums() {
        Album album1 = new Album("9", "All Killer No Filler", "Sum 41", "2001", "Pop punk", "Contiene éxitos como 'Fat Lip' y 'In Too Deep'.");
        Album album2 = new Album("4", "Hybrid Theory", "Linkin Park", "2000", "Nu Metal", "Un álbum con una mezcla de rock, metal y hip-hop, con letras sobre la angst adolescente.");

        AlbumService.addAlbum(album1);
        AlbumService.addAlbum(album2);

        assertTrue(AlbumService.getAlbums().contains(album1));
        assertTrue(AlbumService.getAlbums().contains(album2));
    }

}
