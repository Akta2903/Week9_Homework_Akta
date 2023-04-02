package week9_homework;

import java.util.ArrayList;

/**
 * 4. Write a Java program to create a new array list, add some colours (string) and
 * printout the collection using for each loop.
 */

public class Program4_ArrayList_Color
{
    public static void main(String[] args) {
    Program4_ArrayList_Color obj = new Program4_ArrayList_Color(); // obj object created to call getColor()
    obj.getColor(); // calling getColor()

    }
    public void getColor() // declaring getColor() as an instance method
    {
        ArrayList<String> color = new ArrayList(); // creating a collection or Arraylist
        //Add elements or objects into color Arraylist
        color.add("Pink");
        color.add("Black");
        color.add("White");
        color.add("Red");
        color.add("Blue");
        color.add("Green");
        for (String c:color)
        {
            System.out.println(c);
        }


    }
}
