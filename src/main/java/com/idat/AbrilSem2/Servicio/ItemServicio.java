package com.idat.AbrilSem2.Servicio;

import java.util.List;

import com.idat.AbrilSem2.modelo.Items;

public interface ItemServicio {
	public void guardarItem(Items item);
	public void actualizarItem(Items item);
	public void eliminarItem(Integer id);
	public List<Items> listarItems();
	public Items obtenerItemxId(Integer id);
}
