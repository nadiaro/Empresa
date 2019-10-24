package empresa;

import java.util.Date;

public class Venta {
	
	private Long IdVenta;
	private Date Fecha;
	private Integer cantidad;
	
	public Venta(Long idVenta, Date fecha, Integer cantidad) {
		
		IdVenta = idVenta;
		Fecha = fecha;
		this.cantidad = cantidad;
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
	
	

}
