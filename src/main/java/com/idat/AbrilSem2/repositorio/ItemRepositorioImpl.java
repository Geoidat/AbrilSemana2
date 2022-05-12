package com.idat.AbrilSem2.repositorio;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Repository;

import com.idat.AbrilSem2.modelo.Items;

@Repository
public class ItemRepositorioImpl implements ItemRepositorio {
	
	public List<Items> listar = new ArrayList<Items>();

	@Override
	public void guardarItem(Items item) {
		listar.add(item);		
	}

	@Override
	public void actualizarItem(Items item) {
		listar.remove(obtenerItemxId(item.getIditem()));
		listar.add(item);		
	}

	@Override
	public void eliminarItem(Integer id) {
		listar.remove(obtenerItemxId(id));		
	}

	@Override
	public List<Items> listarItems() {		
		return listar;
	}

	@Override
	public Items obtenerItemxId(Integer id) {
		return listar.stream().filter(item -> item.getIditem() == id).findFirst().orElse(null);
	}
}
