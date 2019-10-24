package empresa;

public class Servicio extends Item{

	private Integer cantHoras;
	private Integer precioHora;
	
	public Servicio(Long iD, String descripcion, Integer cantHoras,
			Integer precioHora) {
		super(iD, descripcion);
		this.cantHoras = cantHoras;
		this.precioHora = precioHora;
	}

	public Integer getCantHoras() {
		return cantHoras;
	}

	public void setCantHoras(Integer cantHoras) {
		this.cantHoras = cantHoras;
	}

	public Integer getPrecioHora() {
		return precioHora;
	}

	public void setPrecioHora(Integer precioHora) {
		this.precioHora = precioHora;
	}
	
	
}
