import java.util.Scanner;

public class Calculator {
    public int addition(int a , int b){
        int sum;
        sum=a+b;
        return sum;
    }
    public int subtract(int a , int b){
        int sub;
        sub=a-b;
        return sub;
    }
    public int multiplication(int a , int b){
        int mul;
        mul=a*b;
        return mul;
    }
    public int divide(int a , int b){
        int div;
        div=a/b;
        return div;
    }

    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        Calculator cl=new Calculator();
        System.out.println("1. Addition\n2. Subtract\n3. Multiplication\n4. Divide");
        int choice= sc.nextInt();
        switch (choice)
        {
            case 1:
                System.out.println("Enter Two Number");
                int a,b;
                a= sc.nextInt();
                b= sc.nextInt();
                int sum=cl.addition(a,b);
                System.out.println("Addition Value :- "+sum);
                break;
            case 2:
                System.out.println("Enter Two Number");
                int c,d;
                c= sc.nextInt();
                d= sc.nextInt();
                int sub=cl.subtract(c,d);
                System.out.println("Subtract Value :- "+sub);
                break;
            case 3:
                System.out.println("Enter Two Number");
                int e,f;
                e= sc.nextInt();
                f= sc.nextInt();
                int mul= cl.multiplication(e,f);
                System.out.println("Multiplication Value :- "+mul);
                break;
            case 4:
                System.out.println("Enter Two Number");
                int g,h;
                g= sc.nextInt();
                h= sc.nextInt();
                int div= cl.divide(g,h);
                System.out.println("Multiplication Value :- "+div);
                break;
            default:
                System.out.println("Enter the Valied Choice");
        }
    }
}
