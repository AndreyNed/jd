package helloworld;

import java.util.Scanner;

public class HelloWorld {
	static void month_define(int month) {
		if (month == 1) {
			System.out.println("January");
		} else if (month == 2) {
			System.out.println("February");
		} else if (month == 3) {
			System.out.println("March");
		} else if (month == 4) {
			System.out.println("April");
		} else if (month == 5) {
			System.out.println("May");
		} else if (month == 6) {
			System.out.println("June");
		} else if (month == 7) {
			System.out.println("July");
		} else if (month == 8) {
			System.out.println("August");
		} else if (month == 9) {
			System.out.println("September");
		} else if (month == 10) {
			System.out.println("October");
		} else if (month == 11) {
			System.out.println("November");
		} else if (month == 12) {
			System.out.println("December");
		} else {
			System.out.println("Entered value is wrong: incorrect Month`s number");
		}

	}

	/*static int read_input() {
		int result;
		Scanner input_value = new Scanner(System.in);

		System.out.println("Enter month`s number:");
		result = input_value.nextInt();
		return result;
	}*/
	
	static int read_number(String message){
		int number;
		Scanner input_value = new Scanner(System.in);
		
		System.out.println(message);
		number = input_value.nextInt();
		return number;
	}
	
	static String read_action(String message){
		String action;
		Scanner input_value = new Scanner(System.in);
		
		System.out.println(message);
		action = input_value.next();
		input_value.close();
		return action;
	}
	
	static int sum (int x, int y){
		int result = x + y;
		return result;
	}
	
	static int minus (int x, int y){
		int result = x - y;
		return result;
	}
	
	static int multiply (int x, int y){
		int result = x * y;
		return result;
	}
	
	static double divide (int x, int y){
		double result = x / y;
		return result;
	}
	
	static void choose_action (String action, int x, int y){
		double result = 0;
		boolean status = true;
		if (action == "+") {
			result = sum( x, y );
		}
		else if (action == "-") {
			result = minus( x, y );
		}
		else if (action == "*") {
			result = multiply( x, y );
		}
		else if (action == "/") {
			result = divide( x, y );
		}
		else {
			System.out.println("Error: Incorrect input of action!");
			status = false;
		}
		if (status) {
			System.out.println("Result is: ");
			System.out.println(result);
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//int month;
		int x, y;
		String action;

		x = read_number("Enter x: ");
		y = read_number("Enter y: ");
		action = read_action("Enter action: ");
		choose_action(action, x, y);
		/*month = read_input();
		month_define(month);*/
		

	}

}
