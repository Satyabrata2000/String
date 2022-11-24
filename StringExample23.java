package String;

//Understanding problem without toString method

public class StringExample23 {

    int rollno;
    String name;
    String city;

    StringExample23(int rollno, String name, String city){
        this.rollno = rollno;
        this.name = name;
        this.city = city;
    }

    public static void main(String[] args) {

        StringExample23 obj1 = new StringExample23(101, "ABC", "XYZ");
        System.out.println(obj1);
    }
}
