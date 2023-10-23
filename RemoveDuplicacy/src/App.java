public class App {
    public static boolean[] map = new boolean[26];

    public static void removeDuplcate(String str, int idx, String newString) {
        if(idx >= str.length()) {
            System.out.println(newString);
            return;
        }

        if(map[str.charAt(idx) - 'a'] == true) {
        } else {
            newString += str.charAt(idx);
            map[str.charAt(idx) - 'a'] = true;
        }

        removeDuplcate(str, idx+1, newString);
    }
    public static void main(String[] args) throws Exception {
        String str = "abbccda";
        removeDuplcate(str, 0, "");
    }
}
