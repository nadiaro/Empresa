package empresa;

import java.util.ArrayList;
import java.util.Date;
import java.util.Iterator;
import java.util.LinkedList;

public class Empresa {

	private String nom;
	private ArrayList<Venta> listaVentas = new ArrayList<Venta>();
	private LinkedList<Vendedor> listaVendedor = new LinkedList<Vendedor>();

	public Empresa(String nom) {

		this.nom = nom;
	}

	public String getNom() {
		return nom;
	}

	public void setNom(String nom) {
		this.nom = nom;
	}

	public ArrayList<Venta> getListaVentas() {
		return listaVentas;
	}

	public void setListaVentas(ArrayList<Venta> listaVentas) {
		this.listaVentas = listaVentas;
	}

	public Boolean agregarVendedor(String nom, String ape, Double porComision) {
		// Vendedor nuevo = new Vendedor(nom, ape, porComision);
		for (Vendedor listaAux : this.listaVendedor) {
			// if (listaAux.equals(nuevo)) {
			if (listaAux.getNom().equals(nom) && listaAux.getApe().equals(ape))
				// System.out.println("Este vendedor ya existe");
				return false;
		}
		Vendedor nuevo = new Vendedor(nom, ape, porComision);
		this.listaVendedor.add(nuevo);
		return true;
	}

	public Boolean agregarVenta(Venta nuevaVenta) {
		for (Venta lista : this.listaVentas) {
			if (lista.getIdVenta().equals(nuevaVenta.getIdVenta()))
				return false;
		}
		this.listaVentas.add(nuevaVenta);
		return true;
	}

	public Double obtenerComisionDeTodosLosProductosVendidosPorUnVendedor(String nom, String ape) {
		Double comision = 0.0;
		for (Venta lista : this.listaVentas) {
			if (lista.getPersona().getNom().equals(nom) && lista.getPersona().getApe().equals(ape)
					&& lista.getDetalles() instanceof Producto) {
				Double precioTotal = ((Producto) lista.getDetalles()).getPrecio() * lista.getCantidad();
				Double porcentajeComision = lista.getPersona().getPorComision();
				comision += (porcentajeComision * precioTotal) / 100;
			}
		}
		return comision;
	}

	public ArrayList<Servicio> obtenerListaDeServicios(Date fecha, Vendedor persona) {
		ArrayList<Servicio> listaDeServicios = new ArrayList<>();
		for (Venta lista : this.listaVentas) {
			if (lista.getFecha().equals(fecha) && lista.getPersona().equals(persona) && lista.getDetalles() instanceof Servicio) {
				listaDeServicios.add((Servicio) lista.getDetalles());
			}
		}
		return listaDeServicios;
	}

	public Boolean eliminarVenta(Long id) {
		Iterator<Venta> it = this.listaVentas.iterator();
		while (it.hasNext()) {
			Venta aux = it.next();
			if (aux.getIdVenta().equals(id)) {
				it.remove();
				return true;
			}
		}
		return false;
	}

}
