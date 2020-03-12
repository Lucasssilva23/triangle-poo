package aplicacao;

import java.util.Locale;
import java.util.Scanner;

import entidade.Triangulo;

public class program {
	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		Triangulo x, y;
		x = new Triangulo();
		y = new Triangulo();

		System.out.println("Entre com tr�s numeros do tri�ngulo X: ");
		x.a = sc.nextDouble();
		x.b = sc.nextDouble();
		x.c = sc.nextDouble();
		System.out.println("Entre com tr�s numeros do tri�ngulo Y: ");
		y.a = sc.nextDouble();
		y.b = sc.nextDouble();
		y.c = sc.nextDouble();

		double areaX = x.area();
		double areaY = x.area();

		System.out.printf("Area do tri�gulo X: %.4f%n", areaX);
		System.out.printf("Area do tri�gulo Y: %.4f%n", areaY);

		if (areaX > areaY) {
			System.out.println("Area maior : X");
		} else {
			System.out.println("Area maior : Y");
		}

		sc.close();
	}
}
