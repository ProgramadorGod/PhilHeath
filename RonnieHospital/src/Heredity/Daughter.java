package Heredity;

public class Daughter extends FatherClass{

    public void Subtraction(){
        Result = Value1 - Value2;
    }
    public Daughter(){
        AskDates();
        Subtraction();
        System.out.print("The result of the subtract is: " + ShowResult());
    }
}
