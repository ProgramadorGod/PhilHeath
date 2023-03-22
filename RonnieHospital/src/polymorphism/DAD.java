package polymorphism;

import java.util.Scanner;

public abstract class DAD {
    protected int Num1,Num2,Kabum;
    Scanner in  = new Scanner(System.in);

    public void AskData(){
        System.out.print("Give the first number: ");
        Num1 = in.nextInt();
        System.out.print("\nGive the second number: ");
        Num2 = in.nextInt();
    }

    public abstract void Operations();

    public void ShowKabum(){
        System.out.println("The result is : " + Kabum);
    }

    public DAD(){
        AskData();
        Operations();
        ShowKabum();
    }

}

