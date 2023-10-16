import java.util.Scanner;

//creating a class named Publication
class Publication
{
    //defining the variables
    String title;
    int price, copies;

    //Function to print sale Copy
    int saleCopy()
    {
        System.out.println("Total Sale of Publication is " + (price * copies));
        return price * copies;
    }
}

//class book inherits from parent class Publication
class Book extends Publication
{
    String author;

    //Function to order copies of book
    void orderCopies()
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("&quot;Enter title of the Book:");
        title = sc.nextLine();
        System.out.println("Enter name of the Author:");

        author = sc.nextLine();
        System.out.println("&quot;Enter Price:&quot;");
        price = sc.nextInt();
        System.out.println("Enter number of Copies: ");
        copies = sc.nextInt();
    }

    int saleCopy()
    {
        return copies * price;
    }

    //Function to display details of book
    void display()
    {
        System.out.println("BOOK DETAILS");
        System.out.println("Title: " + title);
        System.out.println("Author: " + author);
        System.out.println("Price per Copy: " + price +" /-");
        System.out.println("No. of Copies: " + copies );
        System.out.println("-----------------");
    }
}

//class Magazine inherits from parent class Publication
class Magazine extends Publication
{
    int current_issue;

    // //Function to order copies of magzine
    void receiveIssue()
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter title of the Magazine: ");
        title = sc.nextLine();
        System.out.println("Enter Current Issue No : ");
        current_issue = sc.nextInt();
        System.out.println("Enter Price: ");
        price = sc.nextInt();
        System.out.println("Enter number of Copies: ");
        copies = sc.nextInt();
    }

    int saleCopy()
    {
        return copies * price;
    }

    //function to display
    void display(){
        System.out.println("MAGAZINE DETAILS ");
        System.out.println("Title: " + title);
        System.out.println("Issue No : " + current_issue);
        System.out.println("Price per Copy: " + price + "/-");
        System.out.println("No. of Copies: " + copies );
        System.out.println("-----------------");
    }
}

public class assignment2
{
    public static void main(String[] args)
    {
//object creation of class book
        Book b1 = new Book();
        b1.orderCopies();
        b1.display();
        System.out.println("Total Sale of Books is " + b1.saleCopy() + " /-");
        System.out.println();

//object creation of class magzine
        Magazine m1 = new Magazine();
        m1.receiveIssue();
        m1.display();
        System.out.println("Total Sale of Magazine is " + m1.saleCopy() + "/-");
        System.out.println();

        System.out.println("Total Sale of Publication is &quot;" + (b1.saleCopy() + m1.saleCopy()) + "/-");
    }
}
