import java.util.*;

/**
 * Con el objetivo de calcular el precio total de una orden en Queen Papa (el cual solo tiene un producto), 
 * a partir de la cantidad requerida calcula el precio por cantidad, el impuesto y su precio total y lo muestra al cliente.
*/


public class FacturasQueenPapa{


public static void main(String[] args) {
int cant;
double preImp;
double imp;
double totPre;

	Scanner und = new Scanner(System.in);
	System.out.println("Hola! Por favor, ingresa la cantidad de QueenSalchi que deseas adquirir");
	cant=und.nextInt();
	preImp=cant*65000;
	imp=preImp*0.08;
	totPre=preImp+imp;
	System.out.println("Queen Papa");
	System.out.println("Factura de Venta");
	System.out.println("Items vendidos");
	System.out.println(cant + " x Queen Salchi: $ " + preImp);
	System.out.println("Impuesto al consumo (8%): $ " + imp);
	System.out.println("Total a pagar: $ " + totPre);
	System.out.println("¡Gracias por preferirnos!");

}

}