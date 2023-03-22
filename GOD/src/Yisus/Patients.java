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
        Range = in.nextInt();
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
