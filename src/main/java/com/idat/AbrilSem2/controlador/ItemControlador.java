package com.idat.AbrilSem2.controlador;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.idat.AbrilSem2.Servicio.ItemServicio;
import com.idat.AbrilSem2.modelo.Items;

@RestController
@RequestMapping("/item/v1")
public class ItemControlador {
	
	@Autowired
	private ItemServicio servicio;
	
	@RequestMapping(path = "/listar", method = RequestMethod.GET)
	public ResponseEntity<List<Items>> listarItems(){
		return new ResponseEntity<List<Items>>(servicio.listarItems(), HttpStatus.OK);
	}
	
	@RequestMapping(path = "/guardar", method = RequestMethod.POST)
	public ResponseEntity<Void> guardar(@RequestBody Items item){
		servicio.guardarItem(item);
		return new ResponseEntity<Void>(HttpStatus.CREATED);
	}	
	
	@RequestMapping(path = "/listar/{id}")
	public ResponseEntity<Items> listarxId(@PathVariable Integer id){
		Items i = servicio.obtenerItemxId(id);
		if(i != null)
			return new ResponseEntity<Items>(i, HttpStatus.OK);		
		return new ResponseEntity<Items>(HttpStatus.NOT_FOUND);
	}
	
	@RequestMapping(path = "/actualizar")
	public ResponseEntity<Void> actualizar(@RequestBody Items item){
		Items i = servicio.obtenerItemxId(item.getIditem());
		if(i != null) {
			servicio.actualizarItem(item);
			return new ResponseEntity<Void>(HttpStatus.OK);
		} 
		return new ResponseEntity<Void>(HttpStatus.NOT_FOUND);		
	}
	
	@RequestMapping(path = "/eliminar/{id}", method = RequestMethod.DELETE)
	public ResponseEntity<Void> eliminar(@PathVariable Integer id){
		Items i = servicio.obtenerItemxId(id);
		if(i != null) {
			servicio.eliminarItem(id);
			return new ResponseEntity<Void>(HttpStatus.OK);
		} 
		return new ResponseEntity<Void>(HttpStatus.NOT_FOUND);		
	}
}
