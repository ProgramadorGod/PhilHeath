package homework;
import java.util.ArrayList;

public class Users {
    protected int age;
    private int interpreter;
    private String[] UserStuff = new String[4];
    protected String name, address, occupation;
    private ArrayList<String> UserProps = new ArrayList<String>();
    private ArrayList<ArrayList<String>> UsersList = new ArrayList<ArrayList<String>>();




    public Users(String name,String address, String occupation, int age){
        this.name = name;
        this.address = address;
        this.occupation = occupation;
        this.age = age;


    }

    public Users() {

    }


    private void CreateUser(){
        UserStuff[0] = name;
        UserStuff[1] = address;
        UserStuff[2] = occupation;
        UserStuff[3] = String.valueOf(age);
        for (int i = 0; i < UserStuff.length; i++) {
            UserProps.add(UserStuff[i]);
        }

        UsersList.add(UserProps);
    }

    public void Execute(){
        CreateUser();


    }

    public ArrayList<String> getUserProps() {
        return UserProps;
    }



}
