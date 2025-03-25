package programs;

import java.util.ArrayList; 
import java.util.Scanner; 

public class ArrayListExample {  
    public static void main(String[] args){  
        Scanner sc = new Scanner(System.in);  

        // Creating an ArrayList of Object type to store different types of data
        ArrayList<Object> details = new ArrayList<>();  

        // Adding elements to the ArrayList
        details.add("John");  
        details.add(20000);  
        details.add("Developer");  

        // Printing the ArrayList
        System.out.println("Given ArrayList: " + details);  

        // Printing the size of the ArrayList
        System.out.println("Size of ArrayList: " + details.size());  

        // Removing an element (index 1)
        System.out.println("Removed element: " + details.remove(1));  

        // Getting an element (index 1)
        System.out.println("Getting element at index 1: " + details.get(1));  
    }  
}

