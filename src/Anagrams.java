import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;

public class Anagrams {
    public ArrayList<ArrayList<String>> anagrams(String[] arr) {
        // A map to group words by their sorted canonical form
        HashMap<String, ArrayList<String>> map = new HashMap<>();

        // Iterate over each string in the array
        for (String word : arr) {
            // Sort the characters of the word to get the canonical form
            char[] charArray = word.toCharArray();
            Arrays.sort(charArray);
            String sortedWord = new String(charArray);

            // Add the word to the corresponding group in the map
            map.putIfAbsent(sortedWord, new ArrayList<>());
            map.get(sortedWord).add(word);
        }

        return new ArrayList<>(map.values());
    }

    public static void main(String[] args) {
        Anagrams anagrams = new Anagrams();
        String[] input = {"act", "god", "cat", "dog", "tac"};
        ArrayList<ArrayList<String>> result = anagrams.anagrams(input);

        System.out.println(result);
    }
}
