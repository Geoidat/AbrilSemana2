package com.idat.AbrilSem2.Servicio;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.idat.AbrilSem2.modelo.Items;
import com.idat.AbrilSem2.repositorio.ItemRepositorio;

@Service
public class ItemServicioImpl implements ItemServicio {
	
	@Autowired
	public ItemRepositorio repositorio; 

	@Override
	public void guardarItem(Items item) {
		repositorio.guardarItem(item);		
	}

	@Override
	public void actualizarItem(Items item) {
		repositorio.actualizarItem(item);		
	}

	@Override
	public void eliminarItem(Integer id) {
		repositorio.eliminarItem(id);		
	}

	@Override
	public List<Items> listarItems() {
		return repositorio.listarItems();
	}

	@Override
	public Items obtenerItemxId(Integer id) {
		return repositorio.obtenerItemxId(id);
	}
}
