package Yisus;

import java.util.ArrayList;

public class Patients extends Users{
    private String Disease;
    private int Range;

    protected Patients(){
    }


    @Override
    public ArrayList<String> GenerateObject(){
        System.out.println("New patient inserted... ");
        System.out.println("Now please give us the patient data");
        System.out.print("Patient Disease: ");
        Disease = in.nextLine();
        System.out.println("Patient Range: 1(Maximum priority) / 2(Basic) / 3(Low Priority) ");
        boolean Correct = false;
        while (!Correct){
            try {

                Range = in.nextInt();
                if(Range >= 1 && Range <= 3){
                    Correct = true;

                }else{
                    System.out.print("Please choose one of the possible options (1/2/3): ");
                }
            }catch (Exception e){
                System.out.println("ERROR, Insert a valid number. Try again ...");
                in.nextLine(); //Clean the buffer
            }
        }
        ArrayList<String> User = new ArrayList<>();
        User.add("Patient");
        User.add(this.Name);
        User.add(this.Address);
        User.add(this.ID);
        User.add(String.valueOf(this.age));
        User.add(this.PhoneNumber);
        User.add(this.Disease);
        User.add(String.valueOf(this.Range));
        System.out.println("Patient : "+ User);

        return User;
    }

}
