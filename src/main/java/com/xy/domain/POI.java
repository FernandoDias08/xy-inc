package com.xy.domain;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.validation.constraints.Min;

@Entity
public class POI {

	@Id
	String name;

	@Min(value = 1, message = "Número inválido! A coordenada X deve ser um inteiro positivo")
	int coordX;

	@Min(value = 1, message = "Número inválido! A coordenada Y deve ser um inteiro positivo")
	int coordY;

	public POI() {
	}

	public POI(String name, int coordX, int coordY) {
		super();
		this.name = name;
		this.coordX = coordX;
		this.coordY = coordY;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Integer getcoordX() {
		return coordX;
	}

	public void setcoordX(int coordX) {
		this.coordX = coordX;
	}

	public Integer getcoordY() {
		return coordY;
	}

	public void setcoordY(int coordY) {
		this.coordY = coordY;
	}

}
