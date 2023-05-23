import java.util.HashSet;

public class _23 {
    public static int longestConsecutive(int[] nums) {
        HashSet<Integer> set = new HashSet<>();
        int maxLength = 0;

        // Add all elements to the set
        for (int num : nums) {
            set.add(num);
        }

        // Check for consecutive sequences
        for (int num : nums) {
            if (!set.contains(num - 1)) { // Start of a sequence
                int currentNum = num;
                int currentLength = 1;

                while (set.contains(currentNum + 1)) { // Increment until sequence ends
                    currentNum += 1;
                    currentLength += 1;
                }

                maxLength = Math.max(maxLength, currentLength); // Update max length
            }
        }

        return maxLength;
    }

    public static void main(String[] args) {
        int[] nums = {49, 1, 3, 200, 2, 4, 70, 5};

        int length = longestConsecutive(nums);
        System.out.println("Length of the longest consecutive sequence: " + length);
    }
}
