package contoller;

import java.util.Scanner;

public class Loopdemo {

    // For Loop Example
    public void Forloop(){
        int n,i;
        // Use Scanner Console Screen Input value object
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the number");
        // Console Screen Input the n Value
        n=sc.nextInt();
        for (i=1;i<=10;i++)
            System.out.println(n+" * "+ i +" = "+n*i);
    }

    // While Loop Example
    public void Whileloop(){
        int n,i=1;
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the number");
        n=sc.nextInt();
        while (i<=10) {
            System.out.println(n + " * " + i + " = "+n*i);
            i++;
        }
    }

    // ForEachLoop
    public void ForEachLoop(){
        int[] numbers = {5,10,15,20,25};
        String[] name = {"Anil","Bunty","Munesh","Saurabh","Shubham"};
        for (int x : numbers){
            System.out.println("Show ID Number :- " + x);
        }
        for (String x : name){
            System.out.println("Show Employee Name :- " + x);
        }
    }

    // Factorial
    public void Factorial(){
        int i,fact=1,n;
        System.out.println("Enter the Number");
        Scanner sc=new Scanner(System.in);
        n=sc.nextInt();
        for (i=1;i<=n;i++){
            fact=fact*i;
        }
        System.out.println("Factorial "+ n +  " is "+ fact);

    }
    public static void main(String args[]){
        Loopdemo obj=new Loopdemo();

       // obj.Forloop();

       // obj.Whileloop();

      //  obj.Factorial();

        obj.ForEachLoop();

        System.out.println(" ***** Thank for using *****");
    }
}
