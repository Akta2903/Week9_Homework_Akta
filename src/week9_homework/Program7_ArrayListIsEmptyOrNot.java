package week9_homework;

import java.util.ArrayList;

/**
 * 7. Write a Java program to test if an array list is empty or not.
 */
public class Program7_ArrayListIsEmptyOrNot
{
    public static void main(String[] args) {
        Program7_ArrayListIsEmptyOrNot obj = new Program7_ArrayListIsEmptyOrNot(); // creating an object for calling isEmptyOrNot()
        obj.isEmptyOrNot(); //calling isEmptyOrNot()

    }
    public void isEmptyOrNot()
    {
        ArrayList color = new ArrayList(); // creating an ArrayList
        //Add elements or objects into color Arraylist
        color.add("Pink");
        color.add("Black");
        color.add("White");
        color.add("Red");
        color.add("Blue");
        color.add("Green");

        for (Object c :color)
        {
            System.out.println(c);
        }
        System.out.println("ArrayList is not Empty since : " + color.isEmpty()); // Checking whether the ArrayList is empty or not

    }
}
