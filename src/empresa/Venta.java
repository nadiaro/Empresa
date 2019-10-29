package empresa;

import java.util.Date;

public class Venta {

	private Long IdVenta;
	private Date Fecha;
	private Integer cantidad;
	private Vendedor persona;
	private Item detalles;

	public Venta(Long idVenta, Date fecha, Integer cantidad, Vendedor persona, Item detalles) {
		IdVenta = idVenta;
		Fecha = fecha;
		this.cantidad = cantidad;
		this.persona = persona;
		this.detalles = detalles;
	}

	public Long getIdVenta() {
		return IdVenta;
	}

	public void setIdVenta(Long idVenta) {
		IdVenta = idVenta;
	}

	public Date getFecha() {
		return Fecha;
	}

	public void setFecha(Date fecha) {
		Fecha = fecha;
	}

	public Integer getCantidad() {
		return cantidad;
	}

	public void setCantidad(Integer cantidad) {
		this.cantidad = cantidad;
	}

	public Vendedor getPersona() {
		return persona;
	}

	public void setPersona(Vendedor persona) {
		this.persona = persona;
	}

	public Item getDetalles() {
		return detalles;
	}

	public void setDetalles(Item detalles) {
		this.detalles = detalles;
	}

}
