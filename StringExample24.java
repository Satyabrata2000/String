package String;

//Java toString method

public class StringExample24 {

    int rollno;
    String name;
    String city;

    StringExample24(int rollno, String name, String city){
        this.rollno = rollno;
        this.name = name;
        this.city = city;
    }

    public String toString(){ //Overriding toString method
        return rollno+ " " + name + " " + city;
    }

    public static void main(String[] args) {
        StringExample24 obj = new StringExample24(200, "asd", "zxc");
        System.out.println(obj);
    }
}
