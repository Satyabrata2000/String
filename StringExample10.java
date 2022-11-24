package String;

//String concatenation using format() method

public class StringExample10 {

    public static void main(String[] args) {

        String s1 = new String("String 1");
        String s2 = new String("String 2");
        String s = String.format("%s%s", s1, s2);
        System.out.println(s);
    }
}
