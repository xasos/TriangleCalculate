package triangle;

public class Triangle

{

private double side1;
private double side2;
private double side3;
private double roundedSide1;
private double roundedSide2;
private double roundedSide3;
private double area;
private double perimeter;
private double semiPerimeter;
private double roundedPerimeter;

    public Triangle()
    {

    }

    public void calculateSides(int x1, int x2, int x3, int y1, int y2, int y3)
    {
        side1 = Math.sqrt(Math.pow(x2-x1, 2) + Math.pow(y2-y1, 2));
        side2 = Math.sqrt(Math.pow(x3-x2, 2) + Math.pow(y3-y2, 2));
        side3 = Math.sqrt(Math.pow(x3-x1, 2) + Math.pow(y3-y1, 2));
        roundedSide1 = ((Math.round(side1 * 10)) / 10.0);
        roundedSide2 = ((Math.round(side2 * 10)) / 10.0);
        roundedSide3 = ((Math.round(side3 * 10)) / 10.0);
    }

    public void calculatePerimeter()
    {
        perimeter = side1 + side2 + side3;
        roundedPerimeter = ((Math.round(perimeter * 10)) /10.0);
        semiPerimeter = perimeter/2;

    }

    public void calculateArea()
    {
        area = Math.sqrt(semiPerimeter * (semiPerimeter - side1) * (semiPerimeter - side2) * (semiPerimeter - side3)); //Calculates the area using Hero's formula with perviously calculated semiperimeter
    }

    public String getSides() //This accessor returns the sides of the triangle rounded to the nearest tenth
    {
      return "The lengths of the sides of the triangle are " +
              roundedSide1 + " units, " + roundedSide2 + " units, and " + roundedSide3 + " units";
    }


    public double getPerimeter()
    {
        return roundedPerimeter;
    }

    public double getArea()
    {
        return area;
    }

}
