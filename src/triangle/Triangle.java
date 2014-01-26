package triangle;

public class Triangle 

{
//Instance Field
private double side1; //Side 1 of triangle
private double side2; //Side 2 of triangle 
private double side3; //Side 3 of triangle 
private double roundedSide1; //Side 1 of triangle rounded to nearest tenth
private double roundedSide2; //Side 2 of triangle rounded to nearest tenth
private double roundedSide3; //Side 3 of triangle rounded to nearest tenth
private double area; //Area of triangle
private double perimeter; //Perimeter of triangle
private double semiPerimeter; //Semiperimeter of triangle
private double roundedPerimeter; //Perimeter of triangle rounded to nearest tenth

    public Triangle() //Constructor
    {
        
    }
    
    public void calculateSides(int x1, int x2, int x3, int y1, int y2, int y3) //This mutator finds the distance between the points to find the length of the triangle's sides.
    {
        side1 = Math.sqrt(Math.pow(x2-x1, 2) + Math.pow(y2-y1, 2)); //This calculates the distance between integers (x1, y1) and (x2, y2)
        side2 = Math.sqrt(Math.pow(x3-x2, 2) + Math.pow(y3-y2, 2));//This calculates the distance between integers (x3, y3) and (x2, y2)
        side3 = Math.sqrt(Math.pow(x3-x1, 2) + Math.pow(y3-y1, 2));//This calculates the distance between integers (x3, y3) and (x1, y1)
        roundedSide1 = ((Math.round(side1 * 10)) / 10.0); //Rounds side 1 to the nearest tenth
        roundedSide2 = ((Math.round(side2 * 10)) / 10.0); //Rounds side 1 to the nearest tenth
        roundedSide3 = ((Math.round(side3 * 10)) / 10.0); //Rounds side 1 to the nearest tenth
    }
    
    public void calculatePerimeter() //This mutator calculates the perimeter of the triangle given the sides of the triangle
    {
        perimeter = side1 + side2 + side3; //Adds three side to find perimeter
        roundedPerimeter = ((Math.round(perimeter * 10)) /10.0); //Rounds perimeter to nearest tenth
        semiPerimeter = perimeter/2; //Finds the semiperimeter of the triangle
        
    }
            
    public void calculateArea() //This mutator calculates the area of the triangle. The area is found using Hero's formula.
    {
         
        area = Math.sqrt(semiPerimeter * (semiPerimeter - side1) * (semiPerimeter - side2) * (semiPerimeter - side3)); //Calculates the area using Hero's formula with perviously calculated semiperimeter
    }
    
    public String getSides() //This accessor returns the sides of the triangle rounded to the nearest tenth
    {
      return "The lengths of the sides of the triangle are " + 
              roundedSide1 + " units, " + roundedSide2 + " units, and " + roundedSide3 + " units";   
    }
    
 
    public double getPerimeter() //returns perimeter rounded to nearest tenth
    {
        return roundedPerimeter; 
    }
    
    public double getArea() //returns the area
    {
        return area; 
    }
    
}
