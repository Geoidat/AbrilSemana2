package com.idat.AbrilSem2.modelo;

import java.io.Serializable;

public class Items implements Serializable{
	
	private static final long serialVersionUID = 2464398878567000954L;
	private Integer iditem;
	private String item;
	private Integer cantidad;
	private Double total;
	
	public Integer getIditem() {
		return iditem;
	}
	public void setIditem(Integer iditem) {
		this.iditem = iditem;
	}
	public String getItem() {
		return item;
	}
	public void setItem(String item) {
		this.item = item;
	}
	public Integer getCantidad() {
		return cantidad;
	}
	public void setCantidad(Integer cantidad) {
		this.cantidad = cantidad;
	}
	public Double getTotal() {
		return total;
	}
	public void setTotal(Double total) {
		this.total = total;
	}
	public Items() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Items(Integer iditem, String item, Integer cantidad, Double total) {
		super();
		this.iditem = iditem;
		this.item = item;
		this.cantidad = cantidad;
		this.total = total;
	}
}
