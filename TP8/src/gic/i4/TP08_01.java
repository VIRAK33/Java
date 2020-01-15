package gic.i4;

//Circle


class Point{
    int x, y;
    Point(){
    };
    Point(int x){
        this.x = x;
    };
    Point(int x, int y){
        this.x = x;
        this.y = y;
    };

    double distance(Point another) {
        double distance = 0;
        distance = Math.sqrt(Math.pow(another.x - x, 2) + Math.pow(another.y -y,2));
        return distance;

    }
}


class Circle{
    Point center = new Point();
    Point p = new Point();

    Circle(Point _center, Point p) {
        this.center = _center;
        this.p = p;
    }
    double length() {
        double length = 2*3.14* p.distance(center);
        return length;

    }
    double surface() {
        double surface = Math.pow(p.distance(center),2) * 3.14 ;
        return surface;

    }
    double radius() {
        return p.distance(center);

    }

}

public class TP08_01 {
    public static void main(String[] args){
        Point p1 = new Point();
        p1.x = 0;
        p1.y = 0;

        Point p2 = new Point();
        p2.x = 1;
        p2.y = 0;

        Circle c1 = new Circle(p1,p2);


        double distance = p1.distance(p2);

        System.out.printf("\nDistance between p1(%d,%d) and p2(%d,%d) is: %f",
                p1.x, p1.y, p2.x, p2.y, distance);

        System.out.println("\n\nLength of circle: " + c1.length());
        System.out.println("\nSurface of circle: " + c1.surface());
        System.out.println("\nRadius  of circle: " + c1.radius());

    }


}



