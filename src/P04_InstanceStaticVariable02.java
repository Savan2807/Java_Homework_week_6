
/*Write a Java programme using the following steps.
        Declare two instance and two static variables.
        Declare one instance method.
        Declare one static method.
        Call all four instance and static variables into both instance and static methods inside the
        print statement.
        Declare the Main method.
        Call both instance and static methods into the Main method and run the programme.*/

public class P04_InstanceStaticVariable02 {

    //Declare two instance and two static variables.
    int a = 1; //instance variables
    int b = 2; //instance variables
    static int c = 3; //static variables
    static int d = 4; //static variables

    //Declare one instance method
    public void instance_number() {
        System.out.println("-------Instance method value-------");
        System.out.println("instance_number A:- " + a);
        System.out.println("instance_number B:- " + b);
        P04_InstanceStaticVariable02 p04_instanceStaticVariable02 = new P04_InstanceStaticVariable02();
        System.out.println("instance_number C:- " + p04_instanceStaticVariable02.c);
        System.out.println("instance_number D:- " +p04_instanceStaticVariable02.d);
    }

    //Declare one static method
    public static void static_number() {
        System.out.println("--------Static method value------");
        P04_InstanceStaticVariable02 p04_instanceStaticVariable02 = new P04_InstanceStaticVariable02();
        System.out.println("static_number A:- " + p04_instanceStaticVariable02.a);
        System.out.println("static_number B:- " + p04_instanceStaticVariable02.b);
        System.out.println("static_number C:- " + c);
        System.out.println("static_number D:- " + d);

    }

    public static void main(String[] args) {
        static_number();
        P04_InstanceStaticVariable02 p04_instanceStaticVariable02 = new P04_InstanceStaticVariable02();
        p04_instanceStaticVariable02.instance_number();

    }

}
