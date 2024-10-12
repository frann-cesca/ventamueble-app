package clases;

import java.util.ArrayList;

public class GestionClientes {
	private ArrayList<Cliente> clientes;
	
	public GestionClientes() {
		clientes = new ArrayList<>();
		}
	
	public void agregarCliente(Cliente c) {
		clientes.add(c);
		}
	
	public void eliminarCliente(int codigoCliente) {
		clientes.removeIf(c -> c.getCodigoCliente() == codigoCliente);
	}
	public ArrayList<Cliente> getClientes(){
		return clientes;
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
