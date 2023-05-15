/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package maths;

/**
 *
 * @author S2026015
 */
//Class  name is Maths      
public class Maths {
    
    //declare consstructor 
    //this is default constructor, doesnt take any parameter
//    public Maths(){
//        //System is class and out is object and prinln() is a method 
//        System.out.println("I am a constructor");
//    }
    
    public static void sum(int a, int b){
        int result = a + b;
        System.out.println("Sum is " + result);
    }
    /**
     * @param args the command line arguments
     */
    //public static  void is a method signature 
    public static void main(String[] args) {
        // TODO code application logic here
        //the below code is a statement
//        System.out.println("I am main method");
//        //instatiate Maths class 
//        Maths obj1 = new Maths();
        sum(10, 30);
    }
    
}
