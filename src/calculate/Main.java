package calculate;

import java.util.Scanner;

public class Main extends Calculator
{
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in); // declaring scanner class to read the input from console
        System.out.println("Enter the first Number : ");
        int a = scan.nextInt(); // read first input
        System.out.println("Enter the second Number : ");
        int b = scan.nextInt(); // read second input
        System.out.println("Please enter one of symbol +,-,*, /:");
        char symbol=scan.next().charAt(0); // read third input

        Main obj = new Main(); // creating an object of a child class to access the properties for both the class
        obj.calculateResult(a,b,symbol); // calling an instance method from parent class

        System.out.println("Would you like to do more calculation Please enter “Y” or “N” :");
        char choice=scan.next().charAt(0); // read the input of user choice
        // code will be executed if user give the input 'y' or 'Y'
        while(choice=='y' || choice == 'Y')
        {
            System.out.println("Enter the first Number : ");
             a = scan.nextInt();// read first input
            System.out.println("Enter the second Number : ");
             b = scan.nextInt();// read second input
            System.out.println("Please enter one of symbol +,-,*, /:");
             symbol=scan.next().charAt(0);// read third input
            obj.calculateResult(a,b,symbol); // calling an instance method
            System.out.println("Would you like to do more calculation Please enter “Y” or “N” :");
             choice=scan.next().charAt(0);
        }


        scan.close(); // scan object closing
    }
}
