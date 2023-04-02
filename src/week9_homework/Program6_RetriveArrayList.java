package week9_homework;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.Scanner;

public class Program6_RetriveArrayList {
    public static void main(String[] args) // declaring main method
    {
        Program6_RetriveArrayList obj = new Program6_RetriveArrayList(); // creating an object to call retriveFromArrayList()
        obj.retriveFromArrayList(); // calling retriveFromArrayList()

    }

    public void retriveFromArrayList() // declaring retriveFromArrayList() as an instance method
    {
        ArrayList<String> country = new ArrayList<>();
        //adding element to  country Array list
        country.add("India");
        country.add("United Kingdom");
        country.add("USA");
        country.add("Canada");
        country.add("New Zealand");
        country.add("Australia");
        country.add("France");
        country.add("Germany");
        country.add("Sri Lanka");
        country.add("Poland");
        country.add("Nepal");

        Iterator <String> countryName = country.iterator();
            while(countryName.hasNext())
            {
                System.out.println(countryName.next());
        }

        Scanner scan = new Scanner(System.in); // to read the input from the console
        System.out.println("Please enter the index of which data you want to get : ");
            int index = scan.nextInt(); // input the index number
        System.out.println("The value at " +  index  + " index is : "  + country.get(index)); // retrieving element at given index from ArraList
       // System.out.println("The value at 3rd index : " + country.get(3));
        //System.out.println("The value at 0 index : " + country.get(0));
        scan.close();


    }
}