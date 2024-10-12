package clases;

import java.util.ArrayList;
/*
 * declaracion de clase gestion clientes
 */
public class GestionClientes {
	private ArrayList<Cliente>  clientes;
	
	/*
	 * constructor
	 */
	public GestionClientes() {
		clientes = new ArrayList<>();
		}
	/*
	 * metodo para agregar la información de cliente
	 */
	public void agregarCliente(Cliente c) {
		clientes.add(c);
		}
	
	public void eliminarCliente(int codigoCliente) {
		clientes.removeIf(c -> c.getCodigoCliente() == codigoCliente);
	}
	
	/*
	 * devuelve la lista
	 */
	public ArrayList<Cliente> getClientes(){
		return clientes;
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
