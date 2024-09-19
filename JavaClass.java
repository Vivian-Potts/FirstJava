public class JavaClass {
    int x = 5;
    public static void main(String args[]){
        System.out.println("Hello world");
        JavaClass myObj = new JavaClass();
        int a = myObj.x;
        int b = a + 2;

        Car redCar = new Car();
        redCar.Colour = "Red";
        redCar.Beep();


        System.out.println(b);
        System.out.println(MyMethod(a));
    }
    static boolean MyMethod(int say){
        System.out.println("Woah, its the number \"" + say + "\"");
        return false;
    }
}
