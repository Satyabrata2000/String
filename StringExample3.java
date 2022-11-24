package String;

//String equals() method

public class StringExample3 {

    public static void main(String[] args) {

        String s1= "String 1";
        String s2= "String 1";
        String s3 = new String("String 1");
        String s4 = "String 2";

        System.out.println(s1.equals((s2)));
        System.out.println(s1.equals((s3)));
        System.out.println(s1.equals((s4)));

        String s5 = "String 3";
        String s6 = "STRING 3";
        System.out.println(s5.equals(s6));
        System.out.println(s5.equalsIgnoreCase(s6));
    }
}
