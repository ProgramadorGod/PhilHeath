package NewTry;

import java.util.Scanner;
import java.lang.reflect.Field;

public class User {
    protected String Name, Address, ID, PhoneNumber;
    protected int Age, Height, Weight;


    public User() throws IllegalAccessException{

    }

    public void GetUserDates() throws IllegalAccessException {
        Scanner in = new Scanner(System.in);
        User user1 = new User();
        Class<?> myClass = user1.getClass();
        Field[] fields = myClass.getDeclaredFields();
        for (Field field : fields) {
            System.out.print(field.getName() + " : ");
            if (field.getType() == int.class) {
                boolean ValidInt = false;

                while (!ValidInt) {
                    try {
                        int IntValue = in.nextInt();
                        field.setAccessible(true);
                        field.set(user1, IntValue);
                        ValidInt = true;
                    } catch (Exception e) {
                        if (field.getName() == "Height") {
                            System.out.println("Insert the height in Centimeters...");
                        }

                        System.out.print("Please insert a valid int value to " + field.getName() + ": ");
                        in.nextLine();
                    }
                }

            } else {
                String Value = "";
                while (Value == "") {
                    Value = in.nextLine();
                    field.setAccessible(true);
                    field.set(user1, Value);
                    if (Value == "") {
                        System.out.print("Please insert a valid " + field.getName() + " : ");
                    }
                }
            }
        }
    }










}
