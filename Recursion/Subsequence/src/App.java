public class App {

    public static void subseq(String str, int idx, String newString) {

        if(idx == str.length()) {
            System.out.println(newString);
            return;
        }

        // to add
        subseq(str, idx+1, newString + str.charAt(idx));
        
        // to not add
        subseq(str, idx+1, newString);
    }
    public static void main(String[] args) throws Exception {
        String str = "abc";
        subseq(str, 0, "");
    }
}
