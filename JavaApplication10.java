/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication10;

/**
 *
 * @author User
 */
public class JavaApplication10 {

    /**
     * @param args the command line arguments
     */
    static int f(int x){
        if(x==1 || x==2)
            return 1;
        else
            return f(x-1)+f(x-2);
        
    }
    
    
    public static void main(String[] args) {
        
        for(int i=1;i<10;i++){
        System.out.println(f(i));
        }
    
    }
}