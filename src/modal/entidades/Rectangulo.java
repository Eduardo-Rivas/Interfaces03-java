package modal.entidades;

import modal.entidades.Figuras;
import modal.enums.Color;

public class Rectangulo extends Figuras {
	private Double ancho;
	private Double alto;

	public Rectangulo(Color color, Double ancho, Double alto) {
		super(color);
		this.ancho = ancho;
		this.alto = alto;
	}

	public Double getAncho() {
		return ancho;
	}

	public void setAncho(Double ancho) {
		this.ancho = ancho;
	}

	public Double getAlto() {
		return alto;
	}

	public void setAlto(Double alto) {
		this.alto = alto;
	}
    
	@Override
	public double area()
	{
		return ancho * alto;
	}
}
