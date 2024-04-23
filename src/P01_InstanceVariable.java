
/*
        Write a Java programme using the following steps.
        Declare two instance variables.
        Declare one instance method.
        Call both instance variables into the instance method inside the print statement.
        Declare the Main method.
        Call the above instance method into the Main method and Run the programme.
*/


public class P01_InstanceVariable {
    //two instance variables
    int a = 10;
    String name = "savan";

    //one instance method
    public void setInstaceValue() {
        // Call both instance variables into the instance method inside the print statement.
        System.out.println("Value of a:- "+ a);
        System.out.println("Value of name:-"+ name);
    }


    // Declare the Main method.
    public static void main(String[] args) {
        //Call the above instance method into the Main method and Run the programme
        P01_InstanceVariable p01_instanceVariable = new P01_InstanceVariable();
        p01_instanceVariable.setInstaceValue();
    }
}
