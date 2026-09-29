// 3. Create a class named ColoredPoint inheriting the base class Point. Base class Point have its own
// coordinate value X and Y. ColoredPoint, which is a subclass of Point have its own personal property
// Color. The subclass also have own method for changeColor. Display the information of the Point
// with coordinate values and changed color values.
class Point{

    int x;
    int y;
    Point(int x, int y){
        this.x = x;
        this.y = y;
    }
    void display(){
        System.out.println("X: "+x);
        System.out.println("Y: "+y);
    }
    
}
class ColoredPoint extends Point{
    String color;

    ColoredPoint(int x, int y, String color){
        super(x, y);
        this.color = color;
    }

    void changeColor(String newColor){
        color = newColor;
    }
    void display(){
        System.out.println("X = " + x);
        System.out.println("Y = " + y);
        System.out.println("Color = " + color);
    }
}

class ColoredPrintDemo{
    public static void main(String[] args){
        ColoredPoint p = new ColoredPoint(5, 6, "orange");
        p.display();
        p.changeColor("red");
        p.display();
    }
}
