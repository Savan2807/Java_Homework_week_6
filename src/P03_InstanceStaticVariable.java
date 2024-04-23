
/*
Write a Java programme using the following steps.
        Declare one instance and one static variable.
        Declare one instance method.
        Declare one static method.
        Call both instance and static variables into both instance and static methods inside the
        print statement.
        Declare the Main method.
        Call both instance and static methods into the Main method and run the programme.
*/


public class P03_InstanceStaticVariable {
    //Declare one instance and one static variable.
    int a = 1; // instance variable
    static int b = 2; // static variable

    //Declare one instance method
    public void instance_number() {
        System.out.println("Instance_number A:- "+a);
        P03_InstanceStaticVariable p03_instanceStaticVariable = new P03_InstanceStaticVariable();
        System.out.println("Instance_number B:- "+p03_instanceStaticVariable.b);
    }

    // Declare one static method.
    public static void static_number() {
        P03_InstanceStaticVariable p03_instanceStaticVariable = new P03_InstanceStaticVariable();
        System.out.println("Static_number A:- "+p03_instanceStaticVariable.a);
        System.out.println("Static_number B:- "+b);
    }

    // Declare the Main method.
    public static void main(String[] args) {

        //   Call both instance and static methods into the Main method and run the programme.
        static_number();
        P03_InstanceStaticVariable p03_instanceStaticVariable = new P03_InstanceStaticVariable();
        p03_instanceStaticVariable.instance_number();
    }
}
