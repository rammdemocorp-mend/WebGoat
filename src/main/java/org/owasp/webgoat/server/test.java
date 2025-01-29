import java.io.*;
import java.nio.file.*;

public class PathTraversalDemo {
    public static void main(String[] args) {
        System.out.println("Hello, World!");

        // Simulating user input (normally, this would come from user input like a web request)
        String userInput = "../../etc/passwd";  // Simulated malicious input

        // Construct the file path
        File file = new File("uploads/" + userInput);

        try {
            // Read file content
            String content = new String(Files.readAllBytes(file.toPath()));
            System.out.println("File Content:\n" + content);
        } catch (IOException e) {
            System.out.println("Error reading file: " + e.getMessage());
        }
    }
}
