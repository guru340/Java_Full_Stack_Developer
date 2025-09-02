package Exceptionhandling;

import java.io.FileNotFoundException;
import java.io.FileReader;

public class CheckedDemo {
    public static void main(String[] args) throws FileNotFoundException {
        FileReader file = new FileReader("genie.txt");
    }
    }
