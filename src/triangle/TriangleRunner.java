package triangle;
import java.util.Scanner; //Imports Scanner Class

public class TriangleRunner 
{
    
    public static void main(String[] args) 
    {
        Scanner triangle = new Scanner(System.in); //New instance of scanner class
                
        System.out.println("Please enter the first coordinate set. It must be in the form (x,y):"); //
        String input = triangle.next(); //Reads the line of text and assigns it to String input
        int x1 = Integer.parseInt(input.substring(1, 2)); //Uses substring to get x1 and uses parseInt to turn into Integer variable
        int y1 = Integer.parseInt(input.substring(3, 4)); //Uses substring to get y1 and uses parseInt to turn into Integer variable
    
        System.out.println("Please enter the second coordinate set. It must be in the form (x,y):");
        input = triangle.next(); //Reads the line of text and assigns it to String input
        int x2 = Integer.parseInt(input.substring(1, 2)); //Uses substring to get x2 and uses parseInt to turn into Integer variable
        int y2 = Integer.parseInt(input.substring(3, 4)); //Uses substring to get y2 and uses parseInt to turn into Integer variable
               
        System.out.println("Please enter the third coordinate set. It must be in the form (x,y):");
        input = triangle.next(); //Reads the line of text and assigns it to String input
        int x3 = Integer.parseInt(input.substring(1, 2)); //Uses substring to get x3 and uses parseInt to turn into Integer variable
        int y3 = Integer.parseInt(input.substring(3, 4)); //Uses substring to get y3 and uses parseInt to turn into Integer variable
        
        
        Triangle x = new Triangle(); //Creates new instance of class Triangle
        x.calculateSides(x1, x2, x3, y1, y2, y3); //Inputs points x1, x2, etc. This will calculate the sides with these points.
        x.calculatePerimeter(); //This will calculate triangle
        x.calculateArea(); //This will calculate area of triangle
        
        
        System.out.println(x.getSides()); //Prints the side lengths to the nearest tenth
        System.out.println("The perimeter of the triangle is " + x.getPerimeter() + " units"); //Prints the perimeter of the triangle to the nearest tenth
        System.out.println("The area of the triangle is " + x.getArea() + " square units"); //Prints the area of the triangle
  
        
        
    }

}
