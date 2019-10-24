package empresa;

public class Producto extends Item{

	private Double precio;

	public Producto(Long iD, String descripcion, Double precio) {
		super(iD, descripcion);
		this.precio = precio;
	}

	public Double getPrecio() {
		return precio;
	}

	public void setPrecio(Double precio) {
		this.precio = precio;
	}
	
	
}
