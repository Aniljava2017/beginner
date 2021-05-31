package contoller;

public class Employee {

     String name;
     int age;
     String post;

     public Employee(){} // Default Constructor

    // Parameterised constructor


    public Employee(String name, int age, String post) {
        this.name = name;
        this.age = age;
        this.post = post;
    }

    //  datatype var_name
    // int a
    public void displayInfo(Employee employee){
        System.out.println("Inside Function Employee Name:- "+employee.name);
        System.out.println("Inside Function Employee Name:- "+employee.age);
        System.out.println("Inside Function Employee Name:- "+employee.post);
    }
    // getEmployee Return Statement
    public Employee getEmployee(Employee employee){
        employee.name="Saurabh Sehra";
        employee.age=23;
        employee.post="Senior Developer";
        System.out.println("Inside getEmployee Employee Name:- "+employee.name);
        System.out.println("Inside getEmployee Employee Name:- "+employee.age);
        System.out.println("Inside getEmployee Employee Name:- "+employee.post);
        return employee;
    }

    public static void main(String[] args){

        Employee object = new Employee("Anil",23,"Manager");

        System.out.println("Employee Name is :-"+object.name);
        System.out.println("Employee Age is :-"+object.age);
        System.out.println("Employee Post is :-"+object.post);

        System.out.println("**********************************************");

        // After Update
        object.name="Bunty";
        object.age=23;
        object.post="Full Stack Developer";

        System.out.println("After Update");
        System.out.println("Employee Name is :-"+object.name);
        System.out.println("Employee Age is :-"+object.age);
        System.out.println("Employee Post is :-"+object.post);
        System.out.println("**********************************************");

        // Inside Function
        System.out.println("After Inside Function Update");
        Employee employee =new Employee("Munesh",23,"Java Developer");
        employee.displayInfo(employee);
        System.out.println("**********************************************");

        // getEmployee Function
        System.out.println("After getEmployee Function Update");
        Employee result=employee.getEmployee(employee);

    }
}
