package gic.i4.TP09_01;

public class RectangleTest extends Rectangle {
    //Constructor
    RectangleTest(int width, int height) {
        super(width, height); //Keyword super user to declair the value of the variable in super class
    }

    public static void main(String[] args) {
        RectangleTest rectangleTest = new RectangleTest(10, 5);
        System.out.println("The perimeter of rectangle is: "+ rectangleTest.calculatePerimeter());
        System.out.println("The surface of rectangle is: "+ rectangleTest.calculateSurface());

    }
}
