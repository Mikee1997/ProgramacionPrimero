package tema5;

import java.util.Scanner;

public class prueba {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);

		// TODO Auto-generated method stub
		System.out.println("Introduzca el primer número");
		int num1 = scan.nextInt();
		System.out.println("Gracias ,introduzca a continuación el siguiente número");
		int num2 = scan.nextInt();
		int suma = sumar(num1, num2);
		System.out.println("el resultado de la suma sería:" + suma);

		int num3;
		int num4;
		System.out.println("Por favor,introduzca el primer número");
		num3 = scan.nextInt();

		System.out.println("introduzca el segundo número");
		num4 = scan.nextInt();

		int mayor = mayorQue(num3, num4);
		System.out.println("El número mayor es" + mayor);
	}

	/**
	 * Método que suma 2 variables y devuelve el resultado
	 * 
	 * @param x
	 * @param y
	 * @return
	 */
	public static int sumar(int x, int y) {
		// Sumamos 2 variables que nos vienen por parámetros y las almacenamos en
		// resultado
		int resultado = x + y;
		// Devolvemos el resultado de la suma
		return resultado;
	}

	/**
	 * Metodo que multiplica 3 variables y devuelve el resultado de la multplicación
	 * 
	 * @param x
	 * @param y
	 * @param z
	 */

	public static int multiplicar(int x, int y, int z) {
		int resultado = x * y * z;
		return resultado;
	}

	public static int mayorQue(int x, int y) {
		int resultado;
		if (x > y) {
			resultado = x;
		} else {
			resultado = y;
		}
		return resultado;
	}

	/**
	 * Metodo que comprueba si un número es cero param x param y return
	 */
	public static boolean esCero(int x) {

		boolean esCero = false;
		if (x == 0) {
			esCero = true;
		}
		return esCero;
	}

}
