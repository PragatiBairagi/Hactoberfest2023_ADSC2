import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class FileReadWriteExample {
    public static void main(String[] args) {
        // Define the file paths
        String inputFile = "input.txt";
        String outputFile = "output.txt";

        // Read from the input file and write to the output file
        try (BufferedReader reader = new BufferedReader(new FileReader(inputFile));
             BufferedWriter writer = new BufferedWriter(new FileWriter(outputFile)) {

            String line;
            while ((line = reader.readLine()) != null) {
                // Process the line (e.g., manipulate or transform it)
                // For this example, we'll just write it to the output file
                writer.write(line);
                writer.newLine(); // Add a newline for each line
            }

            System.out.println("File read and write completed successfully.");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
