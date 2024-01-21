public class CharacterClass {
    public static void main(String[] args) {
        String s1 = "Hello everyone";
        String s2 = "yoo bantai";

        String concat = s1.concat(s2);
        System.out.println(concat);

        concat = s1.substring(0, 6);
        System.out.println(concat);

        System.out.println(s2.endsWith("i"));

        System.out.println(s1.compareTo(concat));
    }
}
