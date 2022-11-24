package String;

//String concatenation using StringBuilder class

public class StringExample9 {

    public static void main(String[] args) {

        StringBuilder s1 = new StringBuilder("String1");
        StringBuilder s2 = new StringBuilder("String2");
        StringBuilder s = s1.append(s2);
        System.out.println(s);
    }
}
