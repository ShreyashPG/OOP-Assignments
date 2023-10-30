//Problem Statement: Implement a program to handle Arithmetic exception, Array Index Out Of Bounds. The
//        user enters two numbers Num1 and Num2. The division of Num1 and Num2 is displayed. If Num1 and Num2
//        were not integers, the program would throw a Number Format Exception. If Num2 were zero, the program
//        would throw an Arithmetic Exception. Display the exception


import java.util.*;
import java.lang.*;

public class ASS6 {

    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);

    int x=in.nextInt();
    int y=in.nextInt();

    //Arithematic Exception occurs when a number is divded by zero
        try {
            int z=y/x;
        }
        catch(ArithmeticException e){
            e.printStackTrace();
        }

//        finally{
//            System.out.println("Any number cannot be divided by zero");
//        }

        int arr[]={1,2,3,4,5};

        //Array  index out of bound
try {
    System.out.println(arr[5]);

}
catch(ArrayIndexOutOfBoundsException e){
    e.printStackTrace();
    throw new ArrayIndexOutOfBoundsException("Index 5 out of bound");
    //e.getMessage();
}

        System.out.println("Enter num1");
        int num1 = in.nextInt();
        System.out.println("Enter num2");
        int num2 = in.nextInt();
try {
   int div=num1/num2;


}
catch(NumberFormatException x1){
    x1.printStackTrace();
}
    }
}
