public class Cal{

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
    public int multiplication (int a , int b ){
        int mul;
        mul=a*b;
        return mul;
    }
    public int divide (int a , int b ){
        int div;
        div=a/b;
        return div;
    }

    public static void main(String args[]){

        Cal obj=new Cal();
        int sum=obj.addition(10,5);
        System.out.println("Addition Value :- "+sum);

        int sub=obj.subtract(10,5);
        System.out.println("Subtract Value :- "+sub);

        int mul=obj.multiplication(10,5);
        System.out.println("Multiplication Value :- "+mul);

        int div=obj.divide(10,5);
        System.out.println("Divide Value :- "+div);
    }
}