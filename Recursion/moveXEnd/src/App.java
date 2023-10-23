public class App {

    public static void MoveAllX(String s, int idx, int count, String newString) {

        if(idx == s.length()) {
            for(int i=0; i<count; i++) {
                newString += 'x';
            }
            System.out.println(newString);
            return;
        }

        if(s.charAt(idx) == 'x') {
            count++;
        } else {
            newString += s.charAt(idx);
        }
        MoveAllX(s, idx+1, count, newString);
    }

    public static void main(String[] args) throws Exception {
        String s = "axbcxxd";
        MoveAllX(s, 0, 0, "");
    }
}
