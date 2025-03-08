public class StringLongestPalindrome {
    static String longestPalindrome(String s) {
        if (s == null || s.length() < 1) {
            return "";
        }

        int n = s.length();

        int start = 0, end=n,   maxLength = 0;

        for (int i = 0; i < n; i++) {
            for (int j = i; j < n; j++) {

                // Check if the substring is a palindrome
                if (palindromeChecker(s,i,j)) {
                    // Update the longest palindrome
                    if ((j-i+1) > maxLength) {
                        maxLength = j-i+1;
                        start = i;
                        end = j;
                    }
                }
            }
        }

        // Return the longest palindromic substring
        return s.substring(start, end+1);
    }

    // Helper method to check if a string is a palindrome
    static boolean palindromeChecker(String t, int i, int j) {

        while (i<j) {
            if (t.charAt(i) != t.charAt(j)) {
                return false;
            }
            i++;
            j--;
        }
        return true;
    }
}
