package String;

//String intern method

public class StringExample20 {

    public static void main(String[] args) {

        String s = new String("This is a string");
        String s1 = s.intern();
        System.out.println(s);
        System.out.println(s1);
    }
}

//When the intern method is invoked, if the pool already contains a String equal to this String object
// as determined by the equals(Object) method, then the String from the pool is returned.
// Otherwise, this String object is added to the pool and a reference to this String object is returned.