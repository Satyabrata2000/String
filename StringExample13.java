package String;

//String.split() method

import java.util.Arrays;

public class StringExample13 {

    public static void main(String[] args) {

        String text = new String("This is an original string");
        String[] sentences = text.split("an");
        System.out.println(text);
        System.out.println(sentences);
        System.out.println(Arrays.toString(sentences));
    }
}
