public class App {

    public static void Reverse(char[] s, int start, int end){
        if(start >= end){
            return;
        }

        char temp = s[end];
        s[end] = s[start];
        s[start] = temp;

        Reverse(s, start+1, end-1);

    }

    public static void ReversePrint(String s, int n){

        if(n < 0){                     //Base case
            return;
        }

        System.out.print(s.charAt(n));  // small calculations

        ReversePrint(s, n-1);           // Recursive call
    }

    public static void main(String[] args){
        String s = "abcd";
        ReversePrint(s, s.length()-1);

        /* char[] ch = s.toCharArray();

        Reverse(ch, 0, s.length()-1);
        System.out.println(ch);*/
    }
}
