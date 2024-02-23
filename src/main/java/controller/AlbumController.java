package controller;

import entity.Album;
import jakarta.inject.Inject;
import jakarta.ws.rs.*;
import jakarta.ws.rs.core.MediaType;
import service.AlbumService;

import java.util.List;

@Path("/album")
public class AlbumController {

    private AlbumService albumService;

    @Inject
    public AlbumController(AlbumService albumService){
        this.albumService = albumService;
    }

    @GET
    @Produces(MediaType.APPLICATION_JSON)
    public List<Album> find() {
        return albumService.getAlbums();
    }

    @POST
    @Produces(MediaType.APPLICATION_JSON)
    public Album create(Album album){
        return albumService.addAlbum(album);
    }

    @PUT
    @Path("/{id}")
    @Produces(MediaType.APPLICATION_JSON)
    public Album update(String id, Album album){
        return albumService.changeAlbums(id, album);
    }

    @DELETE
    @Path("/{id}")
    public String delete(String id){
        return albumService.deleteAlbums(id);
    }
}
