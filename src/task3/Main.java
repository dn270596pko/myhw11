package task3;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        String[] arr = {"1, 2, 0", "4, 5"};
        String sortedNums = sortNumbers(arr);
        System.out.println(sortedNums);
    }

    public static String sortNumbers(String[] arr) {

        String str = String.join(",", arr);

        String[] nums = str.split(",");

        int[] intNums = new int[nums.length];
        for (int i = 0; i < nums.length; i++) {
            intNums[i] = Integer.parseInt(nums[i].trim());
        }

        Arrays.sort(intNums);

        String sortedNums = String.join(", ", Arrays.toString(intNums)
                .replaceAll("\\[|\\]|\\s", ""));
        return sortedNums;
    }
}

