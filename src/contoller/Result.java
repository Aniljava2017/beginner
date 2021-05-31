package contoller;

public class Result {

    public String Checkresult(int division){
    // if contidition () {}

        String message;
        if (division<33){
            message="Fail";
        }
        else if (division >33 && division <=45){
            message="Third Division";
        }
        else if(division >45 && division <60){
            message="Second Division";
        }
        else {
            message="First Division";
        }
        return message;
    }
    public static void main(String args[]){
        Result obj=new Result();
        // Checkresult Store the Show Object

        String show= obj.Checkresult(35);
        // Print Division Condition
        System.out.println(show);
        System.out.println("*****************************");

        show= obj.Checkresult(46);
        System.out.println(show);
        System.out.println("*****************************");

        show= obj.Checkresult(60);
        System.out.println(show);
    }
}
