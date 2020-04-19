package modal.entidades;

import modal.entidades.Figuras;
import modal.enums.Color;

public class Circulo extends Figuras {
	private Double radio;

	public Circulo(Color color, Double radio) {
		super(color);
		this.radio = radio;
	}

	public Double getRadio() {
		return radio;
	}

	public void setRadio(Double radio) {
		this.radio = radio;
	}

	@Override
	public double area()
	{
		return Math.PI * radio * radio;
	}
	
}
