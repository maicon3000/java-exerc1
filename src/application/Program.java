package application;

import java.util.Scanner;

import entities.Rectangle;

public class Program {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		
		Rectangle x = new Rectangle();
		x.width = sc.nextDouble();
		x.height = sc.nextDouble();
		
		System.out.printf("AREA = %.2f%n", x.area());
		System.out.printf("PERIMETER = %.2f%n", x.perimeter());
		System.out.printf("DIAGONAL = %.2f%n", x.diagonal());
		
		
		
		sc.close();

	}

}
