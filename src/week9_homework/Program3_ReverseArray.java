package week9_homework;

/**
 * 3. Write a Java program to reverse an array of integer values.
 */
public class Program3_ReverseArray
{
    public static void main(String[] args) {
        Program3_ReverseArray obj = new Program3_ReverseArray(); // obj object created to call reverseArray()

        obj.reverseArray(); // calling reverseArray()


    }
    public void reverseArray() // declaring reverseArray()
    {

        int [] a = {10,20,30,40,50}; // array declaration
        System.out.print("Original Array : ");
        //logic to print original array
        int i=0;
        while(i<a.length)
        {
            System.out.print(a[i] + " ");
            i++;
        }
        //logic to print reverse array
        System.out.print("\nArray in Reverse order : ");
        int j=a.length-1;
        while(j>=0)
        {
            System.out.print(a[j] + " ");
            j--;
        }


    }
}
