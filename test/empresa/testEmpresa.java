package empresa;

import java.util.ArrayList;
import java.util.Date;

import org.junit.Assert;
import org.junit.Test;


public class testEmpresa {

	@Test
	public void obtenerComision() {
		Item nuevoProducto=new Producto(102L, "Medias", 100.0);
		Vendedor nuevo=new Vendedor("Juan", "Perez", 10.0);
//		Item nuevoServicio=new Servicio(103L, "Reparacion", 5, 300.0);
		Date fecha=new Date(119,9,29);
		Venta nueva=new Venta(2910L, fecha, 1, nuevo, nuevoProducto);
		Empresa miEmpresa=new Empresa("Pirulo");
		miEmpresa.agregarVenta(nueva);
		Double valorEsperado=10.0;
		Double valorObtenido=miEmpresa.obtenerComisionDeTodosLosProductosVendidosPorUnVendedor("Juan","Perez");
		Assert.assertEquals(valorEsperado, valorObtenido);
		
	}
	
	@Test
	public void obtenerLista() {
		Vendedor nuevo=new Vendedor("Juan", "Perez", 10.0);
		Item nuevoServicio=new Servicio(103L, "Reparacion", 5, 300.0);
		Date fecha=new Date(119,9,29);
		Venta nueva=new Venta(2910L, fecha, 1, nuevo, nuevoServicio);
		Empresa miEmpresa=new Empresa("Pirulo");
		miEmpresa.agregarVenta(nueva);
		ArrayList<Servicio> listaEsperada=new ArrayList<>();
		listaEsperada.add((Servicio)nuevoServicio);
		Assert.assertEquals(listaEsperada, miEmpresa.obtenerListaDeServicios(fecha, nuevo));
	}
	
	@Test
	public void eliminarVenta() {
		Vendedor nuevo=new Vendedor("Juan", "Perez", 10.0);
		Item nuevoServicio=new Servicio(103L, "Reparacion", 5, 300.0);
		Date fecha=new Date(119,9,29);
		Venta nueva=new Venta(2910L, fecha, 1, nuevo, nuevoServicio);
		Empresa miEmpresa=new Empresa("Pirulo");
		miEmpresa.agregarVenta(nueva);
		Assert.assertTrue(miEmpresa.eliminarVenta(2910L));
	}

}
