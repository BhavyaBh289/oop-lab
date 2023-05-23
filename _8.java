import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;

public class _8 {

    public static void main(String[] args) {
        String filename = "data.txt"; // Replace with your file path

        try {
            Map<String, String> hashMap = readFileToHashMap(filename);

            // Print the entries in the HashMap
            for (Map.Entry<String, String> entry : hashMap.entrySet()) {
                System.out.println("Key: " + entry.getKey() + ", Value: " + entry.getValue());
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public static Map<String, String> readFileToHashMap(String filename) throws IOException {
        Map<String, String> hashMap = new HashMap<>();

        try (BufferedReader reader = new BufferedReader(new FileReader(filename))) {
            String line;
            while ((line = reader.readLine()) != null) {
                // Assuming the file has key-value pairs separated by a delimiter (e.g., comma)
                String[] parts = line.split(",");

                if (parts.length == 2) {
                    String key = parts[0].trim();
                    String value = parts[1].trim();

                    hashMap.put(key, value);
                }
            }
        }

        return hashMap;
    }
}
