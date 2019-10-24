package empresa;

import java.util.ArrayList;

public class Empresa {
	
	private String nom;
	private ArrayList<Venta>listaVentas;
	
	public Empresa(String nom, ArrayList<Venta> listaVentas) {
		
		this.nom = nom;
		this.listaVentas = listaVentas;
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
