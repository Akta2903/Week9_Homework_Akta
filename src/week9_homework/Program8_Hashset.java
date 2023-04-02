package week9_homework;

import java.util.HashSet;

/**
 * 8. Use a HashSet that stores Integer Objects. Store the number 4, 7 and 8 to Sets.
 * Show which numbers between 1 and 10 are in the set. (Hint: use for loop and if
 * else)
 */

public class Program8_Hashset
{
    public static void main(String[] args)
    {
      Program8_Hashset obj = new Program8_Hashset(); //creating an object to call numberContainsInHashSet()
      obj.numberContainsInHashSet(); // calling numberContainsInHashSet()

    }
    public void numberContainsInHashSet() // declaring method as an instance
    {
        HashSet<Integer> number = new HashSet<>(); // creating Hashset
        number.add(4); // adding element to hashset
        number.add(7);
        number.add(8);
        number.add(11);
         number.add(10);
        System.out.println("Numbers in Hashset between 1 - 10 are : ");
        for (Integer n:number)
        {
            if(n>=1 && n<=10)
            {
                System.out.print(n + " , "); // out put
            }
        }
    }


}
