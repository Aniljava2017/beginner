public class Student {

    String name;
    int age;
    String college;

    public Student(){}// default constructor

    //parameterized constructor
    public Student(String name, int age, String college) {
        this.name = name;
        this.age = age;
        this.college = college;
    }


    // datatype var_name

    public void dispayInfo(Student student){

        System.out.println(" INSIDE FUNCTION Student name is --" +student.name);
        System.out.println(" INSIDE FUNCTION Student age is --" +student.age);
        System.out.println(" INSIDE FUNCTION Student college is --" +student.college);

    }

    public Student getStudent(Student student){

        student.name="Test";
        student.age=24;
        student.college="Test";
        System.out.println(" INSIDE getStudent FUNCTION Student name is --" +student.name);
        System.out.println(" INSIDE getStudent FUNCTION Student age is --" +student.age);
        System.out.println(" INSIDE getStudent FUNCTION Student college is --" +student.college);
        return student;
    }

    public static void main (String []args){



    Student object =new Student("Yogesh",25,"AGRA College");

    System.out.println(" Student name is --" +object.name);
    System.out.println(" Student age is --" +object.age);
    System.out.println(" Student college is --" +object.college);

        object.name="Raj";
        object.age=27;
        object.college="UPTU";

        System.out.println(" after update Student name is --" +object.name);
        System.out.println(" after update Student age is --" +object.age);
        System.out.println("  after updateStudent college is --" +object.college);

     Student student=new Student("Ramesh",23,"BHU");
        student.dispayInfo(student);

        Student result=student.getStudent(student);
        System.out.println(" result Student name is --" +result.name);
        System.out.println(" result update Student age is --" +result.age);
        System.out.println("  result updateStudent college is --" +result.college);



    }
}
