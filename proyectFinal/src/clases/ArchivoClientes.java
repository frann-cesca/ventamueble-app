package clases;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import  java.util.ArrayList;

/**
 * Esta clase sirve para manejar el archivo .txt de los clientes.
 */
public class ArchivoClientes {
	public static void grabarClientes(ArrayList<Cliente> clientes, String filename) {
		try (/*para escribir en el archivo de manera eficiente.*/BufferedWriter writer = new BufferedWriter(new FileWriter(filename))){
			for (Cliente c : clientes) {
				writer.write(c.getCodigoCliente() + " , " + c.getNombreCliente() + " , " +
				c.getApellidoCliente()	 + " , " + c.getDireccionCliente()	+ " , " + 
				c.getTelefonoCliente()	 + " , " + c.getDniCliente());
			writer.newLine();			
			}
			
		} catch (IOException  e) {
			e.printStackTrace();
		}
	}
public static ArrayList<Cliente> cargarClientes(String filename){
	ArrayList<Cliente> clientes = new ArrayList<>();

	try(BufferedReader reader = new BufferedReader(new FileReader(filename))){
		String line;
		while ((line = reader.readLine())!= null) {
			String[] datos = line.split(" , ");
			int codigoCliente = Integer.parseInt(datos [0]);
			String nombreCliente = datos[1];
			String apellidoCliente = datos[2]; 
			String direccionCliente = datos[3];
			String telefonoCliente = datos[4];
			String dniCliente = datos[5];
			Cliente c = new Cliente(codigoCliente, nombreCliente,
					apellidoCliente, direccionCliente, telefonoCliente
					,dniCliente);
			clientes.add(c);
		}}
	catch (IOException e) {
			e.printStackTrace();
		}
		return clientes;
	
	

}
	
	
	
}//CIERRE TOTAL
