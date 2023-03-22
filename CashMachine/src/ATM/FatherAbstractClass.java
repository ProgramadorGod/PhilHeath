package ATM;
import jdk.dynalink.Operation;

import java.util.Scanner;
public class FatherAbstractClass {
    protected int Transactions, Withdrawal, Deposit;
    private static int Balance;
    Scanner in = new Scanner(System.in);

    public void Operations(){
        int Flag = 0, Selection = 0;
        do {
            System.out.println("\nPlease choose an option     ");
            System.out.println("    1. Balance Consult      ");
            System.out.println("    2. Cash Withdrawal      ");
            System.out.println("    3. Cash Deposit         ");
            System.out.println("    4. Exit                 ");

            System.out.print("Number Option: ");
            Selection = in.nextInt();
            if(Selection > 1 && Selection < 4){
                Flag = 1;
            }else {
                System.out.println("The option you've chosen doesn't exist. Try Again... ");
            }

        }while (Flag == 0);
    }

    public static void main(String[] args) {
        FatherAbstractClass a = new FatherAbstractClass();
        a.Operations();
    }

}
