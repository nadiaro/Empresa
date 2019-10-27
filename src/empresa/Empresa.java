package empresa;

import java.util.ArrayList;

public class Empresa {
	
	private String nom;
	private ArrayList<Venta>listaVentas=new ArrayList<Venta>();
	
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
	

}
