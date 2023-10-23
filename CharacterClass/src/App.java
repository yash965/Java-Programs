import java.lang.Character;

public class App {
    public static void main(String[] args) {
        String word = "Welcome to the class";
        StringBuilder word1 = new StringBuilder();
        word1 = word1.append(word);
        
        int p1 = 0, p2=0;

        for(int i=0; i<word.length(); i++) {
            if(word.charAt(i) == ' ') {
                p2 = i-1;
                while(p2>=p1) {
                    System.out.print(word.charAt(p2));
                    p2--;
                }
                if(i+1 != word.length()) {
                    p1 = i+1;
                    System.out.print(" ");
                }
            }
        }
        p2 = word.length()-1;
        while(p2>=p1) {
            System.out.print(word.charAt(p2));
            p2--;
        }

    }
}
