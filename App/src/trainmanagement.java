import java.util.*;

// Main Class
public class trainmanagement {

    public static void main(String[] args) {

        // Welcome message
        System.out.println("=== Train Consist Management App ===");
        System.out.println(" ");

        // Initialize empty consist (List of bogies)
        List<String> consist = new ArrayList<>();

        // Display initial bogie count
        System.out.println("Train consist initialized.");
        System.out.println("Initial number of bogies: " + consist.size());
    }
}