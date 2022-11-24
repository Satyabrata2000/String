package String;

//count no of words in a string

public class StringExample14 {

    public static void main(String[] args) {

        String s = "This is a beautiful day outside when the sun is warm and the clouds are down.";
        String words[] = s.split(" ");
        System.out.println("The no of words in the strings is  " + words.length);
    }
}
