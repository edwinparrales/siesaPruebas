package com.example.demo.entity;

import javax.persistence.*;


@Entity
@Table(name="t011_mm_paises")
public class Pais {
	  @Column(name = "f011_id")
	    String id;
	 @Column(name = "f011_descripcion")
	    String descripcion;
	  
		public Pais() {
			
		}
		   
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getDescripcion() {
		return descripcion;
	}
	public void setDescripcion(String descripcion) {
		this.descripcion = descripcion;
	}

	@Override
	public String toString() {
		return "Pais [id=" + id + ", descripcion=" + descripcion + "]";
	}

	   
	   
	   
	

}
