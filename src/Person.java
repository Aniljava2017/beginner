public class Person {
    String name;
    int age;
    String gender;
    String habbits;

    // study,eat,drink,sleep

    public void study(){

        System.out.println("This is a study Function ......");
    }

    public void eat(){

        System.out.println("This is a eat Function ......");
    }

    public void drink(){

        System.out.println("This is a drink Function ......");
    }

    public void sleep(){

        System.out.println("This is a sleep Function ......");
    }

    public static void main(String args[]){
        Person obj=new Person();
        obj.study();
        obj.eat();
        obj.drink();
        obj.sleep();

    }
}
