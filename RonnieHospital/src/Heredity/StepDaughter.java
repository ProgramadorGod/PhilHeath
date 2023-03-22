package Heredity;

public class StepDaughter extends FatherClass{
    public void Sum(){
        Result = Value1 + Value2;
    }

    public StepDaughter(){
        AskDates();
        Sum();
        System.out.print("The result of the sum is: " + ShowResult());
    }


}
