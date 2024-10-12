package clases;

import java.util.ArrayList;

public class GestionClientes {
	private ArrayList<Cliente>  clientes;
	
	//CONSTRUCTOR
	public GestionClientes() {
		clientes = new ArrayList<>();
		}
	//METODO PARA AGREGAR Y SE AÑADE EL OBJETO A LA LISTA
	public void agregarCliente(Cliente c) {
		clientes.add(c);
		}
	
	public void eliminarCliente(int codigoCliente) {
		clientes.removeIf(c -> c.getCodigoCliente() == codigoCliente);
	}
	//DEVUELVE LA LISTA
	public ArrayList<Cliente> getClientes(){
		return clientes;
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
