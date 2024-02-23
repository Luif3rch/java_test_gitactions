package entity;

import java.util.Objects;

public class Album {
    public String id;
    public String nombre;
    public String artista;
    public String año;
    public String genero;
    public String descripcion;
    public Album(){

    }

    public Album(String id, String nombre, String artista, String año, String genero, String descripcion) {
        this.id = id;
        this.nombre = nombre;
        this.artista = artista;
        this.año = año;
        this.genero = genero;
        this.descripcion = descripcion;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getArtista() {
        return artista;
    }

    public void setArtista(String artista) {
        this.artista = artista;
    }

    public String getAño() {
        return año;
    }

    public void setAño(String año) {
        this.año = año;
    }

    public String getGenero() {
        return genero;
    }

    public void setGenero(String genero) {
        this.genero = genero;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }
}
