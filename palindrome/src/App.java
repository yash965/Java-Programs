public class App {

    public boolean Helper(int start, int end, String n){
        if(start >= end){
            return true;
        }

        if(n.charAt(start) != n.charAt(end)){
            return false;
        }

        return Helper(start+1, end-1, n);

    }

    public String RemoveSpaces(String s){
        s = s.replaceAll("\\s", "");
        s.toLowerCase();
        return s;
    }

    public static void main(String[] args){
        System.out.println("Hello, World!");
    }
}
