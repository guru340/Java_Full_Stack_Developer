package Exceptionhandling;

public class NullPointer {
    public static void main(String[] args) {
//        String s=null;
//        try {
//            int len=s.length();
//
//        }catch (NullPointerException e){
//            System.out.println(e.toString());
//        }finally {
//            System.out.println("It Gives the Null Pointer Exception");
//        }

        try{
            try{
                int a=10/0;
            }catch(NullPointerException e){
                System.out.println("Inner Exception");
            }

        }catch (Exception e){
            System.out.println("Outer Exception");
        }
    }
}
