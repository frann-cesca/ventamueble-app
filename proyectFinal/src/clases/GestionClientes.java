package clases;

import java.util.ArrayList;
/*
 * declaracion de clase gestion clientes
 */
public class GestionClientes {
	private String rutaArchivoCliente =
		"D:\\development\\java\\ventamueble-app\\proyectFinal\\src\\resources\\clientes.txt";
	
	/*
	 * metodo para agregar la información de cliente
	 */
	public void agregarCliente(Cliente c) {
	}
	
	public void eliminarCliente(int codigoCliente) {
	}
	
	/*
	 * devuelve la lista
	 */
	public ArrayList<Cliente> getClientes() {
		return ArchivoClientes.cargarClientes(rutaArchivoCliente);
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
