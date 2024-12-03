/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package charstack;

/**
 *
 * @author markv
 */
public class PrintableCharStack extends CharStack {
    
    
    public PrintableCharStack(int capacity){
        super(capacity);
    }
    
    public void printStackElements(){
        for (int i = 0; i <= topOfStack; i++)
        System.out.print(stackArray[i]); // Print each char on terminal
        System.out.println();
    }
    
}
