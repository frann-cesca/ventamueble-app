package clases;

public class Producto {
	/*
	 * variables de la clase Producto
	 */
	private int codigoProducto;
	private int stockActual;
	 private int stockMinimo;
	 private int stockMaximo;
	private String nombreProducto;
	private double precioProducto;
	
	/*
	 * Constructor 
	 */
	public Producto(int codigoProducto, int stockActual, int stockMinimo, int stockMaximo, String nombreProducto,
			double precioProducto) {
		super();
		this.codigoProducto = codigoProducto;
		this.stockActual = stockActual;
		this.stockMinimo = stockMinimo;
		this.stockMaximo = stockMaximo;
		this.nombreProducto = nombreProducto;
		this.precioProducto = precioProducto;
	}

	//GET AND SET
	public int getCodigoProducto() {
		return codigoProducto;
	}

	public void setCodigoProducto(int codigoProducto) {
		this.codigoProducto = codigoProducto;
	}

	public int getStockActual() {
		return stockActual;
	}

	public void setStockActual(int stockActual) {
		this.stockActual = stockActual;
	}

	public int getStockMinimo() {
		return stockMinimo;
	}

	public void setStockMinimo(int stockMinimo) {
		this.stockMinimo = stockMinimo;
	}

	public int getStockMaximo() {
		return stockMaximo;
	}

	public void setStockMaximo(int stockMaximo) {
		this.stockMaximo = stockMaximo;
	}

	public String getNombreProducto() {
		return nombreProducto;
	}

	public void setNombreProducto(String nombreProducto) {
		this.nombreProducto = nombreProducto;
	}

	public double getPrecioProducto() {
		return precioProducto;
	}

	public void setPrecioProducto(double precioProducto) {
		this.precioProducto = precioProducto;
	}
	
	
	
	
	
}
