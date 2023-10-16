import java.util.*;

abstract class Shape{

    static   Scanner in =new Scanner(System.in);
    double a;
    double b;

    public abstract void  calculate_area();


}

//assume that given triangle is right angle triangle
class Triangle extends Shape{

   public  void input_data(){

       System.out.print("Enter length of triangle : ");
        double length=in.nextDouble();

       System.out.print("Enter height of triangle : ");
        double height=in.nextDouble();



        this.a=length;
        this.b=height;


    }

    public void calculate_area(){

        double area=0.5*a*b;
        System.out.println("Area of triangle is : "+area );
    }



}


class Rectangle extends Shape{


   public  void input_data(){

       System.out.print("Enter length of Rectangle : ");
        double length=in.nextDouble();


       System.out.print("Enter breadth of Rectangle : ");
        double breadth=in.nextDouble();

        this.a=length;
        this.b=breadth;




    };

    public void calculate_area(){

        double area=a*b;
        System.out.println("Area of rectangle is : "+area );
    }

}

public class ass4 {

    public static void main(String[] args) {

        Triangle t=new Triangle();
        t.input_data();
        t.calculate_area();

        System.out.println();

        Rectangle r=new Rectangle();
        r.input_data();
        r.calculate_area();



       


    }
}
