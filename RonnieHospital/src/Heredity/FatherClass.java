package Heredity;
import java.util.Scanner;

public class FatherClass {
    protected float Value1,Value2,Result;
    Scanner in = new Scanner(System.in);

    public void AskDates(){
        System.out.print("Give me the first value: ");
        Value1 = in.nextFloat();
        System.out.print("Give me the second value: ");
        Value2 = in.nextFloat();
    }

    public float ShowResult(){
        return Result;
    }


}
