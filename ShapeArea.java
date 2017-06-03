import java.util.Scanner;

public class ShapeArea {
	public static void main(String[] args) {
		//Scanner keyboard = new Scanner(System.in);
		int choice;
		double area = 0;
		
		System.out.print("Shape Area Calculator version 0.1");
		System.out.println(" (c) 2017 MCP Sample Output, Inc.");
		
		do {
			System.out.println("\n-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-\n");
			System.out.println("1) Triangle");
			System.out.println("2) Circle");
			System.out.println("3) Rectangle");
			System.out.println("4) Square");
			System.out.println("5) Quit");
			System.out.print("> ");
			choice = getCleanInt();
			
			if (choice == 1) {
				System.out.print("\nBase: ");
				int b = getCleanInt();
				System.out.print("Height: ");
				int h = getCleanInt();
				area = computeTriangleArea(b, h);
				System.out.println("The area of your triangle is " + area);
			}
			else if (choice == 2) {
				System.out.print("\nRadius: ");
				int radius = getCleanInt();
				area = computeCircleArea(radius);
				System.out.println("The area of your circle is " + area);
			}
			else if (choice == 3) {
				System.out.print("\nLength: ");
				int q = getCleanInt();
				System.out.print("Width: ");
				int w = getCleanInt();
				System.out.println("The area of your rectangle is " + computeRectangleArea(q, w));
			}
			else if (choice == 4) {
				System.out.print("\nSide: ");
				int s = getCleanInt();
				System.out.println("The area of your square is " + computeSquareArea(s));
			}
			else if (choice != 5) {
				System.out.println("ERROR. ");
			}
		
		} while (choice != 5);
	
	}
	
	public static int getCleanInt() {
		Scanner scanner = new Scanner(System.in);
		while(!scanner.hasNextInt()) {
			System.out.print("Please enter an integer: ");
			scanner.next();
		}
		return scanner.nextInt();
	}
	
	public static double computeTriangleArea(int base, int height) {
		double A;
		A = 0.5 * base * height;
		return A;
	}
	
	public static double computeCircleArea(int radius) {
		double A;
		A = Math.PI * radius * radius;
		return A;
	}
	
	public static double computeRectangleArea(int length, int width) {
		return (length * width);
	}
	
	public static double computeSquareArea(int side) {
		return (side * side);
	}
}