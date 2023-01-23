public class ValidPalindrome {
    public static void main(String[] args) {
        System.out.println(isPalindrome("A man, a plan, a canal: Panama")); // true
        System.out.println(isPalindrome("race a car")); // false;
    }

//    A phrase is a palindrome if, after converting all uppercase letters into lowercase letters and removing all non-alphanumeric characters,
//    it reads the same forward and backward. Alphanumeric characters include letters and numbers.
//    Given a string s, return true if it is a palindrome, or false otherwise.

    static boolean isPalindrome(String text) {
        //create two pointers, left and right to iterate through text
        int left = 0;
        int right = text.length() - 1;
        //while char is not a letter, increment/decrement pointers
        while(left < right) {
            while(left < right && !Character.isLetterOrDigit(text.charAt(left))) {
                left++;
            }
            while(left < right && !Character.isLetterOrDigit(text.charAt(right))) {
                right--;
            }
            //check if chars are equal and return false if not
            Character start = Character.toLowerCase(text.charAt(left));
            Character end = Character.toLowerCase(text.charAt(right));

            if(!start.equals(end)) return false;
            //increment/decrement pointers
            left++;
            right--;
        }
        //return true outside the loop
        return true;
    }
}
