package Exceptionhandling;

import org.w3c.dom.ls.LSOutput;

public class ArthimeticException {
    public static void main(String[] args) {
        System.out.println("ArithmeticExcception");

        try{
            int a=10/0;
        }catch (Exception e){
            System.out.println(e.toString());
        }
    }
}
