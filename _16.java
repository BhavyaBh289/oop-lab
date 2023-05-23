import java.util.HashMap;
import java.util.Scanner;

    public class _16 {
        public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);

            System.out.print("Enter a string: ");
            String input = scanner.nextLine();

            HashMap<String, Integer> wordCountMap = countWords(input);

            System.out.println(wordCountMap);

            scanner.close();
        }

        public static HashMap<String, Integer> countWords(String input) {
            HashMap<String, Integer> wordCountMap = new HashMap<>();

            String[] words = input.split(" ");

            for (String word : words) {
                wordCountMap.put(word, wordCountMap.getOrDefault(word, 0) + 1);
            }

            return wordCountMap;
        }
}
