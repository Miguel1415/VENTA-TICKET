package PuntoVenta;

import java.util.Scanner;
import java.util.ArrayList;

public class PuntoVenta {
	
	private static ArrayList<Producto> productos =  new ArrayList<Producto>();
	//ESTA ES UNA CONSTANTE
	public final static int OPCION_MENU_SALIR=6;
	public final static int OPCION_MENU_PAGAR=5;
	public final static int OPCION_MENU_CARRO=4;
	public final static int OPCION_MENU_ELIMINAR=3;
	public final static int OPCION_MENU_PRODUCTOS=2;
	public final static int OPCION_MENU_CREAR=1;

	public static void main (String[] args) 
	{
		int opcionSeleccionada;
		do 
		{
			opcionSeleccionada=menu();
			switch(opcionSeleccionada) 
			{
			case OPCION_MENU_CREAR:
				crearProducto();
				break;
			case OPCION_MENU_PRODUCTOS:
				verrProducto();
				break;
			case OPCION_MENU_ELIMINAR:
				eliminarProducto();
				break;
			case OPCION_MENU_CARRO:
				agregarProductoAlcarro();
				break;
			case OPCION_MENU_PAGAR:
				pagar();
				break;
			}
		}while(opcionSeleccionada !=OPCION_MENU_SALIR );
		
		
		
		System.out.printf("Selecciono la opcion %d",opcionSeleccionada);
	}
	private static void crearProducto() {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("Por favor ingrese un codigo para su producto");
		String codigoProducto = scanner.nextLine();
		
		System.out.println("Por favor ingrese un nombre para su producto");
		String nombreProducto = scanner.nextLine();
		
		System.out.println("Por favor ingrese un precio para su producto");
		int precioProducto = scanner.nextInt();
		
		
		Producto ProductoNuevo = new Producto(codigoProducto, nombreProducto, precioProducto);
		productos.add(ProductoNuevo);
		
	}
	private static void verrProducto() {
		// TODO Auto-generated method stub
		for(Producto producto : productos) 
		{
			System.out.printf("Codigo: %s Producto: %s Precio: %s"
					,producto.getCodigo()
					,producto.getNombre() 
					,producto.getPrecio());
		}
	}
	private static void eliminarProducto() {
		// TODO Auto-generated method stub
		
	}
	private static void agregarProductoAlcarro() {
		// TODO Auto-generated method stub
		
	}
	private static void pagar() {
		// TODO Auto-generated method stub
		
	}
	private static int menu() 
	{
		System.out.println("\n================\n");
		System.out.println("\nMENU PUNTO DE VENTA\n================\n");
		System.out.println("1. Crear producto");
		System.out.println("2. Ver producto");
		System.out.println("3. Eliminar producto");
		System.out.println("4. Agregar producto al carro");
		System.out.println("5. Pagar");
		System.out.println("6. SALIR");

		System.out.println("\nPor favor digite la opcion deseada");
		
		Scanner scanner = new Scanner(System.in);
		int opcionseleccionada = scanner.nextInt();

		return opcionseleccionada;
	}

}
