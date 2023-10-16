//assignment 1
import java.util.*;
public class complex {
    public static class Complex{
        double real;
        double imag;
        //default constructor
         Complex(){

        }

        //parameterised constructor
        public Complex(int r,int i){
            this.real=r;
            this.imag=i;
            System.out.println("comp 2 : "+real+" + i"+imag);
        }

    }
    static void arithmatic(Complex comp1,Complex comp2,int n){
        double real_c=0;
        double imag_c=0;



        if(n==1){
            real_c=comp1.real+comp2.real;
            imag_c=comp1.imag+comp2.imag;
            System.out.println(real_c+" + i"+imag_c);
        }
        else if(n==2){
            real_c=comp1.real-comp2.real;
            imag_c=comp1.imag-comp2.imag;
            System.out.println(real_c+" + i"+imag_c);
        }
        else if(n==3){
            real_c=((comp1.real*comp2.real)-(comp1.imag*comp2.imag));
            imag_c=((comp1.real*comp2.imag)+(comp1.imag*comp2.real));
            System.out.println(real_c+" + i"+imag_c);
        }
        else if (n==4){
            real_c=(comp1.real*comp2.real)/(Math.pow(comp2.real,2)+Math.pow(comp2.imag,2)) ;
            imag_c=(comp1.imag*comp2.real-comp1.real*comp2.imag)/(Math.pow(comp2.real,2)+Math.pow(comp2.imag,2));

            System.out.println(real_c+" + i"+imag_c);
        }

    }


    public static void main(String[] args) {
        Scanner in =new Scanner(System.in);

        Complex comp1=new Complex();
        System.out.println("Enter real no : ");
        comp1.real=in.nextInt();

        System.out.println("Enter complex no :");
        comp1.imag=in.nextInt();
        System.out.println("comp 1 : "+comp1.real+" + i"+comp1.imag);

        System.out.println("For 2nd Complex number enter real and imaginary no : ");
           Complex comp2=new Complex(in.nextInt(), in.nextInt());

        System.out.println("Enter 1 for addition , Enter 2 for Subtraction , Enter 3 for Multiplication ,Enter 4 for Division " );
        int n= in.nextInt();
        if(n<1 || n>4){
            System.out.println("you have entered wrong number " );
        }
        else {
            System.out.println("you have entered " + n);
            arithmatic(comp1, comp2, n);
        }


    }
}
