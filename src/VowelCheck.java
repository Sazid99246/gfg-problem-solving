public class VowelCheck {
    String isVowel(char c){
        c = Character.toLowerCase(c);
        if (c == 'a' || c == 'e' || c == 'i' || c == 'o' || c == 'u') {
            return "YES";
        } else {
            return "NO";
        }
    }

    public static void main(String[] args) {
        VowelCheck obj = new VowelCheck();
        System.out.println(obj.isVowel('a'));
    }
}
