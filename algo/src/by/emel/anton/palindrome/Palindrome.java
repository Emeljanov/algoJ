package by.emel.anton.palindrome;

public class Palindrome {
    public static boolean isPalindrome(String line) {
        char[] array = line.toCharArray();
        int length = array.length;
        int j = length - 1;

        for (int i = 0; i <= length / 2; i++) {
            if (array[i] != array[j - i]) return false;
        }
        return true;
    }
}
