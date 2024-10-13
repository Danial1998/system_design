import java.io.File;
import java.io.IOException;
import java.io.RandomAccessFile;
import java.util.LinkedList;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.LinkedList;

public class TailN {

    /**
     * Returns the last n lines of a file.
     *
     * @param file The file to read from.
     * @param n    The number of lines to return.
     * @return A LinkedList containing the last n lines.
     * @throws IOException If an I/O error occurs.
     */
//    public static LinkedList<String> tailNLines(File file, int n) throws IOException {
//        LinkedList<String> result = new LinkedList<>(); // To store the last n lines
//        RandomAccessFile raf = new RandomAccessFile(file, "r"); // Open the file for reading
//        long fileLength = file.length(); // Get the file length
//        long filePointer = fileLength - 1; // Start from the end of the file
//        int linesCount = 0; // Count of lines read
//        StringBuilder currentLine = new StringBuilder(); // To construct the current line
//
//        // Read from the end of the file until we have n lines or reach the beginning
//        while (filePointer >= 0 && linesCount < n) {
//            raf.seek(filePointer); // Move the pointer to the current position
//            char c = (char) raf.readByte(); // Read a byte
//
//            // Check for a newline character
//            if (c == '\n') {
//                if (currentLine.length() > 0) {
//                    // Add the current line to the result and clear it
//                    result.addFirst(currentLine.reverse().toString());
//                    currentLine.setLength(0); // Clear the StringBuilder for the next line
//                    linesCount++;
//                }
//            } else {
//                currentLine.append(c); // Append characters in reverse order
//            }
//
//            filePointer--; // Move the pointer backwards
//        }
//
//        // Handle the case where the last line may not end with a newline
//        if (currentLine.length() > 0) {
//            result.addFirst(currentLine.reverse().toString()); // Add the last line
//        }
//
//        raf.close(); // Close the file
//        return result; // Return the last n lines
//    }

    public static LinkedList<String> tailNLines(File file, int n) throws IOException {
        LinkedList<String> result = new LinkedList<>();

        try (BufferedReader reader = new BufferedReader(new FileReader(file))) {
            String line;
            int totalLines = 0;

            // Read all lines and keep track of the last n lines
            while ((line = reader.readLine()) != null) {
                if (totalLines < n) {
                    result.add(line);
                } else {
                    result.removeFirst(); // Remove the oldest line when exceeding n
                    result.add(line); // Add the new line
                }
                totalLines++;
            }
        }

        return result;
    }

    public static void main(String[] args) {
        File file = new File("/Users/dbarbhui/Documents/optumwarehouse/system_design/lld/tail_n_command/src/main/java/test.txt"); // Specify the file name
        int n = 10; // Number of lines to print

        try {
            LinkedList<String> lastNLines = tailNLines(file, n); // Get last n lines
            for (String line : lastNLines) {
                System.out.println(line); // Print each line
            }
        } catch (IOException e) {
            System.err.println("Error reading the file: " + e.getMessage()); // Handle exceptions
        }
    }
}
