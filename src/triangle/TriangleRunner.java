package triangle;
import java.util.Scanner;

public class TriangleRunner
{

    public static void main(String[] args)
    {
        Scanner triangle = new Scanner(System.in);

        System.out.println("Please enter the first coordinate set. It must be in the form (x,y):"); //
        String input = triangle.next();
        int x1 = Integer.parseInt(input.substring(1, 2));
        int y1 = Integer.parseInt(input.substring(3, 4));

        System.out.println("Please enter the second coordinate set. It must be in the form (x,y):");
        input = triangle.next();
        int x2 = Integer.parseInt(input.substring(1, 2));
        int y2 = Integer.parseInt(input.substring(3, 4));

        System.out.println("Please enter the third coordinate set. It must be in the form (x,y):");
        input = triangle.next();
        int x3 = Integer.parseInt(input.substring(1, 2));
        int y3 = Integer.parseInt(input.substring(3, 4)); 

        Triangle x = new Triangle();
        x.calculateSides(x1, x2, x3, y1, y2, y3);
        x.calculatePerimeter();
        x.calculateArea();

        System.out.println(x.getSides());
        System.out.println("The perimeter of the triangle is " + x.getPerimeter() + " units");
        System.out.println("The area of the triangle is " + x.getArea() + " square units");



    }

}
