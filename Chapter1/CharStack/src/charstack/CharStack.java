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
public class CharStack {
    
    //Fields
    protected char []stackArray;
    protected int topOfStack;
    
    
    
    //Constructor
    public CharStack(int capacity){
        stackArray = new char[capacity];
        topOfStack = -1;
    }
        
    //Methods
    public void push(char element){
        stackArray[++topOfStack]=element;
    }
    
    public char pop(){
        return stackArray[topOfStack--];
    }
    
    public char peek(){
        return stackArray[topOfStack];
    }
    public boolean isEmpty(){
        return topOfStack==-1;
    }
    public boolean isFull(){
        return topOfStack == stackArray.length-1;
    }
    /**
     * @param args the command line arguments
     */
    
}

