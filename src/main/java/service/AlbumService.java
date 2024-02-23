package service;

import entity.Album;
import jakarta.enterprise.context.ApplicationScoped;

import java.util.ArrayList;
import java.util.List;

@ApplicationScoped
public class AlbumService {
    List<Album> albums;
    public AlbumService() {
        this.albums = new ArrayList<>();
        generate();
    }

    public void generate(){
        albums.add(new Album("1", "The Dark Side of the Moon", "Pink Floyd", "1973", "Rock clásico", "Considerado uno de los mejores álbumes de rock de todos los tiempos."));
        albums.add(new Album("2", "Master of Puppets", "Metallica", "1986", "Heavy Metal", "Considerado uno de los mejores álbumes de thrash metal de todos los tiempos."));
        albums.add(new Album("3", "Back in Black", "AC/DC", "1980", "Hard Rock", "El álbum más vendido de AC/DC, con himnos del rock como Back in Black y Hells Bells."));
        albums.add(new Album("4", "Hybrid Theory", "Linkin Park", "2000", "Nu Metal", "Un álbum con una mezcla de rock, metal y hip-hop, con letras sobre la angst adolescente."));
        albums.add(new Album("5", "Iron Maiden", "Iron Maiden", "1980", "Heavy Metal", "El álbum debut de Iron Maiden, con un sonido crudo y potente."));
        albums.add(new Album("6", "Appetite for Destruction", "Guns N' Roses", "1987", "Hard Rock", "Álbum debut con himnos como 'Welcome to the Jungle' y 'Sweet Child o' Mine'."));
        albums.add(new Album("7", "Use Your Illusion I", "Guns N' Roses", "1991", "Hard Rock", "Primera parte de un álbum doble con éxitos como 'November Rain' y 'Don't Cry'."));
        albums.add(new Album("8", "American Idiot", "Green Day", "2004", "Rock opera/Rock alternativo", "Un álbum conceptual sobre la desilusión con la política y la sociedad estadounidense."));
        albums.add(new Album("9", "All Killer No Filler", "Sum 41", "2001", "Pop punk", "Contiene éxitos como 'Fat Lip' y 'In Too Deep'."));
        
    }

    public Album addAlbum(Album album) {
        this.albums.add(album);
        return album;
    }

    public List<Album> getAlbums() {
        return albums;
    }

    public Album changeAlbums(String id, Album album) {
        for (int i = 0; i < albums.size(); i++) {
            String posibleMatch = albums.get(i).id;
            if (album.getId().equals(posibleMatch)) {
                System.out.println("coincidencia");
                albums.set(i, album);
            }
        }
        return album;
    }

    public String deleteAlbums(String id) {
        for (int i = 0; i < albums.size(); i++) {
            String posibleMatch = albums.get(i).id;
            if (id.equals(posibleMatch)) {
                albums.remove(i);
            }
        }
        return id;
    }
}
