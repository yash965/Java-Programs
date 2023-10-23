import java.util.HashSet;

public class App {

    public static void uniqSubseq(String str, int idx, String newString, HashSet<String> set) {

        if(idx == str.length()) {
            if(set.contains(newString)) {
                return;
            } else {
                System.out.println(newString);
                set.add(newString);
                return;
            }
        }

        // to add
        uniqSubseq(str, idx+1, newString + str.charAt(idx), set);
        
        // to not add
        uniqSubseq(str, idx+1, newString, set);
    }
    public static void main(String[] args) throws Exception {
        String str = "aaa";
        HashSet<String> set = new HashSet<>();
        uniqSubseq(str, 0, "", set);
    }
}
