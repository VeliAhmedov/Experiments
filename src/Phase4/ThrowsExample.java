package Phase4;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class ThrowsExample {
    private String firstName, lastName;

    public void accept() throws IOException {
        // Reading data from keyboard.
        // Creating an object of InputStreamReader class.
        InputStreamReader sr = new InputStreamReader(System.in);

        // Creating an object of BufferedReader class.
        BufferedReader br = new BufferedReader(sr);

        System.out.println("Enter your first name");
        firstName = br.readLine();
        System.out.println("Enter your last name");
        lastName = br.readLine();
    }

    public void display() {
        System.out.println("Full Name: " + firstName + " " + lastName);
    }
}
