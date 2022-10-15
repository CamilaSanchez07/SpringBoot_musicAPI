package net.itinajero.api.service;

import java.util.List;

import net.itinajero.api.entity.Album;

public interface IAlbumsService {
	// este metodo busca todos los registros de la bd
	List<Album> buscarTodos();
}
