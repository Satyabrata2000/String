package String;

//String concatenation using String.join() method

public class StringExample11 {

    public static void main(String[] args) {

        String s1 = new String("String 1");
        String s2 = new String("String 2");
        String s = String.join(" ", s1, s2);
        System.out.println(s);
    }
}
