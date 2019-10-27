package empresa;

public abstract class Item {

	private Long ID;
	private String descripcion;
	
	
	public Item(Long iD, String descripcion) {
		
		ID = iD;
		this.descripcion = descripcion;
	}


	public Long getID() {
		return ID;
	}


	public void setID(Long iD) {
		this.ID = iD;
	}


	public String getDescripcion() {
		return descripcion;
	}


	public void setDescripcion(String descripcion) {
		this.descripcion = descripcion;
	}
	
	
}
