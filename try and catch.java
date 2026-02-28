public class MultipleCatch {
    public static void main(String[] args) {
        try {
            String numStr = "abc";
            int num = Integer.parseInt(numStr); // NumberFormatException
            int result = 10 / num; // ArithmeticException (kung num = 0)
        } catch (ArithmeticException e) {
            System.out.println("Division error: " + e.getMessage());
        } catch (NumberFormatException e) {
            System.out.println("Invalid number: " + e.getMessage()); // Output dito
        }
    }
}

import java.util.Scanner;
import java.util.InputMismatchException;

public class TryCatchFinally {
    public static void main(String[] args) {
        Scanner scanner = null;
        try {
            scanner = new Scanner(System.in);
            System.out.print("Enter a number: ");
            int num = scanner.nextInt(); // InputMismatchException kung hindi integer
            System.out.println("Number: " + num);
        } catch (InputMismatchException e) {
            System.out.println("Invalid input: " + e.getMessage());
        } finally {
            // Laging tatakbo ito
            if (scanner != null) {
                scanner.close();
                System.out.println("Scanner closed.");
            }
        }
    }
}

public class NestedTryCatch {
    public static void main(String[] args) {
        try {
            int[] arr = {1, 2, 3};
            try {
                System.out.println(arr[5]); // ArrayIndexOutOfBoundsException (inner)
            } catch (ArrayIndexOutOfBoundsException e) {
                System.out.println("Inner error: " + e.getMessage()); // Output: Index 5 out of bounds
            }
            int result = 10 / 0; // ArithmeticException (outer)
        } catch (ArithmeticException e) {
            System.out.println("Outer error: " + e.getMessage()); // Output: / by zero
        }
    }
}

import java.io.FileReader;
import java.io.FileNotFoundException;
import java.io.IOException;

public class TryWithResources {
    public static void main(String[] args) {
        // Resources dito auto-close after try block
        try (FileReader reader = new FileReader("example.txt")) {
            int data = reader.read();
            while (data != -1) {
                System.out.print((char) data); // Basahin ang file
                data = reader.read();
            }
        } catch (FileNotFoundException e) {
            System.out.println("File not found: " + e.getMessage());
        } catch (IOException e) {
            System.out.println("IO error: " + e.getMessage());
        }
    }
}


		
	
