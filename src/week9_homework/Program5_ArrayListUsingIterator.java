package week9_homework;

import java.util.ArrayList;
import java.util.Iterator;

/**
 * 5. Write a Java program to iterate through all elements in an array list using
 * Iterater.
 */

public class Program5_ArrayListUsingIterator
{
    public static void main(String[] args) {
        Program5_ArrayListUsingIterator obj = new Program5_ArrayListUsingIterator();  // creating an object to call instance method
        obj.arrayListIterator(); // calling arrayListIterator()

    }
    public void arrayListIterator() // declaring method as an instance
    {
        ArrayList country = new ArrayList(); // creating country Arraylist
        //adding element into the arraylist
        country.add("India");
        country.add("United Kingdom");
        country.add("USA");
        country.add("Canada");
        country.add("New Zealand");
        country.add("Australia");
        country.add("France");

        Iterator countryName = country.iterator();
        while(countryName.hasNext())
        {
            System.out.println(countryName.next());
        }
    }
}
