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
		String startingLine;
		double firstNumber;
		String operation;
		double secondNumber;

		StringBuffer stringBuffer = new StringBuffer();
		stringBuffer.append("a + b	Сложение а и b ").append("\n")
				.append("a – b	Вычитание b из а (также унарный минус)").append("\n").append("a * b	Умножение а на b")
				.append("\n").append("a / b	Деление a на b").append("\n")
				.append("a % b	Вычисление остатка от деления а на b (деление по модулю)").append("\n");

		Scanner scanner = new Scanner(System.in);

		while (true) {
			System.out.println("введите число или help:");
			startingLine = scanner.nextLine();
			if (startingLine.equalsIgnoreCase("help")) {
				System.out.println(stringBuffer.toString());
			} else {
				try {
					firstNumber = Double.parseDouble(startingLine);
					break;
				} catch (Exception e) {
					// TODO: handle exception
					System.out.println("не число");
				}
			}
		}
		while (true) {
			System.out.println("введите действие:");
			operation = scanner.nextLine();
			if (operation.equals("+")) {
				break;
			} else if (operation.equals("-")) {
				break;
			} else if (operation.equals("*")) {
				break;
			} else if (operation.equals("/")) {
				break;
			} else if (operation.equals("%")) {
				break;
			} else {
				System.out.println("только + , - , * , / или %");
			}
		}

		while (true) {
			System.out.println("введите последнее число:");
			try {
				secondNumber = scanner.nextDouble();
				break;
			} catch (Exception e) {
				// TODO: handle exception
				System.out.println("не число");
			}
		}

		System.out.println("Ваш ответ: ");
		if (operation.equals("+")) {
			System.out.println(new Addition(firstNumber, secondNumber).get());
		} else if (operation.equals("-")) {
			System.out.println(new Subtraction(firstNumber, secondNumber).get());
		} else if (operation.equals("*")) {
			System.out.println(new Multiplication(firstNumber, secondNumber).get());
		} else if (operation.equals("/")) {
			System.out.println(new Division(firstNumber, secondNumber).get());
		} else if (operation.equals("%")) {
			System.out.println(new Modulo(firstNumber, secondNumber).get());
		}

	}
}
