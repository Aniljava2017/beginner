import javax.print.Doc;

public class Doctor {
    String name;
    int age;
    String post;
    String Department;

    // hospital,treatment,operation

    public void hospital(){

        System.out.println("This is a Hospital Function......");
    }

    public void treatment(){

        System.out.println("This is a Treatment Function.....");
    }

    public void operation(){

        System.out.println("This is a Operation Function.....");
    }

    public static void main(String args[]){
        Doctor obj=new Doctor();
        obj.hospital();
        obj.treatment();
        obj.operation();
    }
}
