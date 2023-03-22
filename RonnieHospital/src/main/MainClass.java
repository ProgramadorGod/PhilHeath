package main;
import Heredity.StepDaughter;
import Heredity.Daughter;
import java.util.Scanner;


public class MainClass {
    private static int option;
    public static void main(String[] args) {
        while (true){
            Scanner in = new Scanner(System.in);
            System.out.print("\nCHOOSE | 1(Sum) / 2(Subtract) / 3(Exit) | : ");
            option = in.nextInt();

            switch (option){
                case 1:
                    StepDaughter SumObj = new StepDaughter();
                    break;
                case 2:
                    Daughter RestObject = new Daughter();
                    break;
                default:
                    System.out.println("Thank you by use this program! :D");
                    System.exit(0);
            }
        }
    }

}
