
import java.io.IOException;
import java.util.Scanner;

import com.google.gson.Gson;



public class Principal extends Monedas{
	
	public static void main(String[] args)  throws IOException, InterruptedException {
		Service datos = new Service();
		String json = datos.obtenerDatos("https://v6.exchangerate-api.com/v6/faa732c1d69b5350d9c0bf08/latest/USD");
		
	
		Gson gson = new Gson();
		Monedas cambio = gson.fromJson(json.toString(), Monedas.class);
		int opc = 0;
		Scanner input = new Scanner(System.in);
		Scanner monto = new Scanner(System.in);
		double valor = 0; 
		double resultadoConversion = 0; 
		String menu = """ 
				\n --- Bienvanido a MiConversor de monedas: ---
				1- Dolar -> Peso Argentino
				2- Peso argentino -> Dolar 
				3- Dolar -> Real Brasileño 
				4- Real Brasileño -> Dolar
				5- Dolar -> Peso Colombiano
				6- Peso Colombiano -> Dolar
				7- Salir
				Escoja una opcion válida:
				==================================
				"""; 
	
		
		cambio.setUsd(Double.parseDouble(cambio.getMoneda().get("USD").toString()));
		cambio.setArs(Double.parseDouble(cambio.getMoneda().get("ARS").toString()));
		cambio.setBrl(Double.parseDouble(cambio.getMoneda().get("BRL").toString()));
		cambio.setCop(Double.parseDouble(cambio.getMoneda().get("COP").toString()));

		while (opc != 7) {
			System.out.println(menu);
			opc = input.nextInt();
		switch (opc) {
		case 1:
		 System.out.println("ingrese el valor en Dolares que desa convertir a Pesos Argentinos: ");
		 valor = monto.nextDouble();
		 resultadoConversion = cambio.setUsdToArs(valor);
		 System.out.println("El valor de " + valor + "[USD] equivale a " + resultadoConversion + "[ARS]");
		  break;
		case 2:
			System.out.println("ingrese el valor en Pesos Argentinos que desea convertir a Dolares: ");
			valor = monto.nextDouble();
			resultadoConversion = cambio.setArsToUsd(valor);
			System.out.println("El valor de " + valor + "[ARS] equivale a " + resultadoConversion + "[USD]");
		  break;
		case 3:
			System.out.println("ingrese el valor en Dolares que desea convertir a Reales Brasileños: ");
			valor = monto.nextDouble();
			resultadoConversion = cambio.setUsdToBrl(valor);
			System.out.println("El valor de " + valor + "[USD] equivale a " + resultadoConversion + "[BRL]");
			break;
		case 4:
			System.out.println("ingrese el valor en Reales Brasileños que desea convertir a Dolares: ");
			valor = monto.nextDouble();
			resultadoConversion = cambio.setBrlToUsd(valor);
			System.out.println("El valor de " + valor + "[BRL] equivale a " + resultadoConversion + "[USD]");
		  break;
		case 5:
			System.out.println("ingrese el valor en Dolares que desea convertir a Pesos Colombianos: ");
			valor = monto.nextDouble();
			resultadoConversion = cambio.setUsdToCop(valor);
			System.out.println("El valor de " + valor + "[USD] equivale a " + resultadoConversion + "[COP]");
			break;
		case 6:
			System.out.println("ingrese el valor en Pesos Colombianos que desea convertir a Dolares: ");
			valor = monto.nextDouble();
			resultadoConversion = cambio.setCopToUsd(valor);
			System.out.println("El valor de " + valor + "[COP] equivale a " + resultadoConversion + "[USD]");
		  break;
		case 7: 
			System.out.println("Gracias por su visita");
			break;
		// otros casos posibles...
		default:
			System.out.println("Valor no valido");
					  
		}
		
		}	System.out.println("Adios!");
		
		
	    }
		
}
