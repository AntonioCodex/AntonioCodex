import java.util.ArrayList;
import java.util.List;

public class Factura {
	private int numeroFactura;
	private String cliente;
	private List<Articulo> articulos;
	private double total;
	
	public Factura(int numeroFactura, String cliente) {
		this.numeroFactura = numeroFactura;
		this.cliente = cliente;
		this.articulos = new ArrayList<>();
		this.total = 0.0;	
	}
	
	//Getters y setters para numeroFactura y cliente
	public int getNumeroFactura() {
		return numeroFactura;
	}
	public void setNumeroFactura(int numeroFactura) {
		this.numeroFactura = numeroFactura;
	}
	
	public String getCliente() {
		return cliente;
	}
	
	public void setCliente(String cliente) {
		this.cliente = cliente;
	}
	
	// Método para obtener los artículos
	public List<Articulo> getArticulos() {
		return articulos;	
	}
	
	// Método para agregar un artículo
	public void agregarArticulo(Articulo articulo) {
		this.articulos.add(articulo);
		calcularTotal();
	}
	
	// Método privado para calcular el total
	private void calcularTotal() {
		total = 0.0;
		for (Articulo articulo : articulos) {
			total += articulo.getPrecio();
		}
	}
	
	// Getter para el total
	public double getTotal() {
		return total;
	}
	
	// Clase interna Aticulo
	public static class Articulo {
		private String nombre;
		private double precio;
		
		public Articulo(String nombre, double precio) {
			this.nombre = nombre;
			this.precio = precio;
	}
	
	// Getters y setters para nombre y precio
	public String getNombre() {
		return nombre;
	}
	
	public void setNombre (String nombre) {
		this.nombre = nombre;
	}
	 public double getPrecio() {
		 return precio;
	 }
	 
	 public void setPrecio(double precio) {
		 this.precio = precio;
	 }
}


	public static void main(String[] args) {
		Factura factura = new Factura (123, "Ciente Ejemplo");
		
		Articulo articulo1 = new Articulo("Artículo 1", 50.0);
		Articulo articulo2 = new Articulo("Artículo 2", 75.0);
		
		factura.agregarArticulo(articulo1);
		factura.agregarArticulo (articulo2);
		
		System.out.println("Número de Factura: " + factura.getNumeroFactura());
		System.out.println("Cliente: " + factura.getCliente());
		System.out.println("Total: " + factura.getTotal());
		
		System.out.println("Artículos: ");
		for ( Articulo articulo : factura.getArticulos()) {
			System.out.println(" - " + articulo.getNombre() + ": $ " + articulo.getPrecio());
			
		}

	}

}
