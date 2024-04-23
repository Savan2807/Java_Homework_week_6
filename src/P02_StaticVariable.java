/*
        Write a Java programme using the following steps.
        Declare two static variables
        Declare one static method
        Call both static variables into the static method inside the print statement.
        Declare the Main method.
        Call the static method into the Main method and Run the programme.
        */

public class P02_StaticVariable {
    //Declare two static variables
    static String name = "savan";
    static String surname = "kakadiya";

    //Declare one static method
    public static void data() {
        // Call both static variables into the static method inside the print statement.
        System.out.println("User_Name:- " + name);
        System.out.println("User_Surname:- " + surname);
    }

    //Declare the Main method.
    public static void main(String[] args) {
        //  Call the static method into the Main method and Run the programme.
        data();
    }
}
