public class App {

    public static void PrintPermutation(String str, String newString) {

        if(str.length() == 0) {
            System.out.println(newString);
            return;
        }

        for(int i=0; i<str.length(); i++) {
            char currChar = str.charAt(i);

            String newPermute = str.substring(0, i) + str.substring(i+1);
            PrintPermutation(newPermute, newString+currChar);
        }
    }

    public static void main(String[] args) throws Exception {
        String str = "abcd";
        PrintPermutation(str, "");
    }
}
