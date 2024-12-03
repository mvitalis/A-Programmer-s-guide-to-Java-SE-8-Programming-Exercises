/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package charstack;
import java.util.*;
import java.lang.*;
/**
 *
 * @author markv
 */
public class Client {
    
    public static void main(String[] args) {
        // Create a stack.
        
        PrintableCharStack pcstack = new PrintableCharStack(40);
        
        // Create a string to push on the stack:
        String str = "!no tis ot nuf era skcatS";
        System.out.println("Original string: " + str); 
        int length = str.length();
        // Push the string char by char onto the stack
        for (int i = 0; i < length; i++) {
            pcstack.push(str.charAt(i));
        }
        System.out.print("Reversed string: "); // (2)
        // Pop and print each char from the stack:
        while (!pcstack.isEmpty()) { // Check if the stack is not empty.
            System.out.print(pcstack.pop());
        }
        System.out.println(); // (3)
}
    
}
