/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package test;

import javax.swing.JOptionPane;

/**
 *
 * @author Ale
 */
public class Test {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Test t = new Test();
        //System.out.println(t.factorial(4));
        System.out.println(t.reverseString("Prueba"));
        String a = "";
        a=JOptionPane.showInputDialog("Hello");
    }
    
    int[] name = {1,2,3,4,6,7,2};
    
    public int factorial(int n){
        if(n==0){ return 1; }
        return (n*factorial(n-1));
    }
    
    public String reverseString(String a) {
        String b = "";
        int c = a.length();
        for(int i = a.length()-1; i >= 0; i--){
            b = b+a.charAt(i);
        }
        return b;
    }
}
