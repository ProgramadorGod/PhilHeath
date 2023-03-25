package Gigachad;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        int Option = 0;
        Scanner in = new Scanner(System.in);

        System.out.println("========================");
        System.out.println("Dates Programmer System");
        System.out.println("========================");
        System.out.println("");
        System.out.println("Select an option: ");
        System.out.println("1. Add user.");
        System.out.println("2. Get users list");
        System.out.println("3. Program date");
        System.out.println("4. Exit");

        while (Option < 1 || Option >4){
            try {
                System.out.println();
                System.out.print("Your Choose : ");
                Option = in.nextInt();
                if (Option < 1 || Option> 4 ){
                    System.out.println("Error. Try again with a valid option.(1/2/3/4)");
                }
            }catch (Exception e){
                System.out.println("Error. Try again with a valid option.(1/2/3/4)");
                in.nextLine();
            }
        }
        System.out.println("You've chosen the " + Option + " option.");
        if(Option == 1){
            Questioner a = new Questioner();
            a.BasicInfo();
        }
    }
}
