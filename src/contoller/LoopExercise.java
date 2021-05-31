package contoller;
/* todo DEBUGGING : f7, f8 and f9
      f7----> take you to inside a method
      f8----> line by line execution
      f9----> break point to breakpoint execution
 */

public class LoopExercise {

    public void forLoopWorking() {
        // normal for loop Syntax : for( initial value ; condition; increment/decrement)

        for (int i = 0; i < 10; i++) {

            System.out.println("Value of i is -->" + i);
        }
        for (int i = 10; i > 0; i--) {

            System.out.println("Value of i is -->" + i);
        }
    }


    public void whileLoopWorking(){
        //Syntax : while loop    while(condition){ ++ }
        int i = 1;
        while (i < 10) {
            System.out.println("inside While Loop :::: Value of i is -->"+i);
            i++;
        }
    }


// for each loop or Advance Loop
        public void forEachLoopWorking() {
            int[] numbers = {10, 20, 30, 40, 50};
            String [] names= {"Ram","John","Anwar","Amit","Rahul","Ramesh"};

// Syntax :  for (datatype variable_name : collection/array) {}
            for (int x : numbers) {
                System.out.println("Inside Advance for Loop:::: " + x);
                System.out.print(",");
            }
            for (String x : names) {
                System.out.println("Inside advance for loop:   "+x);
                System.out.print(",");
            }


        }


    public static void main(String[] args) {
        //object creation
        LoopExercise obj = new LoopExercise();
        // method calling
       // obj.forLoopWorking();
        obj.whileLoopWorking();
       // obj.forEachLoopWorking();

    }

}
