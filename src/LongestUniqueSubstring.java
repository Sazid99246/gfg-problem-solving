public class LongestUniqueSubstring {
    public int longestUniqueSubstr(String s) {
        // code here
        if(s.length() == 0 || s == null) return 0;

        java.util.Set<Character> set = new java.util.HashSet<>();

        int maxLength = 0, start = 0;

        for(int end = 0; end < s.length(); end++) {
            while(set.contains(s.charAt(end))) {
                set.remove(s.charAt(start));
                start++;
            }
            set.add(s.charAt(end));

            maxLength = Math.max(maxLength, end - start + 1);
        }

        return maxLength;
    }

    public static void main(String[] args) {
        LongestUniqueSubstring longestUniqueSubstring = new LongestUniqueSubstring();
        System.out.println(longestUniqueSubstring.longestUniqueSubstr("geeksforgeeks"));
        System.out.println(longestUniqueSubstring.longestUniqueSubstr("aaa"));
        System.out.println(longestUniqueSubstring.longestUniqueSubstr("abcdefabcbb"));
    }
}
