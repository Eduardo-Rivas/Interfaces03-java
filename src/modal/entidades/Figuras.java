package modal.entidades;

import modal.enums.Color;

public abstract class Figuras {
	private Color color;

	//--Constructor--//
	public Figuras(Color color) {
		this.color = color;
	}

	//--Getters y Setters--/
	public Color getColor() {
		return color;
	}
	public void setColor(Color color) {
		this.color = color;
	}

	//--Metodo Abstracto a ser Sobre Escrito--//
	public abstract double area();
	
}
