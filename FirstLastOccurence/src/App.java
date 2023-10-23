public class App {

    public static int first = -1;
    public static int last = -1;

    public static void FindOccurence(String s, char c, int n) {

        if(n > s.length()-1) {
            System.out.println(first);
            System.out.println(last);
            return;
        }

        if(s.charAt(n) == c) {

            if(first == -1) {
                first = n;
            } else {
                last = n;
            }
        }

        FindOccurence(s, c, n+1);
    }

    public static void main(String[] args) {
        String s = "abcda";
        char ch = 'a';
        FindOccurence(s, ch, 0);
    }
}
