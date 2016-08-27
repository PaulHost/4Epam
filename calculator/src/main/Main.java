package main;

import java.util.Scanner;

import operations.Addition;
import operations.Division;
import operations.Modulo;
import operations.Multiplication;
import operations.Subtraction;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String aa;
		double a;
		String o;
		double b;

		StringBuffer help = new StringBuffer();
		help.append("a + b	Сложение а и b ").append("\n").append("a – b	Вычитание b из а (также унарный минус)")
				.append("\n").append("a * b	Умножение а на b").append("\n").append("a / b	Деление a на b")
				.append("\n").append("a % b	Вычисление остатка от деления а на b (деление по модулю)").append("\n");

		Scanner scanner = new Scanner(System.in);

		while (true) {
			System.out.println("введите число или help:");
			aa = scanner.nextLine();
			if (aa.equalsIgnoreCase("help")) {
				System.out.println(help.toString());
			} else {
				try {
					a = Integer.parseInt(aa);
					break;
				} catch (Exception e) {
					// TODO: handle exception
					System.out.println("не число");
				}
			}
		}
		while (true) {
			System.out.println("введите действие:");
			o = scanner.nextLine();
			if (o.equals("+")) {
				break;
			} else if (o.equals("-")) {
				break;
			} else if (o.equals("*")) {
				break;
			} else if (o.equals("/")) {
				break;
			} else if (o.equals("%")) {
				break;
			}
		}

		while (true) {
			System.out.println("введите последнее число:");
			try {
				b = scanner.nextDouble();
				break;
			} catch (Exception e) {
				// TODO: handle exception
				System.out.println("только + , - , * , / ");
			}
		}

		System.out.println("Ваш ответ: ");
		if (o.equals("+")) {
			System.out.println(new Addition(a, b).get());
		} else if (o.equals("-")) {
			System.out.println(new Subtraction(a, b).get());
		} else if (o.equals("*")) {
			System.out.println(new Multiplication(a, b).get());
		} else if (o.equals("/")) {
			System.out.println(new Division(a, b).get());
		} else if (o.equals("%")) {
			System.out.println(new Modulo(a, b).get());
		}

	}
}
