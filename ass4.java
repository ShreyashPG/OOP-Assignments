import java.util.Scanner;

abstract class Shape{

    Scanner in =new Scanner(System.in);
    double a;
    double b;

    abstract void  calculate_area();
    abstract void input_details();

}

//assume that given triangle is right angle triangle
class Triangle extends Shape{

    void input_details(){

        System.out.print("Enter base of triangle : ");
        double length=in.nextDouble();

        System.out.print("Enter height of triangle : ");
        double height=in.nextDouble();

        this.a = length;
        this.b = height;
    }

     void calculate_area(){

        double area = 0.5 * a * b;
        System.out.println("Area of triangle is : "+area  );
    }

}

class Rectangle extends Shape {

    void input_details() {

        System.out.print("Enter length of Rectangle : ");
        double length = in.nextDouble();

        System.out.print("Enter breadth of Rectangle : ");
        double breadth = in.nextDouble();

        this.a = length;
        this.b = breadth;

    }

    void calculate_area() {

        double area = a * b;
        System.out.println("Area of rectangle :" + area);
    }
}

public class mock {
    public static void main (String[] args){

        Shape t = new Triangle();
        t.input_details();
        t.calculate_area();
          t = new Rectangle();

        t.input_details();
        t.calculate_area();
        System.out.println();
    }
}



