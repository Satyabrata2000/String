package String;

//== operator

public class StringExample4 {

    public static void main(String[] args) {

        String s1 = "String 1";
        String s2 = "String 1";
        String s3 = new String("String 1");
        System.out.println(s1 == s2); //true because both refer to same instance
        System.out.println(s1 == s3); //false because s3 refers to instance created in non pool
    }

}

