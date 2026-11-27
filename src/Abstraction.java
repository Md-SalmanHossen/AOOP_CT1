abstract class Shape{
    abstract void area();
}

class Rectangle extends Shape{
    double length,width;
    Rectangle(double length,double width){
        this.length=length;
        this.width=width;
    }

    @Override
    void area() {
        double result=length*width;
        System.out.println("Rectangle area: "+result);
    }
}

class Circle extends Shape{
    double radius;
    Circle(double radius){
        this.radius=radius;
    }
    double result=3.14*radius*radius;
    @Override
    void area(){
        System.out.println("circle area: "+result);
    }
}

public class Abstraction {
    public static void main(String[] args) {
        System.out.println("====Practice Abstraction=====");

        Shape rect=new Rectangle(4,3);
        rect.area();

        Shape circle=new Circle(3.0);
        circle.area();

    }
}
