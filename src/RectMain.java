/**
 * 
 * @author Nathan Paolella pd 7
 * 
 */

import java.util.Scanner;

public class RectMain {
	
	public static void main(String[] args)
	{
		
		Scanner s = new Scanner(System.in);
		
		System.out.print("Input length for your rectangle: ");
		double length = s.nextDouble();
		s.nextLine();
		
		System.out.print("Input width for your rectangle: ");
		double width = s.nextDouble();
		s.nextLine();
		
		System.out.printf("\nArea: %18.2f", length*width);
		System.out.printf("\nPerimeter: %13.2f", 2 * length + 2 * width);
		System.out.printf("\nDiagonal: %14.2f", Math.sqrt(length*length + width*width));
		
	}

}
