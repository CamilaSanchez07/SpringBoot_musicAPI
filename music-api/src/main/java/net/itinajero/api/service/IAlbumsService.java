package net.itinajero.api.service;

import java.util.List;

import net.itinajero.api.entity.Album;

public interface IAlbumsService {
	// este metodo busca todos los registros de la bd
	List<Album> buscarTodos();
	
	// este metodo guarda los registros de la bd
	void guardar(Album album);
	
	// metodo que elimina los registros de la bd
	void eliminar(int idAlbum);
}
