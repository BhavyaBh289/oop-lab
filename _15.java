import java.util.ArrayList;
import java.util.Iterator;

    public class _15 {
        public static void main(String[] args) {
            ArrayList<Integer> numbers = new ArrayList<>();
            numbers.add(20);
            numbers.add(30);
            numbers.add(40);

            System.out.println("Iterator Loop:");
            iterateUsingIterator(numbers);

            System.out.println("\nAdvanced For Loop:");
            iterateUsingAdvancedForLoop(numbers);

            System.out.println("\nFor Loop:");
            iterateUsingForLoop(numbers);
        }

        public static void iterateUsingIterator(ArrayList<Integer> numbers) {
            Iterator<Integer> iterator = numbers.iterator();

            while (iterator.hasNext()) {
                int number = iterator.next();
                System.out.println(number);
            }
        }

        public static void iterateUsingAdvancedForLoop(ArrayList<Integer> numbers) {
            for (int number : numbers) {
                System.out.println(number);
            }
        }

        public static void iterateUsingForLoop(ArrayList<Integer> numbers) {
            for (int i = 0; i < numbers.size(); i++) {
                int number = numbers.get(i);
                System.out.println(number);
            }
        }

}
